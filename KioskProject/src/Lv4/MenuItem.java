package Lv4;

public class MenuItem {
    // 이름, 가격, 설명 필드 선언하여 관리
    private String name;
    private double price;
    private String description;
    private Menu subMenu; // 하위 메뉴를 위한 필드

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.subMenu = null; // 기본값은 null
    }

    public MenuItem(String name, double price, Menu subMenu) {
        this.name = name;
        this.price = price;
        this.description = "";
        this.subMenu = subMenu; // 하위 메뉴가 있는 경우
    }

    // 이름 반환하는 메서드
    public String getName() {
        return name;
    }

    // 가격 반환하는 메서드
    public double getPrice() {
        return price;
    }

    // 설명 반환하는 메서드
    public String getDescription() {
        return description;
    }

    public Menu getSubMenu() {
        return subMenu; // 하위 메뉴 반환
    }

    @Override
    public String toString() {
        return name + " | W " + price + " | " + description; // 메뉴 항목 출력 형식
    }
}
