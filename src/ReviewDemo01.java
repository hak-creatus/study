import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자신 외에는 나누어 떨어지지 않는 수

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < number; i ++)
        {
            if(number % i == 0)
                isPrime = false;
        }

        if(isPrime) // isPrime 변수 값이 true 면
            System.out.println(number + "는 소수");
        else
            System.out.println(number + "는 소수가 아님");
    }
}
