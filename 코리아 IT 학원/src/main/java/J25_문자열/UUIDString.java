package J25_문자열;

import java.util.UUID;

public class UUIDString {
    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        System.out.println(uuid.replaceAll("-", ""));

        String replaceUUID = uuid.replaceAll("-", "");

        int uuidLenth = replaceUUID.length();
        int uuidHalfIndex = uuidLenth /2;


        String rightUUID = replaceUUID.substring(uuidHalfIndex);
        System.out.println("rightUUID : "+rightUUID);

        String leftUUID = replaceUUID.substring(0, uuidHalfIndex);
        System.out.println("leftUUID : "+leftUUID);

    }
}
