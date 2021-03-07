package com.stones.stones;

abstract public class Stone {
    private int weight;
    private int cost;
    private String name;

    public Stone(){
    }

    public Stone(int weight, int cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stones{" +
                "weight=" + getWeight() +
                ", cost=" + getCost() +
                ", name=" + getName() +
                '}';
    }

}
