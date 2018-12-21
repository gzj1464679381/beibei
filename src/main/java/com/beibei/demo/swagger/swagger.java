package com.beibei.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swagger {
        /**
         * 创建API应用
         * apiInfo() 增加API相关信息
         * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
         * 本例采用指定扫描的包路径来定义指定要建立API的目录。
         *
         * @return
         */
        @Bean
        public Docket createRestApi() {
           Docket docket=new Docket(DocumentationType.SWAGGER_2);
            ApiInfo apiInfo=new ApiInfo("贝贝网",
                    "如有疑问请联系下方邮箱",
                    "1.0",
                    "apiDocs",
                    "14646796381@qq.com",
                    "",
                    "");
            docket.apiInfo(apiInfo);
            return docket;
        }

        /**
         * 创建该API的基本信息（这些基本信息会展现在文档页面中）
         * 访问地址：http://项目实际地址/swagger-ui.html
         * @return
         */


}
