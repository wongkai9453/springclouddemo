package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp
{
    public static void main( String[] args )
    {
        System.out.println( "ConfigServerApp Hello World!" );
        SpringApplication.run(ConfigServerApp.class,args);
    }
}
