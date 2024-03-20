package com.grooming.mcq;


class Chicken {

}

interface HenHouse {
    java.util.List<Chicken> getChickens();
}

public class ChickenSong {

    public static void main(String[] args) {

        HenHouse house = (HenHouse) new ChickenSong(); 
        for (int i = 0; i < house.getChickens().size(); i++) { 
            Chicken chicken = house.getChickens().get(i);
            System.out.println("Cluck");
        } 
    }
}
