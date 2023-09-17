package edu.jzxy.cbq.chapter_07;

/**
 * 通过类实现接口
 * @author Cola0817
 * @name Example7_01
 * @date 2023/9/17 10:57
 * @since 1.0.0
 */
public class Example7_01 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setR(2.5);
        cylinder.setH(4);

        double cylinderV = cylinder.doVolume();
        System.out.println("cylinderV = " + cylinderV);

        Cone cone = new Cone();
        cone.setR(3);
        cone.setH(4);
        double coneV = cone.doVolume();
        System.out.println("coneV = " + coneV);
    }
}
