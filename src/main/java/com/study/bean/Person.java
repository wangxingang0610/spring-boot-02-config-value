package com.study.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 *
 */
@Component
public class Person {

    private Integer id;
    @Value("${}")
    private String name;
    private Integer age;
    private Boolean boss;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    private List<String> list;
    private Map<String,Object> map;
    private Cat cat;

    public Person() {

    }

    public Person(Integer id, String name, Integer age, Boolean boss, List<String> list, Map<String, Object> map, Cat cat) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.boss = boss;
        this.list = list;
        this.map = map;
        this.cat = cat;
    }

    public Person(Integer id, String name, Integer age, Boolean boss, String lastName, List<String> list, Map<String, Object> map, Cat cat) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.boss = boss;
        this.lastName = lastName;
        this.list = list;
        this.map = map;
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", lastName='" + lastName + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", cat=" + cat +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
