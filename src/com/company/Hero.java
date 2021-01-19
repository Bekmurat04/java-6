package com.company;

public class Hero<T extends Number, S extends Number> implements Damageable<T> {
    private T healPoint;
    private S damage;

    public Hero (T healPoint, S damage){
        this.damage = damage;
        this.healPoint = healPoint;
    }

    public T getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(T healPoint) {
        this.healPoint = healPoint;
    }

    public S getDamage() {
        return damage;
    }

    public void setDamage(S damage) {
        this.damage = damage;
    }

    @Override
    public void makeDamage1(T t) {
        System.out.println("нашему герою нанесли урон на "+t);
    }

    @Override
    public T makeDamage2() {
        return healPoint;
    }
}
