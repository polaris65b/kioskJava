package Lv4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 필드
    private String name;
    private List<MenuItem> menuItems;

    public Menu(String name) {
        this.name = name;
        this.menuItems = new ArrayList<>(); // List 초기화
    }

    // MenuItem 클래스를 List로 관리
    public void addMenuItem(MenuItem item) {
        menuItems.add(item); // MenuItem을 List에 추가
    }

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void display() {
        System.out.println("[ " + name + " ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i).toString());
        }
        // 메인 메뉴에서는 "0. 종료"로 표시
        if (name.equals("MAIN MENU")) {
            System.out.println("0. 종료");
        } else {
            System.out.println("0. 뒤로가기");
        }
    }

    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems; // MenuItem 리스트 반환
    }

    public String getName() {
        return name; // 메뉴 이름 반환
    }
}
