package edu.jzxy.cbq.chapter_07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Cola0817
 * @name Cube
 * @date 2023/9/17 11:25
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube implements VolumableV2<Cube> {
    int r,h, w;

    @Override
    public double doVolume(Cube cube) {
        return cube.h * cube.r * cube.w;
    }
}
