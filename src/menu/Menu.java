package menu;

public class Menu {
        private String name;

        private double price;
        private String explanation;

        public Menu(String name, String explanation, double price){
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
        public double getPrice(){
                return price;
        }
        public Menu(){

        }
}
