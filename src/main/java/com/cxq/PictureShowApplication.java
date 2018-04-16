package com.cxq;

import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import com.cxq.upload.UploadTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableRedisHttpSession
public class PictureShowApplication {

	private Logger logger = LoggerFactory.getLogger(PictureShowApplication.class);

	public static void main(String[] args) {SpringApplication.run(PictureShowApplication.class, args);}

    @Autowired
	private PicturePropertyRepository picturePropertyRepository;

    @Value("${picture_path}")
	private String picture_path;


	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request){
		Map<String, Object> model = new HashMap<String, Object>();
		String username = request.getParameter("name");
		model.put("data", true);
		return model;
	}

    @RequestMapping("/refresh_picture")
    @ResponseBody
	public Map<String,Object> refresh_picture(String file_path, String name, Integer gender, Integer id_card,
											  String principal_diagnosis, Long only_id){

		Map<String, Object> map = new HashMap<>();

		String path = picture_path + File.separator + file_path;
		List<PictureProperty> list = UploadTool.getPictureProperty(path, name, gender, id_card, principal_diagnosis, only_id);
		System.out.println("查找后的list数据保存到数据库");
		if(list.isEmpty()){
			System.out.println("查找后的list为空");
		}else {
			for(int i =0;i<list.size();i++){
				List<PictureProperty> li = picturePropertyRepository.findByPath(list.get(i).getPicture_path());
				if(li.isEmpty()){
					picturePropertyRepository.save(list.get(i));
				}else {
					System.out.println("该图片已存在");
				}
			}
		}

		List<PictureProperty> pictures = picturePropertyRepository.findAll();
		map.put("data",pictures);

		return map;
	}




}
