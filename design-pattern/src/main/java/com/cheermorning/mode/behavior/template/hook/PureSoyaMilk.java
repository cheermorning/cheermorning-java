package com.cheermorning.mode.behavior.template.hook;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    public void addBurden() {
        return;
    }

    @Override
    public boolean isAddBurden() {
        return false;
    }
}
