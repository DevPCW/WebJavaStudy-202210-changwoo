package j17_스태틱.싱글톤;


import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone { // 여러 대 생산 되니깐 싱글톤 필요없음.

    private String company;
    private String model;
    private String serial;

}
