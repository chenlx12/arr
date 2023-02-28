package com.example.aar.config;

import cn.hutool.core.util.IdcardUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.regex.Pattern;

@Configuration
public class TestAndVerifyConfig {
    //身份证验证
    public boolean isIDNumber(String IDNumber) {
        return IdcardUtil.isValidCard18(IDNumber);
    }
    //手机号验证
    public boolean validateMobilePhone(String in) {
        Pattern pattern = Pattern.compile("^[1]\\d{10}$");
        return pattern.matcher(in).matches();
    }

}
