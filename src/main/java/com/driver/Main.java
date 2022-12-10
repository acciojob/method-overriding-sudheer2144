package com.driver;

public class Main {

    public static void main(String[] args) {
        B bobj=new B();
        A aobj=new A();
        System.out.println(aobj.meth());
        System.out.println(bobj.meth());
    }
  
}

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}