package edu.jzxy.cbq.chapter_07;

/**
 * @author Cola0817
 * @name VolumableV2Do
 * @date 2023/9/17 11:30
 * @since 1.0.0
 */
public class VolumableV2Do {
    public static void main(String[] args) {
        /*接口继承方式 1 - 直接继承*/
        Cube cube = new Cube(1,2,3);
        double cubeV = cube.doVolume(cube);
        System.out.println("cubeV = " + cubeV);
        Cuboid cuboid = new Cuboid(2, 2, 2);
        /*接口继承方式 2 - 匿名类方式*/
        VolumableV2<Cuboid> cuboidF1 = new VolumableV2<Cuboid>() {
            @Override
            public double doVolume(Cuboid cuboid) {
                return cuboid.getH() * cuboid.getR()*cuboid.getW();
            }
        };

        double cuboidV1 = cuboidF1.doVolume(cuboid);
        System.out.println("cuboidV1 = " + cuboidV1);
        /*接口继承方式 3 - Lambda */
        VolumableV2<Cuboid> cuboidF2 = cuboidLambda -> cuboidLambda.getW() * cuboidLambda.getR() * cuboidLambda.getH();
        double cuboidV2 = cuboidF2.doVolume(cuboid);
        System.out.println("cuboidV2 = " + cuboidV2);

    }
}
