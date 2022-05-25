package com.example.autos;

public class principal {
    public static void main(String[] args) {
        auto obj1 = new auto("audi","Q8",2021);
        //arreglo de autos
        auto obj2 = new  auto("continental", "bentley", 1960);
        auto obj3 = new  auto("chiron", "bugatti", 2000);
        auto obj4 = new  auto("ateca", "cupra", 2015);
        auto obj5 = new  auto("458 italia", "ferrari", 2013);
        //System.out.println(obj);
        auto[] lote = new auto[5];
        lote[0] = obj1;
        lote[1] = obj1;
        lote[2] = obj1;
        lote[3] = obj1;
        lote[4] = obj1;
        System.out.println("autos");


    }
}
