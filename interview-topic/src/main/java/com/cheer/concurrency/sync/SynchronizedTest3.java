package com.cheer.concurrency.sync;

/**
 * @author yinchen
 * @apiNote synchronized修饰在代码块中, 代码块中的内容，在两个线程按照顺序执行
 * @since 2021/12/1 9:41
 **/
public class SynchronizedTest3 {


    /**
     * Method 1 Start
     * Method 1 Execute
     * Method 2 Start
     * Method 1 End
     * Method 2 Execute
     * Method 2 End
     */
    public void method1(){
        System.out.println("Method 1 Start");
        try {
            synchronized (this){
                System.out.println("Method 1 Execute");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 End");
    }

    public void method2(){
        System.out.println("Method 2 Start");
        try {
            synchronized (this){
                System.out.println("Method 2 Execute");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 End");
    }

    public static void main(String[] args) {
        //声明对象
       SynchronizedTest3 test = new SynchronizedTest3();

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
}
