package refactoring.chap12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BinaryPanel extends JPanel implements ValueListener{
	private static final BinaryPanel instance = new BinaryPanel();
	
	public static BinaryPanel getInstance() {
		return instance;
	}
	private JLabel lblBinary;
	
	private BinaryPanel() {
		setLayout(new BorderLayout(0,0));
		lblBinary = new JLabel();
		lblBinary.setForeground(Color.blue);
		lblBinary.setFont(new Font("굴림",Font.BOLD, 20));
		add(lblBinary);
	}

	@Override
	public void valueChanger(ValueChangeEvent e) {
		Value value = e.getSource();
		lblBinary.setText(Integer.toBinaryString(value.getValue()));
	}
}
