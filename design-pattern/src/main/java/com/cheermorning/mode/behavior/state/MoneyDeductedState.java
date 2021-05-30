package com.cheermorning.mode.behavior.state;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote 积分扣除完毕，不能再玩了
 * @date 2021-5-29
 */
public class MoneyDeductedState extends State {

    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public MoneyDeductedState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("您的积分已不足50，不能再抽奖");

    }

    @Override
    public boolean raffle() {
        System.out.println("您的积分已不足50，不能再抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("您的积分已不足50，不能再抽奖");
    }
}
