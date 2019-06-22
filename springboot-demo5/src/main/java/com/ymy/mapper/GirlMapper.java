package com.ymy.mapper;

import com.ymy.entity.Girl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GirlMapper {
    int insertGirl(Girl girl);
    int deleteGirl(int id);
    int updateGirl(Girl girl);
    Girl selectById(int id);
    List<Girl> selectAll();
}
