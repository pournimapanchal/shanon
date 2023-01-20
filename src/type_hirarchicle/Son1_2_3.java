package type_hirarchicle;

public class Son1_2_3 {
	public static void main(String[] args) {
		Son_1 s1=new Son_1();
		s1.home();
		s1.car();
		s1.money();
		s1.secBike();
		System.out.println("properties of son1");
		System.out.println(s1);
	
	
		Son_2 s2=new Son_2();
	s2.home();
	s2.car();
	s2.money();
	s2.seclapy();
	System.out.println("properties of son2");
	System.out.println(s2);
	
		Son_3 s3=new Son_3();
		s3.home();
		s3.car();
		s3.money();
		s3.secMob();
		System.out.println("properties of son3");
		System.out.println(s3);
	}

}
