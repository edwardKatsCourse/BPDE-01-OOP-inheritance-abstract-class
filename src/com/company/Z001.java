package com.company;

public class Z001 {

    public static void main(String[] args) {
        System.out.println();
        A a = new EndClass("");
        B b = new EndClass("");
    }
}
//Don't Repeat Yourself

/**
 * Use class B instead of A
 */
@Deprecated
abstract class A {
    private String s;

    public A(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    abstract String getName();
}

abstract class B extends A {
    public B(String s) {
        super(s);
    }

    abstract Integer getAge();

    abstract A getMe();
}

class EndClass extends B {
    public EndClass(String s) {
        super(s);
    }

    @Override
    String getName() {
        return null;
    }

    @Override
    Integer getAge() {
        return null;
    }

    @Override
    A getMe() {
        return null;
    }
}