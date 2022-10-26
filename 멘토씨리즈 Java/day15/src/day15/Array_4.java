package day15;

import java.util.*;

public class Array_4 {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6}; //a라는 묶음에서 2에서 시작
		int [] b= {0,0,0,0,0,0,0}; //b에서 3에서부터 4개 붙일게
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 4);
		System.out.println(Arrays.toString(b));
	}

}
