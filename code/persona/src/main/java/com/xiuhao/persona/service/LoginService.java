package com.xiuhao.persona.service;

import com.xiuhao.persona.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    LoginMapper loginMapper;

    public String getTag(String userName){
        int provinceId = loginMapper.getProvinceId(userName);
        List<String> localProductList = loginMapper.getLocalProduct(provinceId);
        StringBuffer sb = new StringBuffer();
        for(String product:localProductList){
            sb.append(",").append(product).append(",");
        }
        return sb.toString();
    }
}
