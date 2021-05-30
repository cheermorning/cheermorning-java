package com.cheermorning.mode.structural.decorate;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 饮料抽象类，被装饰者
 * @date 2021-5-9
 */
@Data
@NoArgsConstructor
public abstract class Drink {

    private String desc;
    private Float price = 0.0f;

    public abstract float cost();
}
