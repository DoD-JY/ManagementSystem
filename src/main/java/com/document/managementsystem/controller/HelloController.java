package com.document.managementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: HelloController
 * PACKAGE: com.document.managementsystem.controller
 * Description:
 *
 * @Date: 2020/3/8/008 - 11:34
 * Author:Dongjianyu
 */
@Controller
public class HelloController {

    @GetMapping("/")
    public String index () {
        return "index";
    }
}
