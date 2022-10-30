package StudentMangementApp;

public class StudentRepository { // repository : 저장소

    private Student[] students;

    public StudentRepository() { // Student[]을 받는다. 배열 또한 매개변수로 받는다.
        students = new Student[0];
    }

    public void addStudent(Student student) {// student를 매개변수로 받게 된다.
        // 배열의 비어있는 공간에 넣는다. 빈 공간이 없으면 더이상 못넣어 공간을 늘려줘야한다.
        // 공간 두개가 있을 경우 공간 하나를 더 늘릴때 새로운 배열을 만들고 기존에 있던 배열 값을 넣고 마지막에 새로운 값을 추가
        int index = indexOfEmpty();
        if (index == -1) { // 공간이 없다는 의미.
            index = increaseArray(); // 공간을 늘려주고 index에 대입한다.
        }
        students[index] = student; // 항상 비어있는 index 번호에 service가 준 학생의 정보 매개변수 student를 넣는다.
    }

    // 배열의 공간을 확인 하는 작업을 먼저 해줘야한다.
    private int indexOfEmpty() {
        // 공간이 없으면 공간을 생성하겠다.
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return i; // 반복을 돌렸는데 여기 return을 만나지 않으면 아래에 있는 return을 만나게 되면서 반복을 빠져나가게 된다.
            }   // 만약 students의 배열이 null이면 비어있는 것이므로 공간을 생성하고 break와 메서드를 동시에 하게 된다.
        }
        return -1; // -1을 받으면 모조건 공간이 없다.
    }

    private int increaseArray() {
        Student[] tempArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempArray[i] = students[i]; // 한개씩 그 위치에 정보를 옮긴다.
        }
        students = tempArray; // 지금 students에 tempArray를 대입시켜 새로운 공간이 하나 더 생기게 된다.

        return tempArray.length - 1; // 마지막에 비어있는 인덱스 번호 공간을 나타낸다.
    }

    public Student[] getStudents() {
        return students; // 이 배열을 외부로 가져올 수 있게 한다.
    }

    // 학생 이름으로 학생 찾기
    public int findStudentByName(String name) {
        // 주소를 가져온 학생과 입력한 학생 이름이 같으면 넘어가고, null 주소를 가져왔는데 이름 변수가 없으므로 오류가 발생하게 된다.
        // 가지고 올 때마다 주소에서 null이 아닌지를 먼저 체크하게 한다.
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getName().equals(name)) {
                    return i; // 여기 i 배열에 들어있다. 위치 찾는 것
                }
            }
        }
        return -1;
    }
    // 그 인덱스 번호를 가지고 학생을 가져다 줘야한다.
    public Student getStudent(int index) { // 학생의 위치를 가져온다.
        return students[index];
    }
    // 학생정보 삭제
    public Student removeStudent(int index) { // index 배열에 있는 학생 정보 삭제
        Student student = students[index]; // 배열에서 index 번호의 student를 찾는다.
        students[index] = null;
        return student;
    }
    //학생정보 수정
    public Student updateStudent(int index, Student updateStudent) {
        Student student =  students[index]; // 배열에서 index 번호의 student를 찾는다.
        student.updateStudent(updateStudent);
        return student;
    }


}
