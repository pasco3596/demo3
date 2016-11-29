package com.example;

import org.springframework.boot.Banner;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


/**
 * Created by pasuco on 2016/11/29.
 */
@Controller
@RequestMapping(value ="/")
public class DemoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo(Model model){
        return "demo";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(Model model){
        return "test";
    }
    @RequestMapping(value = "aa", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<User>> aa(){
        List<User> list = Arrays.asList(new User(1,"鳴滝"),new User(2,"須永"),new User(3,"岩堀"));
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/json; charset=UTF-8");
        headers.setContentDispositionFormData("filename", "2.json");
        return new ResponseEntity<List<User>>(list, headers,HttpStatus.OK);
    }
}
