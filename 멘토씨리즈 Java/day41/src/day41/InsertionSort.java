package day41;

public class InsertionSort {

	public static void main(String[] args) {
		int ar[]= {8,1,2,5,4,3,6,7};
		int idx;
		int tmp;
		System.out.println("-----정렬 전-----");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			}
		System.out.println();
		for(int i=1;i<ar.length;i++) {
			idx=i;	
			for(int j=i-1;j>=0;i--) {
				if(ar[idx]<ar[j]) {
					tmp=ar[idx];
					ar[idx]=ar[j];
					ar[j]=tmp;
					idx=j;
				for(int k=0;k<ar.length;k++) {
						System.out.print(ar[k]+" ");}
				System.out.println();}
				else {break;}}}
		System.out.println("-----정렬 후-----");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
			
		}
}

}
