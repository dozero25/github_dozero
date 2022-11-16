package J17_스태틱.싱글톤;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {

    private String factoryName;

    public SmartPhone produceSmartPone(){
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");
        String model = "갤럭시S";
        String serial = null;
        Samsung samsung = Samsung.getInstance(); // samsung으로 부터 serialnumber를 계속 받는다.
        serial = samsung.createSerialNumber(model);

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }

}
