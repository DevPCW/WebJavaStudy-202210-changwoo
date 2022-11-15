package j25_문자열;

import java.util.UUID;

public class UUIDString {

    public static void main(String[] args) {

        String uuid = UUID.randomUUID().toString();

        System.out.println(uuid);

        System.out.println(uuid.replaceAll("-", ""));

        System.out.println("---------------------------------------------------");

        String replaceUUID = uuid.replaceAll("-", "");

        int uuidLength = replaceUUID.length();
        int uuidHalfIndex = uuidLength / 2;

        String leftUuid = replaceUUID.substring(0, uuidHalfIndex);
        String rightUuid = replaceUUID.substring(uuidHalfIndex);

        System.out.println("leftUuid: " + leftUuid);
        System.out.println("rightUuid: " + rightUuid);

//        System.out.println(uuid.replaceAll("-", "").substring(0, (uuid.length() / 2)));
    }
}
