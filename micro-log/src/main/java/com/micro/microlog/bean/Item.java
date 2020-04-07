package com.micro.microlog.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @Author: jzl
 * @Description:
 * @Date: Created in 11:33 2020/3/23
 * @Modified By:
 */
@Document(indexName = "item", type = "docs", shards = 1, replicas = 0)
@Data
public class Item {
    @Id
    Long id;
    // 分类
    @Field(type = FieldType.Keyword)
    String category;
    // 品牌
    @Field(type = FieldType.Keyword)
    String brand;
    // 图片地址
    @Field(index = false , type = FieldType.Keyword)
    String images;
    // 价格
    @Field(type = FieldType.Double)
    Double price;
    //标题
    @Field(type = FieldType.Keyword)
    String title;
}
