package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.security.RolesAllowed;

@Controller
@RequestMapping("/product")
@RolesAllowed({"ROLE_PRODUCT", "ROLE_ADMIN"})
public class ProductController {

    // @Secured() 这个是security自带的注解，内部的
    // @PreAuthorize() 这个是spring提供的注解
    @RequestMapping("/findAll")
    public String findAll(){
        return "product-list";
    }
}
