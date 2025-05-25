public class Recursion {

    public static void main(String[] args){

        System.out.println("3 fac: " + factorial(3));
        System.out.println("12 fac : " + factorial(12));
        showHi(5);
    }

    public static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }

    //재귀 끝나는 조건
    public static void showHi(int cnt){
        System.out.println("Hi!");
        if (cnt == 1)
            return;
        showHi(--cnt); //재귀종료 순서 잘못 지정 시 StackOverflow 발생

    }
}

