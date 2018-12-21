package com.beibei.demo.redis;

import com.beibei.demo.entity.User;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.TimeUnit;
@Repository
public class Rediss {



    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    /**
     * redis保存单个对象
     *
     * */

    public void add(String key, User user, Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(user),time,TimeUnit.SECONDS);
    }



    /**
     * 保存LIST集合
     * */
    public void add(String key, List<User> department, Long time){
        Gson gson=new Gson();
        redisTemplate.opsForValue().set(key,gson.toJson(department),time,TimeUnit.MINUTES);
    }

    /**
     * 使用get获取单个对象
     * */

    public User get(String key){
        String departJSon=redisTemplate.opsForValue().get(key);
        //将Json字符串转化为实体对象
        Gson gson=new Gson();
        User user=gson.fromJson(departJSon,User.class);
        return user;
    }


    /**
     * 使用get获取对象集合
     *
     * */

    public List<User> geyList(String key){
        String departJson=redisTemplate.opsForValue().get(key);
        //将Json字符串转化为实体对象的集合
        Gson gson=new Gson();
        List<User> users=gson.fromJson(departJson,new TypeToken<List<User>>(){}.getType());
        return users;
    }


    /**
     * 根据KEY值进行删除
     * */

    public void  delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}
