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
        Menu menuList = new Menu();
        Scanner sc = new Scanner(System.in);
        ArrayList<Menu> orderList = new ArrayList<Menu>(); //장바구니 객체 배열
        int select;
        int count = 0;
        double sum = 0;

       // orderList.add(list.getBurgerList(0));

      //  System.out.println(orderList.get(0).getExplanation());


        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));// 메뉴판 출력

        while (true){
            int option = sc.nextInt();
            switch (option){
                case 1:
                    list.getBurgerList();// 버거의 선택 리스트 출력
                    select = sc.nextInt();
                    list.getBurger(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option =sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBurgerList(select -1));
                    if(option == 1){
                        //sum = orderList.get(count).getPrice();
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 2:
                    list.getShakeList();// 쉐이크 선택 리스트 출력
                    select = sc.nextInt();
                    list.getShake(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getshakeList(select - 1));
                    if(option == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 3:
                    list.getDrinkList();// 드링크 선택 리스트 출력
                    select = sc.nextInt();
                    list.getDrink(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getDrinkList(select -1));
                    if(option == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 4:
                    list.getBeerList(); // 맥주 선택 리스트 출력
                    select = sc.nextInt();
                    list.getBeer(select);
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt();
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBeerList(select -1));
                    if(option == 1){
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                    break;
                case 5:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    for(int i = 0; i < orderList.size() ;i++){
                        System.out.println(orderList.get(i).getName()+ "     | W" +orderList.get(i).getPrice() +" | " + orderList.get(i).getExplanation());
                    }
                    System.out.println("[Total]"+"\nW" + sum);
                    break;
                case 6:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER_CANCEL));
                    if (option == 1){
                        orderList.clear();
                        System.out.println("진행하던 주문이 취소되었습니다.");
                    }
                    break;
            }
            count++;
        }


    }
}
