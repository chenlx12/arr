package com.example.aar.service;

import com.example.aar.mapper.ApplicationormMapper;
import com.example.aar.mapper.IntegraltableMapper;
import com.example.aar.mapper.PersonalinformationMapper;
import com.example.aar.pojo.Applicationorm;
import com.example.aar.pojo.Integraltable;
import com.example.aar.pojo.Personalinformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class ApplicationormService {
    @Autowired
    private PersonalinformationMapper personalinformationMapper;

    @Autowired
    private IntegraltableMapper integraltableMapper;

    @Autowired
    private ApplicationormMapper applicationormMapper;

    public Applicationorm getpage(Applicationorm applicationorm, HttpServletRequest request){
        HttpSession session =request.getSession(true);
        applicationorm.setId((String)session.getAttribute("id"));
        System.out.println(applicationorm);
        //int a = applicationormMapper.insertone(applicationorm);
        int a = applicationormMapper.insert(applicationorm);
        if (a > 0){
            return applicationorm;
        }
        return null;
    }

    public Personalinformation getActad(HttpServletRequest request){
        HttpSession session =request.getSession(true);
        Personalinformation personalinformation = personalinformationMapper.selectone((String)session.getAttribute("id"));
        System.out.println(personalinformation+"这是占位1");
        if (personalinformation == null){
            return null;
        }
        return personalinformation;
        //return "[{\"name\":\""+personalinformation.getName()+"\"}]";
    }

    public Integraltable getIntegral(HttpServletRequest request){
        HttpSession session =request.getSession(true);
        Integraltable integraltable = integraltableMapper.selectone((String)session.getAttribute("id"));
        System.out.println(integraltable+"这是占位2");
        if( integraltable == null){
            return null;
        }
        return integraltable;
        //return "[{\"integral\":\""+integraltable.getIntegral()+"\"}]";
    }
}
