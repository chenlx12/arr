package com.example.aar.service;

import com.example.aar.config.TestAndVerifyConfig;
import com.example.aar.mapper.PersonalinformationMapper;
import com.example.aar.pojo.Personalinformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class PersonalinformationService {
    @Autowired
    private PersonalinformationMapper personalinformationMapper;
    @Autowired
    private TestAndVerifyConfig testAndVerifyConfig;

    public Personalinformation getlogin(Personalinformation personalinformation, HttpServletRequest request){
        Personalinformation user1 = personalinformationMapper.selectone(personalinformation.getId());
        if(!testAndVerifyConfig.isIDNumber(user1.getId())||!testAndVerifyConfig.validateMobilePhone(user1.getCpnumber())){
            System.out.println(user1.getId());
            System.out.println(user1.getCpnumber());
            return null;
        }
        if (user1 != null){
            if (user1.getName().equals(personalinformation.getName())){
                if (user1.getCpnumber().equals(personalinformation.getCpnumber())){
                    HttpSession session =request.getSession(true);
                    session.setAttribute("id",personalinformation.getId());
                    return user1;
                }
            }
        }
        return null;
    }

}
