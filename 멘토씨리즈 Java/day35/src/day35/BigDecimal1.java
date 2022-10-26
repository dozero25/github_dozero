package day35;

import java.math.BigDecimal;

public class BigDecimal1 {

	public static void main(String[] args) {
		double a=24.3953;
		double b=50.343998;
		System.out.println(a+b);
		
		BigDecimal number1= new BigDecimal(String.valueOf(a)); //double 형 변수를 문자열로 바꿔서
		BigDecimal number2= new BigDecimal(String.valueOf(b)); //BigDecimal 생성자에 전달
		System.out.println(number1.add(number2));

	}

}
