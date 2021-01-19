package com.company;

public class Main {
    public static void main(String[] args) {
        Hero<Integer,Integer> hero1 = new Hero<>(200, 50);
        Hero<Integer, Integer> hero2 = new Hero<>(300, 100);
        System.out.println(hero1.makeDamage2());
        hero2.makeDamage1(hero1.getHealPoint());

    }
}
