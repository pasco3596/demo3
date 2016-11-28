package com.example;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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
}
