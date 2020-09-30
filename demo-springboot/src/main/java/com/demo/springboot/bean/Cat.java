package com.demo.springboot.bean;

import org.springframework.stereotype.Component;

/**
 * @author ryan
 * @since 1.0
 */
@Component
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat is eating something");
    }
}
