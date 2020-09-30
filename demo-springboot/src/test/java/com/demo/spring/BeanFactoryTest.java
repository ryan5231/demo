package com.demo.spring;

import com.demo.spring.bean.MyTestBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author ryan
 * @since 1.0
 */
@SuppressWarnings("deprecation")
public class BeanFactoryTest {
    @Test
    public void testSimpleLoad(){

        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
        Assert.assertEquals("testStr", bean.getTestStr());

    }
}
