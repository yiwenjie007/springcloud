package com.taipu.servicea.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "service-b")
public interface ServiceBClient {

    @RequestMapping(value = "/service-b/hello",method = RequestMethod.POST)
    @ResponseBody
    String sayHelloFromB();
}
