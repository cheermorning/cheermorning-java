package com.cheermorning.mode.behavior.responsibilitychain;

/**
 * @author Luna
 * @version V1.0.0
 * @apiNote
 * @date 2021-5-29
 */
public abstract class Approver {

    Approver approver;

    String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void purchaseRequest(PurchaseRequest request);



}
