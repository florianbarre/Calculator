package fr.imie.Calculator.Launcher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Button;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

public class Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 334, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(16, 11, 297, 23);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblAllo = new JLabel("");
		lblAllo.setBounds(0, 0, 297, 23);
		panel.add(lblAllo);
		
		JButton button = new JButton("1");
		button.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button.setBounds(16, 216, 62, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_1.setBounds(88, 216, 64, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_2.setBounds(162, 216, 62, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_3.setBounds(16, 182, 62, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_4.setBounds(88, 182, 64, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_5.setBounds(162, 182, 62, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_6.setBounds(16, 148, 62, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_7.setBounds(88, 148, 64, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_8.setBounds(162, 148, 62, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		button_9.setBounds(16, 250, 62, 23);
		frame.getContentPane().add(button_9);
		
		JButton btnNewButton = new JButton(".");
		btnNewButton.setBounds(88, 250, 64, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(250, 216, 63, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_10 = new JButton("-");
		button_10.setBounds(250, 182, 63, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("/");
		button_11.setBounds(250, 114, 63, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.setBounds(250, 148, 63, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("(");
		button_13.setBounds(16, 114, 63, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton(")");
		button_14.setBounds(89, 114, 63, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("^");
		button_15.setBounds(162, 114, 63, 23);
		frame.getContentPane().add(button_15);
		
		JButton btnNewButton_2 = new JButton("ln");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBounds(16, 46, 63, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBounds(16, 80, 63, 23);
		frame.getContentPane().add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(89, 80, 63, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(162, 80, 63, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnLog = new JButton("log");
		btnLog.setBounds(89, 46, 63, 23);
		frame.getContentPane().add(btnLog);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(162, 46, 63, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnX = new JButton("| x |");
		btnX.setBounds(250, 46, 63, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnNewButton_3 = new JButton("\u221Ax");
		btnNewButton_3.setBounds(250, 80, 63, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button_16 = new JButton("=");
		button_16.setBounds(250, 250, 63, 23);
		frame.getContentPane().add(button_16);
		
		JButton btnNewButton_5 = new JButton("Del");
		btnNewButton_5.setBounds(162, 250, 62, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u279D");
		btnNewButton_6.setBounds(162, 284, 151, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton button_17 = new JButton("\u2190");
		button_17.setBounds(16, 284, 136, 39);
		frame.getContentPane().add(button_17);
	}
}
