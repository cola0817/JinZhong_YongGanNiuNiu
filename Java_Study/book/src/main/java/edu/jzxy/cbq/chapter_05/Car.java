package edu.jzxy.cbq.chapter_05;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Car
 * @date 2023/9/16 17:09
 * @since 1.0.0
 */
public class Car extends Transport{
    @Override
    public void run() {
        System.out.println("Car is running" + getName()+getSpeed());
    }

    public Car(int speed, String name) {
        super(speed, name);
    }

    public Car() {
    }
}
