package com.master.serviceb.service;

import com.master.serviceb.model.House;
import lombok.val;
import org.beetl.sql.core.SQLManager;
import org.beetl.sql.core.query.LambdaQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HouseService {

    @Autowired
    SQLManager sqlManager;

    public List<House> selectSample(){
        return sqlManager.select("house.selectSample",House.class);
    }

    public List<House> select100(){
        return sqlManager.select("house.select100", House.class);
    }

    public void updateById(){
        val houseDo = House.builder().build();
        houseDo.setId(1L);
        houseDo.setPrice("15000");
        sqlManager.updateTemplateById(houseDo);
    }

    public House selectById(){
        return sqlManager.single(House.class, 1L);
    }

    public House selectByIdT(){
        val house = House.builder().id(1L).build();
        return sqlManager.templateOne(house);
    }

    public List<House> selectByIds(){
        List<Long> ids = new ArrayList<>();
        ids.add(1L);
        ids.add(2L);
        LambdaQuery<House> query = sqlManager.lambdaQuery(House.class).andIn(House::getId,ids);
        return query.select();
    }
}
