package com.jeecms;

public class Test {


    public static void main(String[] args) {
        boolean checkStatusResult = isCheckStatusResult(1, 5);
        boolean checkStatusResult1 = isCheckStatusResult(1, 6);

        System.out.println("args = [" + checkStatusResult + "]");
        System.out.println("args = [" + checkStatusResult1 + "]");

    }


    private static boolean isCheckStatusResult(Integer extStatus, Integer purchaseOrderStatus) {
        boolean checkStatus;
        switch (extStatus) {
            case 1:
                checkStatus = (purchaseOrderStatus == 5 || purchaseOrderStatus == 6 );
                break;
            case 2:
                checkStatus = (purchaseOrderStatus == 7);
                break;
            case 3:
                checkStatus = (purchaseOrderStatus == 10);
                break;
            default:
                checkStatus = false;
                break;
        }
        return checkStatus;
    }
}
