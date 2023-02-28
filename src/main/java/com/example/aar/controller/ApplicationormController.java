package com.example.aar.controller;


import com.example.aar.mapper.ApplicationormMapper;
import com.example.aar.mapper.IntegraltableMapper;
import com.example.aar.mapper.PersonalinformationMapper;
import com.example.aar.pojo.Applicationorm;
import com.example.aar.pojo.Integraltable;
import com.example.aar.pojo.Personalinformation;
import com.example.aar.service.ApplicationormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyelin
 * @since 2023-02-27
 */
@RestController
public class ApplicationormController {

    @Autowired
    private ApplicationormService applicationormService;

    @ResponseBody
    @RequestMapping(value = "/page")
    public Applicationorm page(@RequestBody Applicationorm applicationorm, HttpServletRequest request){
        return applicationormService.getpage(applicationorm,request);
    }

    @RequestMapping(value = "/name")
    public Personalinformation Actad(HttpServletRequest request){
        return applicationormService.getActad(request);
    }

    @RequestMapping(value = "/Integral")
    public Integraltable Integral(HttpServletRequest request){
        return applicationormService.getIntegral(request);
    }
}
