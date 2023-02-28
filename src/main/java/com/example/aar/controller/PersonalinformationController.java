package com.example.aar.controller;


import com.example.aar.mapper.PersonalinformationMapper;
import com.example.aar.pojo.Personalinformation;
import com.example.aar.service.PersonalinformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author huyelin
 * @since 2023-02-27
 */
@RestController
public class PersonalinformationController {
    @Autowired
    private PersonalinformationService personalinformationService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public Personalinformation login(@RequestBody Personalinformation personalinformation, HttpServletRequest request){
        return personalinformationService.getlogin(personalinformation,request);
    }


//    @RequestMapping(value = "/users")
//    public List<Personalinformation> getUsers(){
//        List<Personalinformation> users = personalinformationMapper.selectAll();
//        return users;
//    }

}
