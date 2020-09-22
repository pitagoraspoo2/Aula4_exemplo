package br.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.controller.UserLoger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUser extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JTextField textFieldSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUser frame = new LoginUser();
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
	public LoginUser() {
		setTitle("Janela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(70, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(70, 110, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(126, 56, 206, 20);
		contentPane.add(textFieldLogin);
		textFieldLogin.setColumns(10);
		
		textFieldSenha = new JTextField();
		textFieldSenha.setBounds(126, 107, 206, 20);
		contentPane.add(textFieldSenha);
		textFieldSenha.setColumns(10);
		
		JButton btnButtonLogar = new JButton("Logar");
		btnButtonLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				UserLoger us = new UserLoger();
				
				if (us.validacaoLogin(textFieldLogin.getText(), textFieldSenha.getText())) {
					
					JOptionPane.showMessageDialog(contentPane, "Ok, " + textFieldLogin.getText() + "Login efetuado!");
					
				} else {
					
					JOptionPane.showMessageDialog(contentPane, "Falha ao Logar", "Falha", JOptionPane.ERROR_MESSAGE);
				}
				
				
				textFieldLogin.setText("");
				textFieldSenha.setText("");

				
								
			}
		});
		btnButtonLogar.setBounds(308, 211, 89, 23);
		contentPane.add(btnButtonLogar);
	}
}
