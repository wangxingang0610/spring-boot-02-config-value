package com.study;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.study.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigValueApplicationTests {

    @Autowired
    Person person;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}

