package order;

import menu.Menu;

public class Order extends Menu {
//    private String name;
    private double price;
//    private String explanation;

//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setExplanation(String explanation){
//        this.name = explanation;
//    }

    public void setPrice(double price){
        this.price = price;
    }

//    public String getName(){
//        return name;
//    }
//
//    public String getExplanation(){
//        return explanation;
//    }

    public double getPrice(){
        return price;
    }

}
