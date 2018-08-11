package com.eureka.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.eureka.eurekaClient.entity.User;

/**
*
* 项目名称：InterfaceClient
* 类名称：UserController
* 类描述：
* 创建人：john
* 创建时间：2018年8月10日 下午5:57:40
* 修改人：john
* 修改时间：2018年8月10日 下午5:57:40
* 修改备注：
* @version
*
*/
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/selectUserById")
	public User selectUserById(){
		
		User user=restTemplate.getForObject("http://localhost:18766/user/selectUserById", User.class,2);
		
		System.out.println("interfacecha查询到的dataservice返回的信息");
		return user;
		
	}

}
