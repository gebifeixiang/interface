package com.eureka.eurekaClient.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ErrorHandler;

/**
*
* 项目名称：dataService
* 类名称：ErrorOperation
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午6:00:30
* 修改人：john
* 修改时间：2018年8月11日 下午6:00:30
* 修改备注：
* @version
*
*/
public class ErrorOperation  implements ErrorHandler {

	
	public void handleError(Throwable t) {
     System.out.println("异常处理"+t);		
	}

}
