package edu.jzxy.cbq.chapter_05;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Ship
 * @date 2023/9/16 17:10
 * @since 1.0.0
 */
public class Ship extends Transport{

    public Ship(int speed, String name) {
        super(speed, name);
    }

    public Ship() {
    }

    @Override
    public void run() {
        System.out.println("Ship is running" + getName()+getSpeed());
    }
}
