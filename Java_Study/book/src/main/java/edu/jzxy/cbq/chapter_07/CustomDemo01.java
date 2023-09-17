package edu.jzxy.cbq.chapter_07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

/**
 * @author Cola0817
 * @name CustomDemo01
 * @date 2023/9/17 12:01
 * @since 1.0.0
 */
public class CustomDemo01 {
    public static void main(String[] args) {
        Integer[] ids = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < ids.length; i++) {

            ids[i] = random.nextInt(0, 101);;
        }
        Arrays.sort(ids, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Arrays.stream(ids)
            .filter(Objects::nonNull)
            .sorted(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
        Arrays.stream(ids).sorted(((o1, o2) -> {
            return (o2 - o1);
        }));
        Arrays.stream(ids).sorted(Comparator.comparing((Integer::intValue))).forEach(System.out::println);

    }
}
