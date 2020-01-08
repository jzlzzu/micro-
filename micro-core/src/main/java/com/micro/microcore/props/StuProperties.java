package com.micro.microcore.props;

import com.micro.microcore.pojo.Student;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Author: jzl
 * @Description:
 * @Date: Created in 10:59 2020/1/8
 * @Modified By:
 */
@Configuration
@Data
@ConfigurationProperties
@RefreshScope
public class StuProperties {

    // 可以匹配配置文件的 key: stuDents stu-dents
    private List<Student> stuDents;

}
