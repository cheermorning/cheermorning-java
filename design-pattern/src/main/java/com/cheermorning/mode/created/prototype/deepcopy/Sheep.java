package com.cheermorning.mode.created.prototype.deepcopy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
@Getter
@Setter
@AllArgsConstructor
public class Sheep implements Serializable, Cloneable{

    private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private String color;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
