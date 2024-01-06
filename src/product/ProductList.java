package product;

public class ProductList {

    public ProductList(){

    }
    Beer[] beers = new Beer[]{
            new Beer("ShackMeister Ale","쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 틀별히 양조한 에일 맥주",9.8),
            new Beer("MagpieBrewing Co","pale Ale,Dreft",6.8)
    };


    Burger[] burgers = new Burger[]{
            new Burger("ShackBurger","토마토, 양상추, 쉑소스가 토핑된 치즈버거",6.9),
            new Burger("SmokeShcak","베이컨, 체리 페퍼에 쉑소스가 토칭된 치즈버거",8.9),
            new Burger("ShroomBurger","몬스터 치즈와 체다 치즈로 속을 채운 배지테리안 버거",9.4),
            new Burger("Cheeseburger","포테이토 번과 비프페티디, 치즈가 토핑된 치즈버거",6.9),
            new Burger("Hamburger","비프패티를 기반으로 야채가 들어간 기본버거",5.4)
    };

    Drink[] drinks= new Drink[]{
            new Drink("Shack-made Lemonade","매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)",3.9),
            new Drink("Fresh Brewed Iced Tea","직접 유기농 홍자를 우려낸 아이스티",3.4),
            new Drink("Fifty/Fifty","레몬에이드와 아이스티의 만남",3.5),
            new Drink("Fountain Soda","코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프",2.7),
            new Drink("Abita Root Beer","청량감 있는 독특한 미국식 무알콜 탄산음료",4.4),
            new Drink("Bottled Water","지리산 일반대수층으로 만든 프리미엄 생수",1.0),

    };

    Shake[] shakes = new Shake[]{
            new Shake("Shack","바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피",5.9),
            new Shake("Shake of the Week","특별한 커스터드 플레이버",6.5),
            new Shake("red Bean Shake","신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크",6.5),
            new Shake("Floats","루트 비어, 퍼플 카우, 크림시클",5.9)
    };


    public void getBurgerList(){

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"" +
                "\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." +
                "\n\n" +
                "[ Burgers MENU ]");

        for(int i = 0 ; i < burgers.length; i++){
            System.out.println( (i+1)+". " + burgers[i].getName() +"   | W " + burgers[i].getPrice() + "| " + burgers[i].getExplanation());
        }

    }

    public void getBeerList(){

        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"" +
                "\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." +
                "\n\n" +
                "[ Beer MENU ]");

        for(int i = 0 ; i < beers.length; i++){
            System.out.println( (i+1)+". " + beers[i].getName() +"   | W " + beers[i].getPrice() + "| " + beers[i].getExplanation());
        }
    }

    public void getDrinkList() {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"" +
                "\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." +
                "\n\n" +
                "[ Drink MENU ]");
        for (int i = 0; i < drinks.length; i++) {
            System.out.println((i + 1) + ". " + drinks[i].getName() + "   | W " + drinks[i].getPrice() + "| " + drinks[i].getExplanation());
        }
    }

    public void getShakeList() {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"" +
                "\n" +
                "아래 상품메뉴판을 보시고 상품을 골라 입력해주세요." +
                "\n\n" +
                "[ Shake MENU ]");
        for (int i = 0; i < shakes.length; i++) {
            System.out.println((i + 1) + ". " + shakes[i].getName() + "   | W " + shakes[i].getPrice() + "| " + shakes[i].getExplanation());
        }
    }

    public void getBurger(int i){
        System.out.println(burgers[i-1].getName() +"   | W " + burgers[i-1].getPrice() + "| " + burgers[i-1].getExplanation());
    }

    public void getBeer(int i){
        System.out.println(beers[i-1].getName() +"   | W " + beers[i-1].getPrice() + "| " + beers[i-1].getExplanation());
    }

    public void getDrink(int i){
        System.out.println(drinks[i-1].getName() +"   | W " + drinks[i-1].getPrice() + "| " + drinks[i-1].getExplanation());
    }

    public void getShake(int i){
        System.out.println(shakes[i-1].getName() +"   | W " + shakes[i-1].getPrice() + "| " + shakes[i-1].getExplanation());
    }

    public double getBueerPrice (int i){
        return beers[i].getPrice();
    }
    public double getBurgerPrice (int i){
        return burgers[i].getPrice();
    }
    public double getShakePrice (int i){
        return beers[i].getPrice();
    }
    public double getDrinkPrice (int i){
        return drinks[i].getPrice();
    }

    public Beer getBeerList(int i){
        return beers[i];
    }
    public Burger getBurgerList(int i){
        return burgers[i];
    }
    public Drink getDrinkList(int i){
        return drinks[i];
    }
    public Shake getshakeList(int i){
        return shakes[i];
    }
}
