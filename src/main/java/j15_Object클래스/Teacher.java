package j15_Object클래스;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() { // alt + insert: 단축키
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) { // obj = teacher2
//
//        if(this == obj) return true;
//        if(obj == null) return false;
//        if(getClass() != obj.getClass()) return false; // getClass(): teacher1의 Class Class
//
//        // 밑에 매개 변수에서 ((Teacher) obj).name) 다운캐스팅을 강제로 해서 이렇게 만들면 됨. -> other.name
//        Teacher other = (Teacher) obj;
//        return Objects.equals(name, other.name)
//                && Objects.equals(schoolName, other.schoolName);
//    }  // equals도 alt + insert 제공함
//

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }


}


