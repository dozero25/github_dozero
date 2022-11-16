package J17_스태틱.싱글톤;

import lombok.Getter;


public class Samsung {

    @Getter
    private String company;
    private int serialNumber;
    
    private static Samsung instance  = null;

    private Samsung() {// 딱 하나만 존재해야하며, 외부에 존재하면 안되기 때문에 prviate
        company = getClass().getSimpleName(); // 자신의 클래스를 가져오는 방법
        serialNumber = 20220000;
    } 

    public static Samsung getInstance() {
        if (instance == null) { // null일때 한번만 생성하고
            instance = new Samsung();
        }return instance;
    } // 여기까지 싱글톤 만드는 공식

    public String createSerialNumber(String model) {
        return model+"_"+ ++serialNumber;
    }
    
}
