package com.xxx.springcloud;
//2021-11-29

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3355.class, args);
    }
}

// test 提github
/**

 Successfully created project 'cloud2020' on GitHub, but initial push failed:
 unable to access 'https://github.com/weiqx/cloud2020.git/': OpenSSL SSL_read: Connection was reset, errno 10054
解决方法：
 git config --global http.sslVerify "false"

 */