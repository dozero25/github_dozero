package day12;

public class Array_3 {

	public static void main(String[] args) {
		int []student = {100,95,90,88,93};
		int sum=0;
		for(int i=0;i<student.length;i++){
			sum+=student[i];
		}
		// 정수 / 정수= 정수, 실수 값이 나오려면 정수/(float)실수 강제 형변환 실시
		System.out.println("시험점수의 평균 : "+sum/(float)student.length);

	}

}
