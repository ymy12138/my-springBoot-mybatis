package com.ymy.service;

import com.ymy.entity.Girl;
import com.ymy.mapper.GirlMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GirlService {
    @Resource
    GirlMapper girlMapper;
    public int addGirl(Girl girl){
        return girlMapper.insertGirl(girl);
    }
    public int delGirl(int id){
        return girlMapper.deleteGirl(id);
    }
    public int updGirl(Girl girl){
        return girlMapper.updateGirl(girl);

    }
    public Girl getGirlById(int id){
        return girlMapper.selectById(id);
    }
    public List<Girl> getAllGirl(){
        return girlMapper.selectAll();
    }

}
