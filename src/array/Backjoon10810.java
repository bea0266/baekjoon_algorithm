package array;

import java.util.Scanner;

public class Backjoon10810 {
    /**
     * 백준 10810번 배열 > 공 넣기 문제
     * 시작(start), 끝(end) 범위만큼 바구니의 공 번호를 ball로 교체
     * 배열 인덱스는 0번부터 시작이므로 start, end를 1씩 마이너스함.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int start = scanner.nextInt() - 1;
            int end = scanner.nextInt() - 1;
            int ball = scanner.nextInt();

            for (int j = start; j <= end; j++) {
                basket[j] = ball;
            }
        }

        scanner.close();
        for (int b: basket) {
            System.out.print(b + " ");
        }
    }
}
