package com.stones.stones;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private String name;
    private List<Stone> stones = new ArrayList<>();

    public Necklace(String name){
        this.name = name;
    }
    int sum=0;
    public int getTotalWeight(int sum){

        for(Stone s : stones){
            sum += s.getWeight();
        }
        return sum;
    }

    public int getTotalCost(){
        int sum = 0;
        for(Stone s : stones) {
            sum+=s.getCost();
        }
        return sum;
    }
}
