package com.shu.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by shudebao@tal.com
 * @description
 * @date 2021/8/11 3:13 下午
 */

@RestController
public class ServiceBController {

    @GetMapping("serviceB/hello")
    public void hello(@RequestParam String name) {
        System.out.println("hello:" + name);
    }
}
