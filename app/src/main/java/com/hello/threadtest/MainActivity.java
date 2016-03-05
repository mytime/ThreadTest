package com.hello.threadtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 测试当前线程和新线程
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 测试当前线程
     * @param view
     */
    public void testCurrentThread(View view) {
        try {
            Thread.sleep(1000);
            System.out.println("我休息了1秒钟");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 开启一个新线程
     * 开始.start时，执行的是run（）方法
     * @param view
     */
    public void testNewThread(View view) {
        new Thread(){
            @Override
            public void run() {
                super.run();

                while (true){ //循环执行
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("我是一个新的线程");

                }


            }
        }.start();
    }
}
