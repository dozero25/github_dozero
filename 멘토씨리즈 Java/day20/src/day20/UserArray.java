package day20;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User users[] = new User[4];
		for(int i=0;i<4;i++) {
			users[i]=new User();
		}
		for(int i=0;i<4;i++) {
			System.out.print("name : ");
			users[i].name=sc.next();
			System.out.print("phone : ");
			users[i].phone=sc.next();
			System.out.print("age : ");
			users[i].age=sc.nextInt();
			System.out.print("gender : ");
			users[i].gender=sc.next();
			
			}
		
		for(int i=0;i<4;i++) {
			users[i].info();
			
		}
		

	}

}
class User{
	String name;
	String phone;
	int age;
	String gender;
	
	void info(){
		System.out.println("name : "+name);
		System.out.println("phone : "+phone);
		System.out.println("age : "+age);
		System.out.println("gender : "+gender);
		
	}
}
