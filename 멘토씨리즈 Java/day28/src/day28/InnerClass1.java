package day28;

public class InnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class A{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1=new StaticInner();
	InstanceInner ii1=new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2=new StaticInner();
//		InstanceInner ii2=new InstanceInner(); -> Static 메서드는 Instance 멤버에 접근 불가능
	}
	void InstanceMethod() {
		StaticInner st3=new StaticInner();
		InstanceInner ii3=new InstanceInner();
	}
}
