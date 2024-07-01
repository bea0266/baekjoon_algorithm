package string;

import java.util.Scanner;

public class Baekjoon27866 {
    /**
     * 문자열과 정수를 입력하여
     * 해당 정수 번째에 해당하는 문자열의 문자를 출력한다.
     * charat : 문자열에서 파라미터로 준 index의 문자를 리턴해준다.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int idx = s.nextInt();

        System.out.println(str.charAt(idx - 1));
    }
}
