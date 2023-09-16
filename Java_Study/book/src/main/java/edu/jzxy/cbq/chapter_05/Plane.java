package edu.jzxy.cbq.chapter_05;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Plane
 * @date 2023/9/16 17:08
 * @since 1.0.0
 */
public class Plane extends Transport{

    @Override
    public void run() {
        System.out.println("Plane is running" + getName() + getSpeed());
    }

    public Plane(int speed, String name) {
        super(speed, name);
    }

    public Plane() {
    }
}
