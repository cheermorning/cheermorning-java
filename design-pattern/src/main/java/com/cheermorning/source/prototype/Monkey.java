package com.cheermorning.source.prototype;

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
public class Monkey {

    private Integer id = 1;
    private String name = "孙猴子";
    private Integer age = 12;
    private String func = "翻跟头";
}
