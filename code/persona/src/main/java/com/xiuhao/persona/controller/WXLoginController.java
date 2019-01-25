package com.xiuhao.persona.controller;

import com.xiuhao.persona.common.HttpClientUtil;
import com.xiuhao.persona.common.JSONResult;
import com.xiuhao.persona.common.JsonUtils;
import com.xiuhao.persona.common.RedisOperator;
import com.xiuhao.persona.model.WXSessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WXLoginController {
	
	@Autowired
	private RedisOperator redis;
	

	@PostMapping("/wxLogin")
	public JSONResult wxLogin(String code) {
		
		System.out.println("wxlogin - code: " + code);
		
//		https://api.weixin.qq.com/sns/jscode2session?
//				appid=APPID&
//				secret=SECRET&
//				js_code=JSCODE&
//				grant_type=authorization_code
		
		String url = "https://api.weixin.qq.com/sns/jscode2session";
		Map<String, String> param = new HashMap<>();
		param.put("appid", "wxe89e148bdc931c29");
		param.put("secret", "07297a6cfe57f00f87dce0c3f851cc37");
		param.put("js_code", code);
		param.put("grant_type", "authorization_code");
		
		String wxResult = HttpClientUtil.doGet(url, param);
		System.out.println(wxResult);
		
		WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);
		
		// 存入session到redis
//		redis.set("user-redis-session:" + model.getOpenid(),
//							model.getSession_key(),
//							1000 * 60 * 30);
		
		return JSONResult.ok();
	}
	
}
