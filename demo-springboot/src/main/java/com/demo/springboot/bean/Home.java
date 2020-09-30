package com.demo.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ryan
 * @since 1.0
 */
@Component
public class Home {
    private Animal animal;

//    @Autowired
//    public Home(Animal animal) {
//        this.animal = animal;
//    }

    @Autowired
    public void insertAnimal(Animal animal){
        this.animal=animal;
    }

    public void eat(){
        animal.eat();
    }
}
