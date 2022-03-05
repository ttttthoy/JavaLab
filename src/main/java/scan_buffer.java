import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.BufferedReader;

public class scan_buffer {
    public static void main(String[] args) throws IOException {
        String str = "abcdefghijklmnopqrxtuvwxyz1234567890101010101010101010101010";

        //bufferTest
        long startTime = System.nanoTime();
        BufferedReader buff = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes())));
        buff.readLine();
        long endTime = System.nanoTime();
        long dur = (endTime - startTime);
        System.out.println(dur);

        //scannnerTest
        startTime = System.nanoTime();
        Scanner scan = new Scanner(str);
        scan.nextLine();
        endTime = System.nanoTime();
        dur = (endTime - startTime);
        System.out.println(dur);

    }
}
