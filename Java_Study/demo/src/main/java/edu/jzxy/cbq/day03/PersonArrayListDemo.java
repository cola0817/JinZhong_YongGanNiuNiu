package edu.jzxy.cbq.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Cola0817
 * @name PersonArrayListDemo
 * @date 2023/9/16 21:08
 * @since 1.0.0
 */
public class PersonArrayListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        boolean[] sexes = {true, false};

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            int ageRandom = random.nextInt(16, 25);
            int sexRandom = random.nextInt(0, 2);
            Person person = new Person(ageRandom, sexes[sexRandom]);
            personList.add(person);
        }

        List<Person> list = personList.stream()
            .filter(person -> person.getAge() >= 18)
            .filter(person -> person.getAge() <= 23)
            .filter(Person::isSex)
            .toList();

        list.forEach(System.out::println);


    }
}
