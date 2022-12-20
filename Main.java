package bsu.rfct.course2.group9.Todadze;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Food> breakfast = new ArrayList<Food>();

        for (String el : args) {
            String[] params = el.split("/");

            switch (params[0]) {
                case ("Lemonade") -> breakfast.add(new Lemonade(params[1]));
                case ("Cake") -> breakfast.add(new Cake(params[1]));
                case ("Tea") -> breakfast.add(new Tea(params[1]));
            }
        }

        // Ищем кол-во первого элемента в завтраке

        int counter = 0;
        for (Food el: breakfast){
            if (el.equals(breakfast.get(0))){
                counter++;
            }
        }
        System.out.println("There are " + counter + " " + breakfast.get(0));
    }
}