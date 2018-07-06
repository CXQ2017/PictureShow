package com.cxq;

import com.cxq.domain.*;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.MultipartConfigElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
@Configurable
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

	@Autowired
	private MedicalRecordRepository medicalRecordRepository;


	@Bean
	public MultipartConfigElement getMultiConfig() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("4000MB");
		factory.setMaxRequestSize("4000MB");
		return factory.createMultipartConfig();
	}

    //PDF标记
	@RequestMapping("/mark_picture")
	public Map<String, Object> PDFMark(){
		HashMap<String,Object> map = new HashMap<>();
		List<PictureProperty> list = picturePropertyRepository.findNoMark();
		if(list.isEmpty()){
			list.add(new PictureProperty());
		}
		map.put("data",list);
		return map;
	}

//    @RequestMapping("/refresh_picture")
//    @ResponseBody
//	public Map<String,Object> refresh_picture(String file_path, String name, String gender, String id_card,
//											  String principal_diagnosis, String only_id){
//
//		Map<String, Object> map = new HashMap<>();
//
//		String path = picture_path + File.separator + file_path;
//		List<PictureProperty> list = UploadTool.getPictureProperty(path, name, gender, id_card, principal_diagnosis, only_id);
//		System.out.println("查找后的list数据保存到数据库");
//		if(list.isEmpty()){
//			System.out.println("查找后的list为空");
//		}else {
//			for(int i =0;i<list.size();i++){
//				List<PictureProperty> li = picturePropertyRepository.findByPath(list.get(i).getPicture_path());
//				if(li.isEmpty()){
//					picturePropertyRepository.save(list.get(i));
//				}else {
//					System.out.println("该图片已存在");
//				}
//			}
//		}
//
//		List<PictureProperty> pictures = picturePropertyRepository.findAll();
//		map.put("data",pictures);
//
//		return map;
//	}

	//获取审核列表请求
	@RequestMapping(value = "/audit_list" ,method = RequestMethod.POST)
	public Map<String, Object> auditList(){
		Map<String,Object> map = new HashMap();
		List<MedicalRecord> list = medicalRecordRepository.find_audit();
		System.out.println(list);
		map.put("data",list);
		return map;
	}

	//获取查询列表请求
	@RequestMapping(value = "/search_list" ,method = RequestMethod.POST)
	public Map<String, Object> searchList() {
		Map<String, Object> map = new HashMap();
		List<MedicalRecord> list = medicalRecordRepository.find_search();
		System.out.println(list);
		map.put("data", list);
		return map;
	}

	//获取pdf列表请求
	@RequestMapping("/pdf_list")
	public Map<String, Object> PDFList(){
		HashMap<String,Object> map = new HashMap<>();
        List<PictureProperty> list = picturePropertyRepository.findListKeyword();
		if(list.isEmpty()){
			list.add(new PictureProperty());
		}
		map.put("data",list);
		return map;
	}


	@RequestMapping("/first_findall")
	public Map<String,Object> first_findall(){
		List <MedicalRecord> list=medicalRecordRepository.find_allmsg();
		Map<String ,Object> map1=new HashedMap();
		map1.put("data",list);

		return map1;
	}

}
