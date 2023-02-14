//나혼자 다시 해 본 거
//미완성임


package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장예매시스템");
		f.setSize(1000, 1000);

		int[] seat = new int[100];

		JLabel result = new JLabel("결과 보이는 곳");
		JButton all = new JButton("전체예약 내역");

		JButton[] btn = new JButton[100];

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			f.add(btn[i]);

			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);

					if (seat[no] != 1) 
					{
						seat[no] = 1;
						result.setText(text + "번 예약완료.");
					}
					else
					{
						
						result.setText("예약불가");
					}
					
				}
			});

		}
		
		
		
	

		
		
		f.add(result);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(result);
		f.add(all);

		f.setVisible(true);

	}

}
