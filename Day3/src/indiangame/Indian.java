package indiangame;

import java.util.Scanner;

public class Indian {
    Scanner scanner = new Scanner(System.in);

    //인디언 이름을 출력하는 method
    public void printName(int y, int m, int d) {

        String[] years = {"시끄러운", "푸른", "적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심 많은"};
        String[] months = {"늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람"};
        String[] day = {"와 함께 춤을", "의 기상", "은(는) 그림자속에", "", "", "", "의 환생", "의 죽음", "아래에서", "를(을) 보라", "이(가) 노래하다", "그림자", "의 일격", "에게 쫓기는 남자", "의 행진", "의 왕", "의 유령", "을(를) 죽인 자", "은(는) 맨날 잠잔다", "처럼", "의 고향", "의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러트린 자", "의 혼", "은(는) 말이 없다"};

        System.out.println("당신의 이름은 " + years[y] + " " + months[m - 1] + day[d - 1] + "입니다.");
    }
    //연도를 입력받는 method

    public int inputYears() {
        int years;
        while (true) {
            try {
                System.out.print("태어난 연도 입력(ex 1999): ");
                years = Integer.parseInt(scanner.next()) % 10;
                return years;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            }
        }
    }

    //월을 입력받는 method
    public int inputMonths() {
        int months;
        while (true) {
            try {
                System.out.print("태어난 달 입력(ex 08): ");
                months = Integer.parseInt(scanner.next());
                if (months < 1 || months > 12) {
                    System.out.println("1~12월만 입력하시오.");
                    continue;
                }
                return months;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하시오.");
            }
        }
    }

    //일을 입력받는 method
    public int inputDays() {
        int days;
        while (true) {
            try {
                System.out.print("태어난 일 입력(ex 04): ");
                days = Integer.parseInt(scanner.next());
                if (days < 1 || days > 31) {
                    System.out.println("1~31일만 입력하시오.");
                    continue;
                }
                return days;
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하시오.");
            }
        }
    }
}