import java.util.*;

public class Addsum {
    public static void main(String[] args){
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.");

        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine();
        num = Integer.parseInt(tmp);

        while (num!=0) {
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리수의 합:" + sum);
    }
    
}
