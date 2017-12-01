package com.jack.jpa.web;

import com.jack.jpa.dao.PersonRepository;
import com.jack.jpa.domain.Person;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyueming
 */
@RestController
public class DataController {

    //1 Spring Data JPA已自动为你注册bean，所以可自动注入
    @Autowired
    PersonRepository personRepository;

    /**
     * 保存 save支持批量保存：<S extends T> Iterable<S> save(Iterable<S> entities);
     *
     * 删除： 删除支持使用id，对象以，批量删除及删除全部：
     * void delete(ID id); void delete(T entity); void delete(Iterable<?
     * extends T> entities); void deleteAll();
     */
    @RequestMapping("/save")
    public Person save(String name, String address, Integer age) {
        return personRepository.save(new Person(null, name, age, address));
    }


    /**
     * 测试findByAddress
     */
    @RequestMapping("/q1")
    public List<Person> q1(String address) {
        return personRepository.findByAddress(address);
    }

    /**
     * 测试findByNameAndAddress
     */
    @RequestMapping("/q2")
    public Person q2(String name, String address) {
        return personRepository.findByNameAndAddress(name, address);
    }

    /**
     * 测试withNameAndAddressQuery
     */
    @RequestMapping("/q3")
    public Person q3(String name, String address) {
        return personRepository.withNameAndAddressQuery(name, address);
    }

    /**
     * 测试withNameAndAddressNamedQuery
     */
    @RequestMapping("/q4")
    public Person q4(String name, String address) {
        return personRepository.withNameAndAddressNamedQuery(name, address);
    }

    /**
     * 测试排序
     */
    @RequestMapping("/sort")
    public List<Person> sort() {
        return personRepository.findAll(new Sort(Direction.ASC, "age"));
    }

    /**
     * 测试分页
     */
    @RequestMapping("/page")
    public Page<Person> page() {
        return personRepository.findAll(new PageRequest(1, 2));
    }


    @RequestMapping("/auto")
    public Page<Person> auto(Person person) {
        return personRepository.findByAuto(person, new PageRequest(0, 10));
    }

}
