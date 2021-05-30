package com.cheermorning.mode.behavior.state;

/**
 * 不能抽奖状态
 * @author Administrator
 *
 */
public class NoRaffleState extends State {

    // 初始化时传入活动引用，扣除积分后改变其状态
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    // 当前状态可以扣积分 , 扣除后，将状态设置成可以抽奖状态
    @Override
    public void deductMoney() {
        if(activity.getMoney() > 50) {
            System.out.println("扣除50积分成功，您可以抽奖了");
            activity.setMoney(activity.getMoney()-50);
            activity.setState(activity.getCanRaffleState());

        }else{
            System.out.println("积分不满50,不能抽奖!");
            // 改变状态为奖品发送完毕, 后面我们就不可以抽奖
            //activity.setState(activity.getMoneyDeductedState());
            System.out.println("抽奖活动结束");
            System.exit(0);
        }
    }

    // 当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖喔！");
        return false;
    }

    // 当前状态不能发奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
