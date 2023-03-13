package Team;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RestaurantUI {


		public static void main(String[] args) {
			
			RestaurantDAO dao = new RestaurantDAO();
			ArrayList<RestaurantVO> list = dao.list();
	
			
			JFrame f = new JFrame();
			f.setSize(980, 700);
//			FlowLayout flow = new FlowLayout();
//			f.setLayout(flow);
			f.getContentPane().setLayout(null);
			Font font = new Font("D2Coding", Font.BOLD, 20);
			Font font2 = new Font("D2Coding", Font.BOLD, 15);
			Font fontTitle = new Font("D2Coding", Font.BOLD, 30);

			f.setTitle("메인화면");

			JLabel l1 = new JLabel("TravelInfo");
			
			JButton b_login = new JButton("login");


			JButton b1 = new JButton("브런치");
			JButton b2 = new JButton("현지인 추천 맛집");
			JButton b3 = new JButton("레스토랑");
			JButton b4 = new JButton("디저트");
			
			
			JButton b5 = new JButton("등록");
			b5.setBounds(480, 110, 60, 30);
			
			
			
		
			JTextField t1 = new JTextField("추가하고 싶은 음식점: ");
			t1.setBounds(200, 110, 130, 30);
			JTextField t2 = new JTextField("추가된 음식점: " );
			t2.setBounds(200, 600, 100, 30);
			
			JTextField a1 = new JTextField();
			a1.setBounds(350, 110,  130, 30);
			JTextField a2 = new JTextField(a1.getText());
			a2.setBounds(310, 600,  130, 30);
			
			
b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
				
					String food_name = a1.getText();
					
					int result = dao.insert(20,food_name);
					
					if (result == 1)
					{
						a2.setText(a1.getText());
					}
				}
			});
			
			
			
			JButton i1 = new JButton();
			JButton i2 = new JButton();
			JButton i3 = new JButton();
			JButton i4 = new JButton();
			JButton i5 = new JButton();
			JButton i6 = new JButton();
			JButton i7 = new JButton();
			JButton i8 = new JButton();
			JButton i9 = new JButton();
			JButton i10 = new JButton();
			JButton i11 = new JButton();
			JButton i12 = new JButton();
			
			
			ImageIcon icon1 = new ImageIcon("1.jpg");
			ImageIcon icon2 = new ImageIcon("2.jpg");
			ImageIcon icon3 = new ImageIcon("3.jpg");
			ImageIcon icon4 = new ImageIcon("4.jpg");
			ImageIcon icon5 = new ImageIcon("5.jpg");
			ImageIcon icon6 = new ImageIcon("6.jpg");
			ImageIcon icon7 = new ImageIcon("7.jpg");
			ImageIcon icon8 = new ImageIcon("8.jpg");
			ImageIcon icon9 = new ImageIcon("9.jpg");
			ImageIcon icon10 = new ImageIcon("10.jpg");
			ImageIcon icon11 = new ImageIcon("11.jpg");
			ImageIcon icon12 = new ImageIcon("12.jpg");
	
			
			JTextField nameText1 = new JTextField("상호명: " + list.get(0).getName());
			JTextField locationText1 = new JTextField("주소: " + list.get(0).getLocation());
			JTextField scoreText1 = new JTextField("평점: " + list.get(0).getScore());
			
			JTextField nameText2 = new JTextField("상호명: " + list.get(1).getName());
			JTextField locationText2 = new JTextField("주소: " + list.get(1).getLocation());
			JTextField scoreText2 = new JTextField("평점: " + list.get(1).getScore());
			
			JTextField nameText3 = new JTextField("상호명: " + list.get(2).getName());
			JTextField locationText3 = new JTextField("주소: " + list.get(2).getLocation());
			JTextField scoreText3 = new JTextField("평점: " + list.get(2).getScore());
			
			JTextField nameText4 = new JTextField("상호명: " + list.get(3).getName());
			JTextField locationText4 = new JTextField("주소: " + list.get(3).getLocation());
			JTextField scoreText4 = new JTextField("평점: " + list.get(3).getScore());
			
			JTextField nameText5 = new JTextField("상호명: " + list.get(4).getName());
			JTextField locationText5 = new JTextField("주소: " + list.get(4).getLocation());
			JTextField scoreText5 = new JTextField("평점: " + list.get(4).getScore());
			
			JTextField nameText6 = new JTextField("상호명: " + list.get(5).getName());
			JTextField locationText6 = new JTextField("주소: " + list.get(5).getLocation());
			JTextField scoreText6 = new JTextField("평점: " + list.get(5).getScore());
			
			JTextField nameText7 = new JTextField("상호명: "+ list.get(6).getName());
			JTextField locationText7 = new JTextField("주소: " + list.get(6).getLocation());
			JTextField scoreText7 = new JTextField("평점: " + list.get(6).getScore());
			
			JTextField nameText8 = new JTextField("상호명: "+ list.get(7).getName());
			JTextField locationText8 = new JTextField("주소: " + list.get(7).getLocation());
			JTextField scoreText8 = new JTextField("평점: " + list.get(7).getScore());
			
			JTextField nameText9 = new JTextField("상호명: "+ list.get(8).getName());
			JTextField locationText9 = new JTextField("주소: " + list.get(8).getLocation());
			JTextField scoreText9 = new JTextField("평점: " + list.get(8).getScore());
			
			JTextField nameText10 = new JTextField("상호명: "+ list.get(9).getName());
			JTextField locationText10 = new JTextField("주소: " + list.get(9).getLocation());
			JTextField scoreText10 = new JTextField("평점: " + list.get(9).getScore());
			
			JTextField nameText11 = new JTextField("상호명: "+ list.get(10).getName());
			JTextField locationText11 = new JTextField("주소: " + list.get(10).getLocation());
			JTextField scoreText11 = new JTextField("평점: " + list.get(10).getScore());
			
			JTextField nameText12 = new JTextField("상호명: "+ list.get(11).getName());
			JTextField locationText12 = new JTextField("주소: " + list.get(11).getLocation());
			JTextField scoreText12 = new JTextField("평점: " + list.get(11).getScore());
			
			
			i1.setIcon(icon1);
			i2.setIcon(icon2);
			i3.setIcon(icon3);
			i4.setIcon(icon4);
			i5.setIcon(icon5);
			i6.setIcon(icon6);
			i7.setIcon(icon7);
			i8.setIcon(icon8);
			i9.setIcon(icon9);
			i10.setIcon(icon10);
			i11.setIcon(icon11);
			i12.setIcon(icon12);
			
			l1.setFont(fontTitle);
			b1.setFont(font);
			b2.setFont(font2);
			b3.setFont(font);
			b4.setFont(font);
			
			b_login.setFont(font);

			int x = 120;
			
			l1.setBounds(20, 10, 300, 40);
			b1.setBounds(x, 60, 150, 40);
			b2.setBounds(x + 200, 60, 150, 40);
			b3.setBounds(x + 400, 60, 150, 40);
			b4.setBounds(x + 600, 60, 150, 40);
		
			b_login.setBounds(800, 10, 80, 30);
			
			
			int x2 = 100;
			
			i1.setBounds(100, 150, 100, 100);
			i2.setBounds(100, 300, 100, 100);
			i3.setBounds(100, 450, 100, 100);
			i4.setBounds(x2 + 200, 150, 100, 100);
			i5.setBounds(x2 + 200, 300, 100, 100);
			i6.setBounds(x2 + 200, 450, 100, 100);
			i7.setBounds(x2 + 400, 150, 100, 100);
			i8.setBounds(x2 + 400, 300, 100, 100);
			i9.setBounds(x2 + 400, 450, 100, 100);
			i10.setBounds(x2 + 600, 150, 100, 100);
			i11.setBounds(x2 + 600, 300, 100, 100);
			i12.setBounds(x2 + 600, 450, 100, 100);
			
			
		
			int x3= 200;
			int x4= 200 + 200;
			int x5= 200 + 200 + 200;
			int x6= 200 + 200 + 200 + 200;
			int y3 =150;
			int y4 =150 + 150;
			
			int m = 100;
			int n = 30;
			
			nameText1.setBounds(x3, 150, m, n);
			locationText1.setBounds(x3, 180, m, n);
			scoreText1.setBounds(x3, 210, m, n);
			
			nameText2.setBounds(x3, y3 + 150,  m, n);
			locationText2.setBounds(x3, y3 + 180, m, n);
			scoreText2.setBounds(x3, y3 + 210,  m, n);
			
			nameText3.setBounds(x3, y4 + 150,  m, n);
			locationText3.setBounds(x3, y4 + 180, m, n);
			scoreText3.setBounds(x3, y4 + 210,  m, n);
			
			nameText4.setBounds(x4, 150, m, n);
			locationText4.setBounds(x4, 180, m, n);
			scoreText4.setBounds(x4, 210, m, n);
			
			nameText5.setBounds(x4, y3 + 150,  m, n);
			locationText5.setBounds(x4, y3 + 180, m, n);
			scoreText5.setBounds(x4, y3 + 210,  m, n);
			
			nameText6.setBounds(x4, y4 + 150,  m, n);
			locationText6.setBounds(x4, y4 + 180, m, n);
			scoreText6.setBounds(x4, y4 + 210,  m, n);
			
			nameText7.setBounds(x5, 150, m, n);
			locationText7.setBounds(x5, 180, m, n);
			scoreText7.setBounds(x5, 210, m, n);
			
			nameText8.setBounds(x5, y3 + 150,  m, n);
			locationText8.setBounds(x5, y3 + 180, m, n);
			scoreText8.setBounds(x5, y3 + 210,  m, n);
			
			nameText9.setBounds(x5, y4 + 150,  m, n);
			locationText9.setBounds(x5, y4 + 180, m, n);
			scoreText9.setBounds(x5, y4 + 210,  m, n);
			
			nameText10.setBounds(x6, 150, m, n);
			locationText10.setBounds(x6, 180, m, n);
			scoreText10.setBounds(x6, 210, m, n);
			
			nameText11.setBounds(x6, y3 + 150,  m, n);
			locationText11.setBounds(x6, y3 + 180, m, n);
			scoreText11.setBounds(x6, y3 + 210,  m, n);
			
			nameText12.setBounds(x6, y4 + 150,  m, n);
			locationText12.setBounds(x6, y4 + 180, m, n);
			scoreText12.setBounds(x6, y4 + 210,  m, n);
			
			
			
			

			Color titleC = new Color(102, 204, 153);
			Color b_loginC = new Color(102, 102, 102);
			Color bgColor = new Color(255, 255, 255);
			Color blue = new Color(102, 153, 204);

			f.getContentPane().setBackground(bgColor);

			l1.setForeground(titleC);

			b1.setBackground(blue);
			b1.setForeground(Color.white);
			b2.setBackground(blue);
			b2.setForeground(Color.white);
			b3.setBackground(blue);
			b3.setForeground(Color.white);
			b4.setBackground(blue);
			b4.setForeground(Color.white);
		
			b_login.setBackground(b_loginC);
			b_login.setForeground(Color.white);
			
			f.add(l1);
			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			
			
			
			
			f.add(i1);
			f.add(i2);
			f.add(i3);
			f.add(i4);
			f.add(i5);
			f.add(i6);
			f.add(i7);
			f.add(i8);
			f.add(i9);
			f.add(i10);
			f.add(i11);
			f.add(i12);
			
			
			
			
			f.add(nameText1);
			f.add(locationText1);
			f.add(scoreText1);
			
			f.add(nameText2);
			f.add(locationText2);
			f.add(scoreText2);
			
			f.add(nameText3);
			f.add(locationText3);
			f.add(scoreText3);
			
			f.add(nameText4);
			f.add(locationText4);
			f.add(scoreText4);
			
			f.add(nameText5);
			f.add(locationText5);
			f.add(scoreText5);
			
			f.add(nameText6);
			f.add(locationText6);
			f.add(scoreText6);
			
			f.add(nameText7);
			f.add(locationText7);
			f.add(scoreText7);
			
			f.add(nameText8);
			f.add(locationText8);
			f.add(scoreText8);
			
			f.add(nameText9);
			f.add(locationText9);
			f.add(scoreText9);
			
			f.add(nameText10);
			f.add(locationText10);
			f.add(scoreText10);
			
			f.add(nameText11);
			f.add(locationText11);
			f.add(scoreText11);
			
			f.add(nameText12);
			f.add(locationText12);
			f.add(scoreText12);
			f.add(b5);
			
			
			
			f.add(b_login);
		f.add(t1);
	f.add(t2);
	f.add(a1);
	f.add(a2);
			
			
			
			

			f.setVisible(true);
		}

	}
