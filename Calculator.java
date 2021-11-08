import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.Font;
import javax.swing.JLabel;


class NumberActionListener implements ActionListener{

	private JLabel label;
	private String text;
	
	public NumberActionListener(JLabel l, String s) {
		label =l;
		text = s;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String curr = label.getText();//ÅÃ½ºÆ®¿¡ ÀÖ´Â °ªÀ» °¡Á®¿Ã¼ö ÀÖ´Ù
		if(curr.equals("0")) {
			label.setText(text);
		}
		else {
			label.setText(label.getText()+text);
		}
	}
}



public class Calculator {

	private JFrame frame;
	private String func = "ADD";
	private int firstNumber;
	private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 398, 592);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		answer.setBounds(12, 10, 364, 70);
		frame.getContentPane().add(answer);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn7.setBounds(12, 221, 82, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn8.setBounds(106, 221, 82, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn9.setBounds(200, 221, 82, 70);
		frame.getContentPane().add(btn9);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "ADD";
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnPlus.setBounds(294, 221, 82, 70);
		frame.getContentPane().add(btnPlus);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn4.setBounds(12, 301, 82, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn5.setBounds(106, 301, 82, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn6.setBounds(200, 301, 82, 70);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "SUB";
			}
		});
		btnSub.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnSub.setBounds(294, 301, 82, 70);
		frame.getContentPane().add(btnSub);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn1.setBounds(12, 381, 82, 70);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn2.setBounds(106, 381, 82, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn3.setBounds(200, 381, 82, 70);
		frame.getContentPane().add(btn3);
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "MUL";
			}
		});
		btnMul.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnMul.setBounds(294, 381, 82, 70);
		frame.getContentPane().add(btnMul);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnDot.setBounds(12, 461, 82, 70);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		
		btn0.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btn0.setBounds(106, 461, 82, 70);
		frame.getContentPane().add(btn0);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currValue = Integer.parseInt(answer.getText());
				switch(func) {
				case "ADD":
					 currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber+currValue)+"");
					break;
				case "SUB":
				 currValue = Integer.parseInt(answer.getText());
				answer.setText((firstNumber-currValue)+"");
				break;
				
				case "MUL":
					 currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber*currValue)+"");
					break;
			
				case "DIV":
					 currValue = Integer.parseInt(answer.getText());
					answer.setText((firstNumber/currValue)+"");
					break;
				}
				
			}
		});
		btnEnter.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnEnter.setBounds(200, 461, 82, 70);
		frame.getContentPane().add(btnEnter);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "DIV";
			}
		});
		btnDiv.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnDiv.setBounds(294, 461, 82, 70);
		frame.getContentPane().add(btnDiv);
		
		btn0.addActionListener(new NumberActionListener(answer, "0"));
		btn1.addActionListener(new NumberActionListener(answer, "1"));
		btn2.addActionListener(new NumberActionListener(answer, "2"));
		btn3.addActionListener(new NumberActionListener(answer, "3"));
		btn4.addActionListener(new NumberActionListener(answer, "4"));
		btn5.addActionListener(new NumberActionListener(answer, "5"));
		btn6.addActionListener(new NumberActionListener(answer, "6"));
		btn7.addActionListener(new NumberActionListener(answer, "7"));
		btn8.addActionListener(new NumberActionListener(answer, "8"));
		btn9.addActionListener(new NumberActionListener(answer, "9"));
		
		JButton btnAc = new JButton("AC");//³»°¡ ±¸ÇöÇÑ ºÎºÐ
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currValue = Integer.parseInt(answer.getText());
				
				String curr = answer.getText();
				firstNumber = Integer.parseInt(curr);
				answer.setText("0");
				func = "C";
				
					
				
			}
		});
		btnAc.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		btnAc.setBounds(12, 141, 93, 70);
		frame.getContentPane().add(btnAc);
		
		
	}
}
