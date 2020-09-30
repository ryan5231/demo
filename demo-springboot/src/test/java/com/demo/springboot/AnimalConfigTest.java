package com.demo.springboot;

import com.demo.springboot.bean.Animal;
import com.demo.springboot.bean.AnimalConfig;
import com.demo.springboot.bean.Home;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ryan
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) //自动创建Spring上下文
@ContextConfiguration(classes = AnimalConfig.class) //加载Spring配置
public class AnimalConfigTest {




    @Autowired
    private Animal animal;

    @Autowired
    private Home home;

    @Test
    public void testConfig(){
        Assert.assertNotNull(animal);
    }

    @Test
    public void testHome(){
        home.eat();
        Assert.assertNotNull(home);
    }
}
