package com.company;

public class Mecadestructor extends Meca {
    public void Mecadestructor(){
    }

    @Override
    public void m1() { System.out.println("Je suis un Decepticon");

    }
    public void m4(){
        super.m1();
        super.m4();
    }
    public String toString(){ return " Moi Decepticon" + " " + super.toString();

    }
}
