package com.cxq;

import com.cxq.domain.CheckRecordRepository;
import com.cxq.domain.PictureProperty;
import com.cxq.domain.PicturePropertyRepository;
import com.cxq.domain.UltrasonicDiagnosisReportRepository;
import com.cxq.upload.UploadTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
//@Controller
//@EnableRedisHttpSession
//@ComponentScan( basePackages = "com.cxq.*")
//@ServletComponentScan( basePackages = "com.cxq.*")
//@EnableAutoConfiguration
public class PictureShowApplication {

	private Logger logger = LoggerFactory.getLogger(PictureShowApplication.class);

	public static void main(String[] args) {SpringApplication.run(PictureShowApplication.class, args);}

	@Autowired
	private CheckRecordRepository checkRecordRepository;

    @Autowired
	private PicturePropertyRepository picturePropertyRepository;

    @Value("${picture_path}")
	private String picture_path;

	@Autowired
	private UltrasonicDiagnosisReportRepository ultrasonicDiagnosisReportRepository;


    @RequestMapping(value= "/login" )
	@ResponseBody
    public Map<String, Object> login(HttpServletRequest request){
		Map<String, Object> map = new HashMap<>();

        String username = request.getParameter("name");
		String password=request.getParameter("password");
		if(username.equals("cc")&&password.equals("123")){
			//登陆成功
		  map.put("data",true);
		}else{
			//登陆失败
			map.put("data",false);

		}
//		return map;
		System.out.println("#"+username+"#"+password);
		return map;
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


	//医师护理录
//	@RequestMapping(value = "/addCheck_record" , method = RequestMethod.POST)
//	public Map<String,Object> addCheckRecord(@ModelAttribute CheckRecord checkRecord, HttpServletRequest request) {
//		//4.处理数据,并返回实体给用户,页面通过第一步的"greeting"参数来展示数据
//		String ss = checkRecord.getCard_medical();
//		if(!CommUtil.isBlank(ss)){
//
//		 	checkRecordRepository.save(checkRecord);
//
//		}
//		Map<String,Object> model=new HashedMap();
//		model.put("data",true);
//		return model;
//	}


	//超声波报告
//	@RequestMapping(value = "/addultrasonic_diagnosisReport" , method = RequestMethod.POST)
//	public Map<String,Object> addultrasonic_diagnosisReport(@ModelAttribute UltrasonicDiagnosisReport ultrasonicDiagnosisReport) {
//		Map<String,Object> model1=new HashedMap();
//		String ss1 = ultrasonicDiagnosisReport.getCard_medical();
//		if (!CommUtil.isBlank(ss1)){
//			ultrasonicDiagnosisReportRepository.save(ultrasonicDiagnosisReport);
//			model1.put("data",true);
//
//		}
//
//		model1.put("data",true);
//		return model1;
//	}

}
