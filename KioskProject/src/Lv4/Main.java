package Lv4;

public class Main {
    public static void main(String[] args) {
        // Main 메뉴 생성
        Menu mainMenu = new Menu("MAIN MENU");

        // 각 카테고리 메뉴 추가
        Menu burgersMenu = new Menu("BURGERS MENU");
        burgersMenu.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgersMenu.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Menu drinksMenu = new Menu("DRINKS MENU");
        drinksMenu.addMenuItem(new MenuItem("콜라", 2.0, "탄산음료"));
        drinksMenu.addMenuItem(new MenuItem("주스", 3.0, "신선한 과일 주스"));

        Menu dessertsMenu = new Menu("DESSERTS MENU");
        dessertsMenu.addMenuItem(new MenuItem("아이스크림", 2.5, "다양한 맛의 아이스크림"));
        dessertsMenu.addMenuItem(new MenuItem("케이크", 4.5, "부드러운 케이크"));

        // Main 메뉴에 카테고리 추가
        mainMenu.addMenuItem(new MenuItem("Burgers", 0, burgersMenu));
        mainMenu.addMenuItem(new MenuItem("Drinks", 0, drinksMenu));
        mainMenu.addMenuItem(new MenuItem("Desserts", 0, dessertsMenu));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk();

        // Kiosk 내 시작하는 함수 호출
        kiosk.start(mainMenu);
    }
}
