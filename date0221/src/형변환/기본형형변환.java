package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; //1바이트, -128~+127까지 사용가능
		int i1 = 200; // 4바이트, -21억~ +21억
		
		i1 = b1; //작->큰  대입해도 됨. 자동으로 형변환(자동 형변환)
		b1 = (byte)i1; //큰->작 대입할 때는 강제로. (강제 형변환)
		
		//double(큰. 10.0) <-int(작, 10)
		double d1 = i1; //자동형변환
		i1 = (int)d1; //강제형변환
		
		int i2 = 2000;
		byte b2 = (byte)i2; //byte의 범위를 넘어선 127이상의 숫자는 강제 형변환 하지 말아야함.

	}

}
