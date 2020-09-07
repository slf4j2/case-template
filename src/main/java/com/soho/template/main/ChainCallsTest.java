package com.soho.template.main;

import com.soho.template.model.Person;

/**
 * @author soho.chan
 * @date 7/9/2020 14:51
 * @description 链式调用
 */
public class ChainCallsTest {
    public static void main(String[] args) {
        Person person = Person.create()
                .setAge(18)
                .setLastName("chan")
                .setFirstName("soho");
        System.out.println(person);
    }
}
