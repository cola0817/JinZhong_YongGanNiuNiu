package edu.jzxy.cbq.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author Cola0817
 * @name PersonArrayListDemo
 * @date 2023/9/16 17:33
 * @since 1.0.0
 */
public class PersonArrayListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        Boolean[] sexes = new Boolean[]{true,false};
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 101; i++) {
            int sexRandom = random.nextInt(0, 2);
            int ageRandom = random.nextInt(18, 31);
            Person person = new Person(ageRandom,sexes[sexRandom]);
            personList.add(person);
        }
        List<Person> list = personList.stream().filter(Objects::nonNull)
            .filter(person -> person.getAge() >= 18)
            .filter(person -> person.getAge() <= 22)
            .filter(person -> person.isSex())
            .collect(Collectors.toList());

        list.forEach(System.out::println);

    }
}
