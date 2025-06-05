public class randomfill {
    public static void main(String[] args){
        int[] ball = new int[48];

        for(int i=0; i<ball.length; i++)
            ball[i] = i+1;
        
        int tmp = 0;
        int j = 0;

        for(int i=0; i<7; i++){
            j = (int)(Math.random() * 47);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for(int i=0; i<7; i++)
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
    }
}
