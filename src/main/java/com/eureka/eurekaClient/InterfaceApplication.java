package com.eureka.eurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class InterfaceApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(InterfaceApplication.class, args);
        System.out.println( "Hello Interface!" );
    }
}
