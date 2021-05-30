package com.cheermorning.mode.created.prototype.improve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-4-20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sheep implements Cloneable{

    private String name;
    private Integer age;
    private String color;



    @Override
    protected Object clone() {
        try {
            Sheep sheep = null;
            sheep = (Sheep) super.clone();

            return sheep;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
