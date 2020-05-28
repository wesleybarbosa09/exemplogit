package com.wesley;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(0, 61, 102, 63);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.setBounds(0, 123, 102, 63);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(0, 184, 102, 63);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setBounds(0, 246, 102, 61);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBounds(101, 61, 102, 63);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setBounds(200, 61, 97, 63);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("/");
		btnNewButton_6.setBounds(293, 61, 97, 63);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.setBounds(101, 123, 102, 63);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("4");
		btnNewButton_7_1.setBounds(200, 123, 97, 63);
		contentPane.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("2");
		btnNewButton_7_2.setBounds(101, 184, 102, 63);
		contentPane.add(btnNewButton_7_2);
		
		JButton btnNewButton_7_3 = new JButton(".");
		btnNewButton_7_3.setBounds(101, 244, 102, 63);
		contentPane.add(btnNewButton_7_3);
		
		JButton btnNewButton_7_1_1 = new JButton("1");
		btnNewButton_7_1_1.setBounds(200, 184, 97, 63);
		contentPane.add(btnNewButton_7_1_1);
		
		JButton btnNewButton_7_1_2 = new JButton("=");
		btnNewButton_7_1_2.setBounds(200, 244, 97, 63);
		contentPane.add(btnNewButton_7_1_2);
		
		JButton btnNewButton_6_1 = new JButton("*");
		btnNewButton_6_1.setBounds(293, 123, 97, 63);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("-");
		btnNewButton_6_2.setBounds(293, 184, 97, 63);
		contentPane.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("+");
		btnNewButton_6_3.setBounds(293, 246, 97, 63);
		contentPane.add(btnNewButton_6_3);
	}
}
