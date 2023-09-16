package edu.jzxy.cbq.chapter_05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Transport
 * @date 2023/9/16 17:07
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transport {
     int speed;
     String name;

    public void run(){
        System.out.println("transport is running");

    }


}
