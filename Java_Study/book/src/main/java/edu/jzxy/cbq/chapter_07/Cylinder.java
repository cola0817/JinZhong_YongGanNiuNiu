package edu.jzxy.cbq.chapter_07;

import lombok.Data;

/**
 * @author Cola0817
 * @name Cylinder
 * @date 2023/9/17 10:55
 * @since 1.0.0
 */
@Data
public class Cylinder implements Volumable{
    double r;
    double h;

    @Override
    public double doVolume() {
        return (Volumable.PI *r *r *h);
    }
}
