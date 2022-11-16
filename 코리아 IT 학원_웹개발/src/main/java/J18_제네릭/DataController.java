package J18_제네릭;

import java.util.Date;

public class DataController {

    public static void main(String[] args) {
        Date now = new Date();

        RespoonseData<String> respoonseData = new RespoonseData<String>("날짜 저장 성공!", now.toString());
        System.out.println(respoonseData);

        RespoonseData<Integer> respoonseData2 = new RespoonseData<Integer>("번호 저장 성공!", 10);
        System.out.println(respoonseData2);

        RespoonseData<Date> respoonseData3 = new RespoonseData<Date>("날짜 객체 저장 성공", now);
        System.out.println(respoonseData3);


    }
}
