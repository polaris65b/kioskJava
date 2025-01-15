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
    private List<MenuItem> menuItems = new ArrayList<>();

    // 생성자
    public Kiosk(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    // 메서드
    // Kiosk가 동작하는 방법을 정의한 메서드
    public void start(){
        // addMenu();  //  메뉴를 추가함.
        Scanner sc = new Scanner(System.in);

        while (true) {
            try{
                // 메뉴 출력
                System.out.println("       [ SHAKESHACK MENU ]");
                int index = 1;
                for (MenuItem item : menuItems) {
                    System.out.println(index + ". " + item.getName()
                            + "   | W " + item.getPrice()
                            + " | " + item.getDescription());
                    index++;
                }
                System.out.println("0. 종료       |       종료");
                // 번호 입력 받음
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
            // int choiceMenu에서 정수가 아닌 수가 들어오는 경우 예외처리
            catch (Exception e) {
                System.out.println("숫자를 입력해주세요");
                sc.nextLine(); // 입력 버퍼에 남아있어 무한 루프 되는 것을 방지
            }
        }
    }
}
