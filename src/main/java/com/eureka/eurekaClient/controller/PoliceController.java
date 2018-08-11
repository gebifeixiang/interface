package com.eureka.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
*
* 项目名称：InterfaceClient
* 类名称：PoliceController
* 类描述：
* 创建人：john
* 创建时间：2018年8月10日 下午4:14:45
* 修改人：john
* 修改时间：2018年8月10日 下午4:14:45
* 修改备注：
* @version
*
*/
@RequestMapping("/interface")
@RestController
public class PoliceController {
	@Autowired
	 private RestTemplate restTemplate;
	@RequestMapping("/getPoliceName")
	 public String getPoliceName(){
		/* ResponseEntity s=restTemplate.exchange("http://localhost:18766/plice/getName",
				 HttpMethod.GET, null, String.class);
		System.out.println("interface返回>>>>"+s);*/
		 String  str=restTemplate.getForObject("http://dataService-servcie/plice/getName", String.class, "42","32","13");
		 System.out.println("字符串返回结果>>>>>>"+str);
		 return "nihao";
		 
	 }

}
