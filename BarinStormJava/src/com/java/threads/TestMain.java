package com.java.threads;

/**
 * Created by prasanth on 5/4/16.
 */
class TestMain {

    public static void main(String[] args) {

        MyClass a = new MyClass();
        Test t = new Test(a);
        Test2 t2 = new Test2(a);

        t.start();
        t2.start();


    }
}
