package Lv3;

// 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
// MenuItem을 관리하는 리스트가 필드로 존재합니다.
// main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
// List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
// Kiosk 객체를 생성하고 사용하는 main 함수에서 객체를 생성할 때 값을 넘겨줍니다.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // 필드
    private final List<MenuItem> menuItems = new ArrayList<>();

    // 메서드
    public void start(){
        menuItems.add(new MenuItem("ShackBurger", 6.9,
                "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9,
                "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9,
                "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4,
                "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            int index = 1;
            for (MenuItem item : menuItems) {
                System.out.println(index + ". " + item.getName()
                        + "   | W " + item.getPrice()
                        + " | " + item.getDescription());
                index++;
            }
            System.out.println("0. 종료       |       종료");

            System.out.print("번호 입력: ");
            int choiceMenu = sc.nextInt();

            if (choiceMenu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (choiceMenu > 0 && choiceMenu <= menuItems.size()) {
                MenuItem selectedItem = menuItems.get(choiceMenu - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName()
                        + ", W " + selectedItem.getPrice()
                        + ", " + selectedItem.getDescription());
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }
}
