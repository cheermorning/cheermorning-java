package com.cheermorning.mode.behavior.responsibilitychain;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void purchaseRequest(PurchaseRequest request) {
        if(request.getPrice() > 5000 && request.getPrice() <= 10000){
            System.out.println("请求编号ID：" + request.getId() + "，Price：" +request.getPrice() +"元，被" + this.name + "审批");
        }else{
            approver.purchaseRequest(request);
        }
    }
}
