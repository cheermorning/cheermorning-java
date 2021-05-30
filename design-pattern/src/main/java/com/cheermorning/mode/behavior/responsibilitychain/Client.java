package com.cheermorning.mode.behavior.responsibilitychain;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public class Client {

    public static void main(String[] args) {

        /**
         * OA系统采购审批的案例
         */
        //创建采购请求
        PurchaseRequest request = new PurchaseRequest(1, 24000.0f, 1);

        //创建审批人
        DepartApprover departApprover = new DepartApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        VicePresidentApprover vicePresidentApprover = new VicePresidentApprover("王副校长");
        PresidentApprover presidentApprover = new PresidentApprover("赵校长");

        //关联下一级审批人是谁？
        departApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(vicePresidentApprover);
        vicePresidentApprover.setApprover(presidentApprover);
        presidentApprover.setApprover(departApprover);

        departApprover.purchaseRequest(request);

    }
}
