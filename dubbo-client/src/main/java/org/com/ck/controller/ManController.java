package org.com.ck.controller;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.com.ck.dubbo.face.test.ManService;
@Controller
@RequestMapping("/man")
public class ManController {

    @Reference
    private ManService manService;

    @RequestMapping("/say")
    @ResponseBody
    public String say() {
        System.out.println("开始学说话！！！");
        return manService.say("dasdadas");
    }
}
