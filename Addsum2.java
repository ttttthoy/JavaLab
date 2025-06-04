import java.util.*;

public class Addsum2 {
    public static void main(String[] args){
        int num;
        int sum = 0;
        boolean flag = true;

        System.out.println("합계를 구할 수 입력.(끝내려면 0입력)");

        while (flag) {
            System.out.print(">>>");

            Scanner scan = new Scanner(System.in);
            String tmp = scan.nextLine();
            num = Integer.parseInt(tmp);

            if(num!=0){
                sum += num ;
            }else {
                flag = false;
            }
        }
        System.out.println("합계:" + sum);
    }
}
