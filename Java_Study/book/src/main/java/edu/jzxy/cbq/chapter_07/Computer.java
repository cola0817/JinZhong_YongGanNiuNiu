package edu.jzxy.cbq.chapter_07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Computer
 * @date 2023/9/17 11:07
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements On_Off {
    String name;
    int flag = On_Off.OFF;

    @Override
    public void on() {
        if (flag == On_Off.OFF) {
            System.out.println("开机 ing");
            flag = On_Off.ON;
        } else {
            System.out.println("开机 ed");
        }
    }

    @Override
    public void off() {
        if (flag == On_Off.ON) {
            System.out.println("关机 ing");
            flag = On_Off.OFF;
        } else {
            System.out.println("关机 ed");
        }
    }

    public Computer(String name) {
        this.name = name;
    }
}
