package edu.jzxy.cbq.chapter_07;

import lombok.Data;

/**
 * @author Cola0817
 * @name SOURCE
 * @date 2023/9/17 11:54
 * @since 1.0.0
 */
public enum SOURCE {

    EXCELLENT(100,90),
    COMMON(90,60),
    BAD(60, 0);

    private Integer max;
    private Integer main;

    private SOURCE(Integer max, Integer main) {
        this.max = max;
        this.main = main;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getMain() {
        return main;
    }

    public void setMain(Integer main) {
        this.main = main;
    }
}

