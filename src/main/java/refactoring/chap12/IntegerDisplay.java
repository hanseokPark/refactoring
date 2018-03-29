package refactoring.chap12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener {

	private JPanel contentPane;
	private Value value;
	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexaDecimal;
	private JButton btnDecrement;
	private JButton btnIncrement;
	
	
	public IntegerDisplay() {
		initComponent();
		value = new Value(0);
	}

	private void initComponent() {
		setTitle("Integer Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lbl8Title = new JLabel("8진수");
		lbl8Title.setForeground(Color.BLACK);
		lbl8Title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl8Title);
		
		lblOctal = new JLabel("0");
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblOctal);
		
		JLabel lbl10Title = new JLabel("10진수");
		lbl10Title.setForeground(Color.BLACK);
		lbl10Title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl10Title);
		
		lblDecimal = new JLabel("0");
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblDecimal);
		
		JLabel lbl16title = new JLabel("16진수");
		lbl16title.setForeground(Color.BLACK);
		lbl16title.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(lbl16title);
		
		lblHexaDecimal = new JLabel("0");
		lblHexaDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblHexaDecimal);
		
		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("굴림", Font.PLAIN, 30));
		contentPane.add(btnIncrement);
		
		btnDecrement = new JButton("-");
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("굴림", Font.PLAIN, 30));
		contentPane.add(btnDecrement);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIncrement ) {
			setValue(value.getValue() + 1);
		}
		
		if(e.getSource() == btnDecrement) {
			setValue(value.getValue() - 1);
		}		
	}

	public int getValue() {
		return value.getValue();
	}

	public void setValue(int value) {
		this.value.setValue(value);
		lblOctal.setText(Integer.toOctalString(value));
		lblDecimal.setText(Integer.toString(value));
		lblHexaDecimal.setText(Integer.toHexString(value));
	}
}
