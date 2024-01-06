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
                    list.getBurger(select); //select 입력 받은 숫자의 리스트 출력
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option =sc.nextInt();// 장바구니에 담을 것인지 아닌지 입력 받기
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBurgerList(select -1)); // 장바구니에 선택한 리스트 넣기
                    if(option == 1){
                        sum += orderList.get(count).getPrice();//장바구니에 담긴 금액 합계 더하기
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
                    list.getShake(select); //select 입력 받은 숫자의 리스트 출력
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt();// 장바구니에 담을 것인지 아닌지 입력 받기
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getshakeList(select - 1));// 장바구니에 선택한 리스트 넣기
                    if(option == 1){
                        sum += orderList.get(count).getPrice(); //장바구니에 담긴 금액 합계 더하기
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){// 장바구니에 담을 것인지 아닌지 입력 받기
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                break;
                case 3:
                    list.getDrinkList();// 드링크 선택 리스트 출력
                    select = sc.nextInt();
                    list.getDrink(select); //select 입력 받은 숫자의 리스트 출력
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt(); // 장바구니에 담을 것인지 아닌지 입력 받기
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getDrinkList(select -1));// 장바구니에 선택한 리스트 넣기
                    if(option == 1){
                        sum += orderList.get(count).getPrice(); //장바구니에 담긴 금액 합계 더하기
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
                    list.getBeer(select); //select 입력 받은 숫자의 리스트 출력
                    System.out.println(menuTest.getScreenMenu(MenuIndex.CART));
                    option = sc.nextInt();// 장바구니에 담을 것인지 아닌지 입력 받기
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    orderList.add(list.getBeerList(select -1));// 장바구니에 선택한 리스트 넣기
                    if(option == 1){
                        sum += orderList.get(count).getPrice(); //장바구니에 담긴 금액 합계 더하기
                        System.out.println("장바구니에 추가되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }else if(option == 2){
                        System.out.println("장바구니 취소되었습니다.");
                        System.out.println(menuTest.getScreenMenu(MenuIndex.MAIN));
                    }
                    break;
                case 5:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER));
                    for(int i = 0; i < orderList.size() ;i++){ // 장바구니 리스트 출력하기
                        System.out.println(orderList.get(i).getName()+ "     | W" +orderList.get(i).getPrice() +" | " + orderList.get(i).getExplanation());
                    }
                    System.out.println("[Total]"+"\nW" + sum); // 장바구니 합계 출력
                    break;
                case 6:
                    System.out.println(menuTest.getScreenMenu(MenuIndex.ORDER_CANCEL));
                    if (option == 1){
                        orderList.clear();
                        sum =0.0;
                        count = 0;
                        System.out.println("진행하던 주문이 취소되었습니다.");
                    }
                    break;
            }
            count++;
        }


    }
}
