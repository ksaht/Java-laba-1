package org.example;

public class Main {
    public static void main(String[] args) {
        List <Integer> p= new List();
        p.pushBack(5);
        p.pushBack(7);
        p.pushFront(8);
        System.out.println(p.toString());
    }
}