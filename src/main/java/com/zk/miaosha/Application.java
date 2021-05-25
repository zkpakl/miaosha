package com.zk.miaosha;

import com.zk.miaosha.dao.UserDOMapper;
import com.zk.miaosha.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zuokun
 * @Date: 2021/4/01
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.zk.miaosha"})
@MapperScan("com.zk.miaosha.dao")
@RestController
public class Application {
    @Autowired
    UserDOMapper userDOMapper;


    @RequestMapping("/")
    public String home(){
        UserDO userDO = userDOMapper.selectByPrimaryKey(1);
        if (userDO == null){
            return "用户对象不存在";
        }
        else {
            return userDO.getName();
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
