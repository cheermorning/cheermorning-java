package com.cheermorning.mode.structural.bridging;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-9
 */
public class ClamshellPhone extends Style {


    public ClamshellPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void desc() {
        System.out.println("这是翻盖手机");
    }
}
