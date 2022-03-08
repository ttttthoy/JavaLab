import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class sms_sending {
    public static void main(String[] args){
        String api_key = "가입후 받은 API KEY 값";
        String api_secret = "API Secret 값";
        Message coolsms = new Message(api_key, api_secret);

        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", "01000000000");
        params.put("from", "01000000000");
        params.put("type", "SMS");
        params.put("text", "첫번째 보내는 테스트 문자 메시지!");
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
