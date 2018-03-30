package refactoring.chap12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import refactoring.chap12.Graph.GraphType;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class IntegerDisplay extends JFrame implements ActionListener, ValueListener {

	private JPanel contentPane;
	private Value value;
	private JLabel lblOctal;
	private JLabel lblDecimal;
	private JLabel lblHexaDecimal;
	private JButton btnDecrement;
	private JButton btnIncrement;
	private JPanel panel;
	private Graph circleGraph;
	private Graph rectGragph;
	private JPanel lblNumber;
	
	
	public IntegerDisplay() {
		initComponent();
		value = new Value(0);
		value.addValueListener(this);
		value.addValueListener(circleGraph);
		value.addValueListener(rectGragph);
		value.addValueListener((ValueListener) lblNumber);
		
	}

	private void initComponent() {
		setTitle("Integer Display");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lbl8Title = new JLabel("8진수");
		panel.add(lbl8Title);
		lbl8Title.setForeground(Color.BLACK);
		lbl8Title.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblOctal = new JLabel("0");
		panel.add(lblOctal);
		lblOctal.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl10Title = new JLabel("10진수");
		panel.add(lbl10Title);
		lbl10Title.setForeground(Color.BLACK);
		lbl10Title.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblDecimal = new JLabel("0");
		panel.add(lblDecimal);
		lblDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lbl16title = new JLabel("16진수");
		panel.add(lbl16title);
		lbl16title.setForeground(Color.BLACK);
		lbl16title.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lblHexaDecimal = new JLabel("0");
		panel.add(lblHexaDecimal);
		lblHexaDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnIncrement = new JButton("+");
		panel.add(btnIncrement);
		btnIncrement.addActionListener(this);
		btnIncrement.setFont(new Font("굴림", Font.PLAIN, 30));
		
		btnDecrement = new JButton("-");
		panel.add(btnDecrement);
		btnDecrement.addActionListener(this);
		btnDecrement.setFont(new Font("굴림", Font.PLAIN, 30));
		
		circleGraph = Graph.createGraph(GraphType.CIRCLE, 100, 100);
		contentPane.add(circleGraph, BorderLayout.EAST);
		
		rectGragph = Graph.createGraph(GraphType.RECTANGLE, 100, 50);
		contentPane.add(rectGragph, BorderLayout.SOUTH);
		
		lblNumber = BinaryPanel.getInstance();
		
		contentPane.add(lblNumber, BorderLayout.WEST);
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
	}
	
	@Override
	public void valueChanger(ValueChangeEvent e) {
		if(e.getSource() == value){
			Value v = e.getSource();
			lblOctal.setText(Integer.toOctalString(v.getValue()));
			lblDecimal.setText(Integer.toString(v.getValue()));
			lblHexaDecimal.setText(Integer.toHexString(v.getValue()));
		}
		
	}
}
