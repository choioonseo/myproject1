package 생성자;

public class 직원 {
	String name;
	int age;
	String mw;
	static int count;
	static int sum_age;
	static int avg_age;
	
	//객체 생서하지 않고 클래스 이름으로 바로 접근해서 평균을 구하고 싶은 경우
	//static메서드로 만들기
	
	public static void getAvg() {
		//static매서드에서 전역변수를 접근할 때에는
		//같은 성격을 가진 static변수만 접근이 가능
		
		System.out.println(sum_age / count);
	}

	
	public 직원(String name, int age, String mw) {
		count++;
		sum_age = sum_age + age;
		avg_age = sum_age / count;
		this.name = name;
		this.age = age;
		this.mw = mw;
	}
	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", mw=" + mw + "]";
	}
	
	
	

}
