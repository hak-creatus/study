import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자신 외에는 나누어 떨어지지 않는 수

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int cnt = 0;

        for (int i = 2; i < number; i ++)
        {
            if(number % i == 0)
                cnt++;
        }

        if(cnt == 0) // 카운트 0이면 true
            System.out.println(number + "는 소수");
        else
            System.out.println(number + "는 소수가 아님");
    }
}
