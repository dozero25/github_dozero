package day41;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {8,1,2,5,4,3,6,7}; // tmp : 임시저장공간
		int min, tmp; // i: 최소값을 위치 시킬 가장 앞에 있는 idx, J: 맨 앞에 있는 idx(i)와 비교할 idx
		System.out.println("-----정렬 전-----");
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		for(int i=0;i<ar.length-1;i++) { // i의 범위 0~마지막 idx-1
			min=i;
			for(int j=i+1;j<ar.length;j++) { // // j값의 시작범위는 항상 i의 다음 위치
				if(ar[min]>ar[j]) {
					tmp=ar[min];
					ar[min]=ar[j];
					ar[j]=tmp;
					System.out.println("swap 후!");
					for(int k=0; k<ar.length;k++) {
						System.out.print(ar[k]+" ");
					}
					System.out.println();}}}
		System.out.println("-----정렬 후-----");
		for(int i=0; i<ar.length;i++) {
			System.out.print(ar[i]+" ");
}
}
}
