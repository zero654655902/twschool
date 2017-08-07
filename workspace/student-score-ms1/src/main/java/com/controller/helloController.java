package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lwan on 07/08/2017.
 */
@RestController
public class helloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayhello() {
        return "hello";
    }
}
