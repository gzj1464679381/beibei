package com.beibei.demo.controller;

import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Api(value = "首页测试",tags ="首页测试服务接口" )
public class HomeController {
    @Autowired
    private SolrClient solrClient;
    @RequestMapping(value = "/Home/search",method = RequestMethod.GET)
    //该方法的说明
    @ApiOperation(value = "首页搜索功能",notes ="首页搜索功能" )
    //参数提示
    @ApiImplicitParam(name = "name",value = "搜索内容")
    public String search(String name){

        SolrQuery query=new SolrQuery();
        query.setQuery(name);
        query.setSort("id",SolrQuery.ORDER.desc);
        try {
            QueryResponse queryResponse=solrClient.query(query);
            SolrDocumentList list=queryResponse.getResults();
            String solrDocument=JSONArray.toJSONString(list);
            return solrDocument;
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
