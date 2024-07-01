package array;

import java.util.Scanner;

public class BaekJoon10813 {
    /**
     * 백준 10813번 공 바꾸기 문제
     * 임시 변수 temp 활용하여 i번 바구니와 j번 바구니의 공 교체
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int temp, start, end;

        int[] baguni = new int[n];

        for (int i = 0; i < n; i++) {
            baguni[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            start = s.nextInt() - 1;
            end = s.nextInt() - 1;
            temp = baguni[start];
            baguni[start] = baguni[end];
            baguni[end] = temp;
        }
        s.close();
        for (int b:baguni)
            System.out.print(b + " ");
    }
}
