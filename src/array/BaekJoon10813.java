package array;

import java.util.Scanner;

public class BaekJoon10813 {
    /**
     * 백준 10813번 공 바꾸기 문제
     * 임시 변수 (int t) 활용
     * 시작 지점(int start)을 증가시키고 끝 지점(int end)를 감소시키면서 배열의 start, end 수의 인덱스를 교체한다.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] baguni = new int[n];

        for (int i = 0; i < n; i++) {
            baguni[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int start = s.nextInt() - 1;
            int end = s.nextInt() - 1;
            int temp = baguni[start];
            baguni[start] = baguni[end];
            baguni[end] = temp;
        }
        s.close();
        for (int b:baguni)
            System.out.print(b + " ");
    }
}
