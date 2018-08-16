package com.master.serviceb.controller;

import com.master.serviceb.model.House;
import com.master.serviceb.service.HouseService;
import com.master.serviceb.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/service-b")
public class ServiceBController {

    @Autowired
    private SendService sendService;

    @Autowired
    HouseService houseService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(){
        return "hello-b";
    }

    @RequestMapping(value = "/send")
    public void send(){
        sendService.send();
    }

    @RequestMapping(value = "selectSample",method = RequestMethod.GET)
    @ResponseBody
    public List<House> selectSample(){
        return houseService.selectSample();
    }

    @RequestMapping(value = "select100",method = RequestMethod.GET)
    @ResponseBody
    public List<House> select100(){
        return houseService.select100();
    }

    @RequestMapping(value = "updateById",method = RequestMethod.GET)
    @ResponseBody
    public void updateById(){
        houseService.updateById();
    }

    @RequestMapping(value = "selectById",method = RequestMethod.GET)
    @ResponseBody
    public House selectById(){
        return houseService.selectById();
    }

    @RequestMapping(value = "selectByIdT",method = RequestMethod.GET)
    @ResponseBody
    public House selectByIdT(){
        return houseService.selectByIdT();
    }

    @RequestMapping(value = "selectByIds",method = RequestMethod.GET)
    @ResponseBody
    public List<House> selectByIds(){
        return houseService.selectByIds();
    }
}
