package j10_접근지정자;


// 은행
// 금고 -> 은행직원만 접근 가능: 변수가 있음.
// 카운터: 직원들(메소드들) a, b, c, d, e(대신 돈을 넣어주거나 빼줌.)
// 손님: 다른 클래스: 직원한테 부탁을 해야함.
// 직원이 손님한테 가져다 주면 get()
// 손님이 직원한테 넣어라고 하면 set()
public class StudentAccessModifier {
    private int code; // 멤버 변수들은 앞으로 private: 금고 안에 들어가 있는 것들.
    private String name;

    // 생성될 때 값 주입
    public StudentAccessModifier(int code, String name) { // 외부로부터 값을 전달 해서 값을 전달해줌. 생성자도 public
        this.code = code;
        this.name = name;
    }

//    // 은행직원들의 행동 메뉴얼(메소드): 세터: 값 집어넣음.
//    public void setCode(int code) { // 언제든지 값을 바꾸고 싶으면 set 쓰면됨.
//    변수명: 앞에는 set+ 뒤에는 카멜 표기법으로 대문자
//        this.code = code; // 값 넣으려면 매개변수 있어야 함.
//    }
//
//    // 은행직원들의 행동 메뉴얼(메소드): 게터: 값 들고옴.
//    public int getCode() {
//        return code; // 값 들고오려면 리턴이 있어야 함.
//    }
//
//    public String getName() {
//        return name;
//    }

    // 단축키 alt+insert -> shift 방향키 -> 확인.
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // 메소드를 통해서만 값을 들고오거나 넣을 수 있음: 데이터의 보호

    public void showInfo() { // 메소드는 public
        System.out.println("학번: " + this.code);
        System.out.println("이름: " + name);
    }


}
