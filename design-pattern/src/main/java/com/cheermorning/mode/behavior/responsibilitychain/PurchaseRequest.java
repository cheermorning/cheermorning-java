package com.cheermorning.mode.behavior.responsibilitychain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequest {

    private Integer id = 0;

    private Float price = 0.0f;

    private Integer type = 0;



}
