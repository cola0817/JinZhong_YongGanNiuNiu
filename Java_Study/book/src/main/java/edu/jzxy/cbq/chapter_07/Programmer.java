package edu.jzxy.cbq.chapter_07;

import lombok.Data;

/**
 * @author Cola0817
 * @name Programmer
 * @date 2023/9/17 11:08
 * @since 1.0.0
 */
@Data
public class Programmer {
    String name;
    Lamp lamp;
    Computer computer;

    public void doOn(On_Off o){
        o.on();
    }

    public void doOff(On_Off o){
        o.off();
    }
}
