import menu.Menu;
import menu.MenuIndex;
import menu.ScreenMenu;
import order.Order;
import product.*;
import order.Order;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScreenMenu menuTest = new ScreenMenu();
        ProductList list = new ProductList();
        Scanner sc = new Scanner(System.in);
        ArrayList<Menu> orderList = new ArrayList<Menu>();
        int select;
        int count = 0;

       // orderList.add(list.getBurgerList(0));

      //  System.out.println(orderList.get(0).getExplanation());


        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));

        while (true){
            int option = sc.nextInt();
            switch (option){
                case 1:
                    list.getBurgerList();
                    select = sc.nextInt();
                    list.getBurger(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    select = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBurgerList(select));
                    if(select == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(select == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 2:
                    list.getShakeList();
                    select = sc.nextInt();
                    list.getShake(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    select = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getshakeList(select));
                    if(select == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(select == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 3:
                    list.getDrinkList();
                    select = sc.nextInt();
                    list.getDrink(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    select = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getDrinkList(select));
                    if(select == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(select == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 4:
                    list.getBeerList();
                    select = sc.nextInt();
                    list.getBeer(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    select = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBeerList(select));
                    if(select == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(select == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                    break;
                case 5:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));

                    break;
                case 6:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER_CANCEL));
                    if (option == 1){
                        orderList.clear();
                        System.out.println("진행하던 주문이 취소되었습니다.");
                    }
                    break;
            }
        }


    }
}
