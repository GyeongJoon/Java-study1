package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                int sum;
                System.out.println("상품명을 입력하세요:");
                String product = input.nextLine();

                System.out.println("상품의 가격을 입력하세요:");
                int price = input.nextInt();

                System.out.println("구매 수량을 입력하세요:");
                int count = input.nextInt();

                sum = price * count;
                totalCost += sum;
                System.out.println("상품명:" + product + " 가격:" + price + " 수량" + count + " 합계" + sum);

            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
            } else if (option == 3) {
                System.out.println("프로그램 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
