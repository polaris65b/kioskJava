package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 선택을 저장하는 변수
        int userChoice = 1;
        while(true){
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("ShackBurger | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                    "SmokeShack | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                    "Cheeseburger | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                    "Hamburger | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
            userChoice = sc.nextInt();
            if(userChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}