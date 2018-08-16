package com.master.serviceb.service;

import com.master.serviceb.model.HouseDo;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {

    @Autowired
    SQLManager sqlManager;

    public List<HouseDo> selectSample(){
        return sqlManager.select("houseDo.selectSample",HouseDo.class);
    }

    public List<HouseDo> select100(){
        return sqlManager.select("houseDo.select100", HouseDo.class);
    }
}
