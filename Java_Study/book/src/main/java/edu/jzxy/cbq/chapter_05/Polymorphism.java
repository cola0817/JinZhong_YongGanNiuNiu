package edu.jzxy.cbq.chapter_05;

import java.util.Arrays;

/**
 * @author Cola0817
 * @name Polymorphism
 * @date 2023/9/16 17:10
 * @since 1.0.0
 */
public class Polymorphism {
    public static void main(String[] args) {
        Transport plane = new Plane(100,"plane");
        Transport ship = new Ship(50,"ship");
        Transport car = new Car(30, "car");
        Transport[] transports = new Transport[]{plane, ship, car};
        Arrays.stream(transports).forEach(transport -> {
            transport.run();
            System.out.println(transport);
        });
    }
}
