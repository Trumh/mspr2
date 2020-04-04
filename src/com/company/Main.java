package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Moto a = new  Moto("blue",200);
        Moto b = new Moto("blue",300,"CVO","harley");
        a.setCapacity(3000);
        System.out.print(a.getColor() + "\n"+ a.getCapacity() + "\n");
        System.out.print(b.getModel() + "\n" + b.getBrand() + "\n");

        Robot r1 = new Robot();
        r1.m1();
        r1.m4();
        System.out.println(r1);
        System.out.println("-----------------");
        Robot e1 = new Meca();
        e1.m1();
        e1.m4();
        System.out.println(e1);
        System.out.println("-----------------");
        Robot d1 = new Mecadestructor();
        d1.m1();
        d1.m4();
        System.out.println(d1);

    }
}
