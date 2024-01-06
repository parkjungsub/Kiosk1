package product;

import menu.Menu;

public class Burger extends Menu {
    private String name;

    private double price;
    private String explanation;


    public Burger(String name, String explanation, double price){
        this.name = name;
        this.explanation = explanation;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getExplanation(){
        return explanation;
    }

    public double getPrice () {
        return price;
    }

}
