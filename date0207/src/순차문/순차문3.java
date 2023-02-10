package 순차문;

//import: 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문3 {

	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("키를 입력하시오");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하시오");
		
		double height1 = Double.parseDouble(height);
		double weight1 = Double.parseDouble(weight);
		
		double result = height1 - weight1;
		double result2 = height1 + weight1;
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result2);
		
		
	}

}
