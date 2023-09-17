package edu.jzxy.cbq.chapter_07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Lamp
 * @date 2023/9/17 11:03
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lamp implements On_Off{
    String name;
    int flag = On_Off.OFF;

    @Override
    public void on() {
        if (flag == On_Off.OFF){
            System.out.println("开灯 ing");
            flag = On_Off.ON;
        }else {
            System.out.println("开灯 ed");
        }
    }

    @Override
    public void off() {
        if (flag == On_Off.ON){
            System.out.println("关灯 ing");
            flag = On_Off.OFF;
        }else {
            System.out.println("关灯 ed");
        }
    }

    public Lamp(String name) {
        this.name = name;
    }
}
