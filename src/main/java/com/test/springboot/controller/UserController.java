package com.test.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/22 0022.
 */
@RestController
public class UserController {
    @GetMapping("/haha")
    public  String  user(){
        String a="wo cao";
        return  a;
    }
}
