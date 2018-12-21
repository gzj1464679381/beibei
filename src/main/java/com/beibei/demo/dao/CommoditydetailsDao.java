package com.beibei.demo.dao;

import com.beibei.demo.entity.PingLun;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CommoditydetailsDao {
     //添加评论
    public int addpinglun(PingLun pingLun);
    //显示商品所有评论
    @Select("select * from pinglun where c_id=#{id}")
    List<PingLun> pingluns(@Param("id") Integer id);
}
