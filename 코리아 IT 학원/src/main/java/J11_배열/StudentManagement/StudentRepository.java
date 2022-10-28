package J11_배열.StudentManagement;

public class StudentRepository {
    private Student[] students;
    public StudentRepository() {
        students = new Student[0];
    }
    public void addStudent(Student student) {
        int index = indexOfEmpty();

        if(index == -1){
            index =  increaseArray();
        }
        students[index] = student;
    }
    private int indexOfEmpty(){
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null){
                return i;
            }
        }
        return -1; // 공간이 없다.
    }
    private int increaseArray(){
        Student[] tempArray = new Student[students.length + 1];
        for(int i = 0; i < students.length; i++) {
            tempArray[i] = students[i];
        }
        students = tempArray;

        return students.length -1; // 마지막에 비어있는 index의 번호
    }
    public Student[] getStudents(){
        return students;
    }

    public int findStudnetByName(String name){
        for(int i = 0; i <students.length; i++){ // 문자열 비교 equals
            if(students[i] != null){
                if(students[i].getName().equals(name)){
                    return i; // 여기 이 번호에 들어 있다.
                }
            }
        }
        return -1;
    }
    //학생의 위치를 배열에서 꺼내줘야함
    public Student getStudents(int index){
        return students[index];
    }

}
