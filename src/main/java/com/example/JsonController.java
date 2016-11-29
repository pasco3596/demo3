package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pasuco on 2016/11/29.
 */
@RestController
@RequestMapping(value = "/json")
public class JsonController {

    //jsonで返す
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUsrs(){
        List<User> list = Arrays.asList(new User(1,"鳴滝"),new User(2,"須永"),new User(3,"岩堀"));
        return list;
    }
    // textファイルを返す
    @RequestMapping(value = "/json2", method = RequestMethod.GET)
    public ResponseEntity<List<User>> usersResponse(){
        List<User> list = Arrays.asList(new User(1,"鳴滝"),new User(2,"須永"),new User(3,"岩堀"));
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type","text/json; charset=UTF-8");
        header.setContentDispositionFormData("filename", "1.json");
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<List<User>>(list,header,status);
    }
}
