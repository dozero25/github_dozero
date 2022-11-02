package J15_Object클래스;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }
//    @Override
//    public boolean equals(Object obj) {
//
//        if(this == obj) return true;
//        if(obj == null) return false;
//        if(getClass() != obj.getClass()) return false;
//
//        Teacher other = (Teacher) obj;
//        return Objects.equals(name, other.name) && Objects.equals(schoolName, other.schoolName);
//        // name, schoolName 두개를 받았기 때문에
//    }
    @Override // Alt + insert => equals and hash, 위에 만든거랑 비슷하게 만들어 진다.
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

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
