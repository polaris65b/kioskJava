package Lv4;

import java.util.Scanner;

public class Kiosk {
    public void start(Menu menu) {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        // 반복문 시작
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            menu.display();

            // 숫자 입력 받기
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break; // 종료
            } else if (choice > 0 && choice <= menu.getMenuItems().size()) {
                // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
                MenuItem selectedItem = menu.getMenuItems().get(choice - 1);

                // 선택한 메뉴가 하위 메뉴인 경우
                if (selectedItem.getSubMenu() != null) {
                    handleSubMenu(selectedItem.getSubMenu());
                } else {
                    System.out.println("선택한 메뉴: " + selectedItem);
                }
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
        scanner.close();
    }

    private void handleSubMenu(Menu subMenu) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 하위 메뉴 출력
            subMenu.display();
            int choice = scanner.nextInt();
            if (choice == 0) {
                break; // 뒤로가기
            } else if (choice > 0 && choice <= subMenu.getMenuItems().size()) {
                MenuItem selectedItem = subMenu.getMenuItems().get(choice - 1);
                System.out.println("선택한 메뉴: " + selectedItem);
            } else {
                System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }
    }
}
