package com.cheermorning.mode.behavior.template;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-13
 */
public abstract class SoyaMilk {

    /**
     * 模板方法，final防止子类覆盖
     */
    final void make(){
        select();
        addBurden();
        soak();
        smash();
        System.out.println("第五步，制作完成，盛入碗中，开喝！！！");
    }

    /**
     * 选择材料
     */
    public void select(){
        System.out.println("第一步，选择优质黄豆500g");
    }

    /**
     * 添加配料
     */
    public abstract void addBurden();

    /**
     * 浸泡
     */
    public void soak(){
        System.out.println("第三步，将黄豆和配料放入盆中，浸泡3小时");
    }

    /**
     * 打碎
     */
    public void smash(){
        System.out.println("第四步，将浸泡好的原料，放入豆浆机中打碎，加热");
    }
}
