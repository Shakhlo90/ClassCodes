package Replit;


public  abstract class Parent{
    abstract void m();
    abstract void m1();
}

class Sub extends Parent{

        void m(){
            System.out.println("m1 without parameters");
        }
        void m1(){
            System.out.println("m1 method with parameter");
        }
}