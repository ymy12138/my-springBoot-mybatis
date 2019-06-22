package com.ymy.controller;

import com.ymy.entity.Girl;
import com.ymy.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/girl")
public class GirlController {
    @Autowired
    GirlService girlService;
    @PostMapping("/addGirl")
    public String addGirl(Girl girl){
        girlService.addGirl(girl);
        return "添加成功";
    }
    @DeleteMapping("/delGirl")
    public String delGirl(int id){
        girlService.delGirl(id);
        return "删除成功";
    }
    @PutMapping("/updGirl")
    public String upd(Girl girl){
        girlService.updGirl(girl);
        return "删除成功";
    }
    @GetMapping("/getGirlById")
    public String getGirlById(int id, Map<String,Object> map){
        System.out.println(girlService.getGirlById(id).getName());
        map.put("girl",girlService.getGirlById(id));
        return "OneGirl";
    }
    @GetMapping("/getAllGirl")
    public String getAllGirl(ModelAndView modelAndView){
        System.out.println(girlService.getAllGirl());
        modelAndView.addObject("girls",girlService.getAllGirl());
        return "AllGirl";
    }
}
