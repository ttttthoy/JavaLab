import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Buff {
   public static void main(String[] args) throws IOException{

        InputStream inputstream = System.in;
        byte[] a = new byte[5];
        inputstream.read(a);

        for (byte val : a){
            System.out.println(val);
        }
    }
}
