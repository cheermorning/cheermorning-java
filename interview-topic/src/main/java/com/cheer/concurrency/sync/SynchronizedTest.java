package com.cheer.concurrency.sync;

/**
 * @author yinchen
 * @apiNote 普通的并发
 * @since 2021/12/1 9:41
 **/
public class SynchronizedTest {

    /**
     * Method 1 Start
     * Method 1 Execute
     * Method 2 Start
     * Method 2 Execute
     * Method 2 End
     * Method 1 End
     * @param args
     */
    public static void main(String[] args) {
        //声明对象
        SynchronizedTest test = new SynchronizedTest();

        //线程1执行方法1
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }).start();
        //线程2执行方法2
        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method2();
            }
        }).start();
    }

    public void method1(){
        System.out.println("Method 1 Start");
        try {
            System.out.println("Method 1 Execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 End");
    }

    public void method2(){
        System.out.println("Method 2 Start");
        try {
            System.out.println("Method 2 Execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 End");
    }
}
