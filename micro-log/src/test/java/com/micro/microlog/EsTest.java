package com.micro.microlog;

import com.micro.microlog.bean.Item;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

/**
 * @Author: jzl
 * @Description:
 * @Date: Created in 11:15 2020/3/25
 * @Modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EsTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 增删改查
     */
    @Test
    public void add() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        elasticsearchTemplate.createIndex(Item.class);
//        elasticsearchTemplate.putMapping(Item.class);

        stopWatch.stop();

        log.info(stopWatch.prettyPrint());
    }

    @Test
    public void del() {

    }

    @Test
    public void update() {

    }

    @Test
    public void query() {

    }
}
