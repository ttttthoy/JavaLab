import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class Sms_sending {
    public static void main(String[] args){
        String api_key = "가입후 발급받은 API KEY";
        String api_secret = "발급받은 API Secret";
        Message coolsms = new Message(api_key, api_secret);

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", "등록한 발신자번호");
        params.put("from", "수신자번호");
        params.put("type", "SMS");
        params.put("text", "문자내용");
        params.put("app_version", "test app 1.2");

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }
    }
}
