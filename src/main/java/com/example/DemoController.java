package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by pasuco on 2016/11/29.
 */
@Controller
@RequestMapping(value ="/demo")
public class DemoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model model){
        return "index";
    }
}
