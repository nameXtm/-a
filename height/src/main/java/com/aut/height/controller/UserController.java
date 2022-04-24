package com.aut.height.controller;

import com.aut.height.mapper.WeightMapper;
import com.aut.height.pojo.Weight;
import com.mysql.cj.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController  {

    @Autowired
    WeightMapper weightMapper;

    @GetMapping("/")
    public String User01(){
        return "loge";
    }

//    @GetMapping("/loge")
//    @ResponseBody
//    public String user02(@PathVariable("name")String name ,
//                      @PathVariable("age") int age,
//                      @PathVariable("weight") String weight,
//                      Model model){
//
//        HashMap<Object, Object> map = new HashMap<>();
//
//        map.put("name",name);
//        return "map";
//    }
    @GetMapping("/loge")
    @ResponseBody
    public String user02(
         @RequestParam("name")String name,
//                      @RequestParam("age") String age,
//                      @RequestParam("weight") Integer weight,
//                      @RequestParam("password") String password,
                      Model model,
                      HttpServletResponse response
                        ) throws IOException {

//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("name",name);
//       map.put("age",age);
//       map.put("weight",weight);
//       map.put("password",password);
        float v = Float.parseFloat(name);
        float i = v-100;
        float j = i*0.9f;
        String s = String.valueOf(j);

        Weight weight = new Weight();
        weight.setWeight(s);
        weightMapper.insert(weight);




      return  "您的标准体重为"+s+"千克";
//        return ;
    }
}
