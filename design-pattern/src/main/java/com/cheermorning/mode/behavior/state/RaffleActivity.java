package com.cheermorning.mode.behavior.state;

/**
 * 抽奖活动 //
 *
 * @author Administrator
 *
 */
public class RaffleActivity {

    // state 表示活动当前的状态，是变化
    State state = null;
    // 奖品数量
    int count = 0;

    //积分总量
    int money = 0;

    // 四个属性，表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);

    State dispenseState =   new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    State moneyDeductedState = new MoneyDeductedState(this);




    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量
    public RaffleActivity( int count, int money) {
        this.state = getNoRaffleState();
        this.count = count;
        this.money = money;
    }

    //扣分, 调用当前状态的 deductMoney
    public void deductMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        // 如果当前的状态是抽奖成功
        if(state.raffle()){
            //领取奖品
            state.dispensePrize();
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    //这里请大家注意，每领取一次奖品，count--
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public State getMoneyDeductedState() {
        return moneyDeductedState;
    }

    public void setMoneyDeductedState(State moneyDeductedState) {
        this.moneyDeductedState = moneyDeductedState;
    }
}


