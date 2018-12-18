package com.beibei.demo.dao;

import com.beibei.demo.pojo.Commodity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IndexDao {

    @Query("select c from Commodity as c")
    List<Commodity> find(Commodity commodity);
}
