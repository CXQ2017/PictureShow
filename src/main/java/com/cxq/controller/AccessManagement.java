package com.cxq.controller;

import com.cxq.domain.User;
import com.cxq.domain.UserRepository;
import net.sf.json.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Created by Administrator on 2018/7/2/002.
 */
@Controller
public class AccessManagement {
    @Autowired
    private UserRepository userRepository;

    //新增用户
    @ResponseBody
    @RequestMapping("/add_user")
    public JSONObject add_user(@ModelAttribute User user){
        JSONObject jsonObject=new JSONObject();
        String username=user.getUser_name();
        if(userRepository.findByName(username).isEmpty()){
            userRepository.save(user);
//            response.setContentType("text/html;charset=utf-8");
//            PrintWriter out = response.getWriter();
           jsonObject.put("data","添加成功");
        }else{
            jsonObject.put("data","用户名已存在");
        }

        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/all_users")
    public Map<String,Object> all_users(){
        Map<String,Object> map=new HashedMap();
        List<User> users=userRepository.findAll();
        //System.out.println("用户+"+users.get(0).getUser_name());
        if (users.isEmpty()){
            users=new ArrayList<>();
            map.put("data",users);
        }
        map.put("data",users);
        return map;
    }

    @ResponseBody
    @RequestMapping("/user_delete")
    public JSONObject  user_delete(HttpServletRequest request){
        JSONObject jsonObject=new JSONObject();
         String s= request.getParameter("id");
       // System.out.println(s);
//        Integer id=Integer.parseInt(s);
        Long id=Long.parseLong(s);
    //   userRepository.deleteuserById(id);
        userRepository.delete(id);
        jsonObject.put("SUCCESS","更新成功");
        return jsonObject;
    }

    //修改

    @RequestMapping("/user_edit")
    public String user_edit(HttpServletRequest request, Model model){
        String s= request.getParameter("id");
        Long id=Long.parseLong(s);
        User user=userRepository.findOne(id);
        int status=user.getStatus();
        //0--管理员，1---审核人员，2---录入员，3---普通用户
         if(status==0){
            model.addAttribute("status","管理员");
        }else if(status==1){
            model.addAttribute("status","审核员");
        }else if(status==2){
            model.addAttribute("status","录入员");
        }else{
            model.addAttribute("status","普通用户");
        }

        model.addAttribute("user",user);

        return "modify_user";
    }
    //修改用户
    @RequestMapping("/modify_user")
    public String modify_user(@Autowired User user,HttpServletRequest request,Model model){
       userRepository.saveAndFlush(user);
        String username = request.getSession().getAttribute("username").toString();
        String password = request.getSession().getAttribute("password").toString();
       // System.out.println("username = "+username);
        List<User> listuser = userRepository.finduser(username,password);
        model.addAttribute("listuser",listuser.get(0));
        return "Access_management";
    }
        @RequestMapping("/return_access")
    public String return_access(HttpServletRequest request,Model model){
            String username = request.getSession().getAttribute("username").toString();
            String password = request.getSession().getAttribute("password").toString();
            List<User> listuser = userRepository.finduser(username,password);
            model.addAttribute("listuser",listuser.get(0));
            return "Access_management";
        }

//    public static void pdfToImage(String pdfPath){
//        try{
//            if(pdfPath==null||"".equals(pdfPath)||!pdfPath.endsWith(".pdf"))
//                return;
//            //图像合并使用参数
//            int width = 0; // 总宽度
//            int[] singleImgRGB; // 保存一张图片中的RGB数据
//            int shiftHeight = 0;
//            BufferedImage imageResult = null;//保存每张图片的像素值
//            //利用PdfBox生成图像
//            PDDocument pdDocument = PDDocument.load(new File(pdfPath));
//            PDFRenderer renderer = new PDFRenderer(pdDocument);
//            //循环每个页码
//            for(int i=0,len=pdDocument.getNumberOfPages(); i<len; i++){
//                BufferedImage image=renderer.renderImageWithDPI(i, DEFAULT_DPI,ImageType.RGB);
//                int imageHeight=image.getHeight();
//                int imageWidth=image.getWidth();
//                if(i==0){//计算高度和偏移量
//                    width=imageWidth;//使用第一张图片宽度;
//                    //保存每页图片的像素值
//                    imageResult= new BufferedImage(width, imageHeight*len, BufferedImage.TYPE_INT_RGB);
//                }else{
//                    shiftHeight += imageHeight; // 计算偏移高度
//                }
//                singleImgRGB= image.getRGB(0, 0, width, imageHeight, null, 0, width);
//                imageResult.setRGB(0, shiftHeight, width, imageHeight, singleImgRGB, 0, width); // 写入流中
//            }
//            pdDocument.close();
//            File outFile = new File(pdfPath.replace(".pdf", "_"+DEFAULT_DPI+".jpg"));
//            ImageIO.write(imageResult, "jpg", outFile);// 写图片
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

//    }

}
