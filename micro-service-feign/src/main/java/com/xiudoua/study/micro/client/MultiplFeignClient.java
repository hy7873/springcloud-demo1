package com.xiudoua.study.micro.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "multipl")
public interface MultiplFeignClient {

	@RequestMapping("/multiplyTwoNum")
    public String multiplyTwoNum(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
	
}
