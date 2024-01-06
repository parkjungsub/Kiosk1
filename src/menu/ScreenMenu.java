package menu;

import java.util.HashMap;
import java.util.Map;

public class ScreenMenu {// 메뉴판을 설계
    private Map<MenuIndex, String> screenMap = new HashMap<>();

    public ScreenMenu(){
        initializeScreen();
    }

    public String getScreenMenu(MenuIndex menuIndex){
        return screenMap.get(menuIndex);
    }

    private void initializeScreen() {
        screenMap.put(MenuIndex.MAIN,"\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n" +
                "\n" +
                "[ SHAKESHACK MENU ]\n" +
                "1. Burgers         | 앵거스 비프 통살을 다져만든 버거\n" +
                "2. Shake           | 매장에서 신선하게 만드는 아이스크림\n" +
                "3. Drinks          | 매장에서 직접 만드는 음료\n" +
                "4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주\n" +
                "\n" +
                "[ ORDER MENU ]\n" +
                "5. Order       | 장바구니를 확인 후 주문합니다.\n" +
                "6. Cancel      | 진행중인 주문을 취소합니다.");
        screenMap.put(MenuIndex.CART,"위 메뉴를 장바구니에 추가하시겠습니까?\n" +
                "1. 확인        2. 취소");
        screenMap.put(MenuIndex.ORDER_CANCEL,"진행하던 주문을 취소하시겠습니까?\n" +
                "1. 확인        2. 취소");
        screenMap.put(MenuIndex.ORDER,"아래와 같이 주문 하시겠습니까?\n" +
                "\n" +
                "[ Orders ]");
        screenMap.put(MenuIndex.TOTAL,"\n" +
                "[ Total ]");
        screenMap.put(MenuIndex.ORDER_OPTION,"\n" +
                "1. 주문      2. 메뉴판");
        screenMap.put(MenuIndex.SELECT,"\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
    }
}
