package com.eureka.eurekaClient.service;

import org.json.JSONObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
*
* 项目名称：interface
* 类名称：MqConsumer
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午2:37:56
* 修改人：john
* 修改时间：2018年8月11日 下午2:37:56
* 修改备注：
* @version
*
*/

@Component
public class MqConsumerService {
	
	@JmsListener(destination = "queque.personal",containerFactory="jmsListenerContainerQueue")
	public String getPersonMsg(String string){
		System.out.println("person消费者接受的队列信息>>>>>>>>"+string);
		return string;
		
	}

}
