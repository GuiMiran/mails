package Correo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class EnviarCorreo extends JFrame {

	private JPanel contentPane;
	private JTextField textDestino;
	private JTextField txtAsunto;
	private JTextField txtMensaje;
	
	/*
	 * Variables Correo
	 * */
	
	Correo c = new Correo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EnviarCorreo frame = new EnviarCorreo();
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
	public EnviarCorreo() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistemas de Aplicaciones ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 414, 28);
		lblNewLabel.setFont(new Font("Segoe UI Semilight", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(191, 223, 92, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				enviarCorreo();
			//lblNewLabel.setText("HOLA MUNDO");
//			String msg="";
//			if (dates.autentificacion(textUser.getText(), textPass.getText()))
//				{
//				  msg = "Correcto accedera a los sitemas de información";
//				  vent2.setVisible(true);
//				  dispose();
//				}
//			else
//				{
//				 msg =" Error, vuelva a intentarlo";
//				}
			
			//JOptionPane.showMessageDialog(null, msg);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Destino");
		lblNewLabel_1.setBounds(10, 50, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Asunto");
		lblNewLabel_2.setBounds(10, 85, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		textDestino = new JTextField();
		textDestino.setBounds(86, 50, 197, 20);
		contentPane.add(textDestino);
		textDestino.setColumns(10);
		
		txtAsunto = new JTextField();
		txtAsunto.setBounds(86, 82, 197, 20);
		contentPane.add(txtAsunto);
		txtAsunto.setColumns(10);
		
		txtMensaje = new JTextField();
		txtMensaje.setBounds(86, 126, 197, 86);
		contentPane.add(txtMensaje);
		txtMensaje.setColumns(10);
	}
	
	public void enviarCorreo()
	{
		c.setContrasenia("wtqlqzmnncogxozx");
		c.setUsuarioCorreo("pruebasejecucionprogramas@gmail.com");
		c.setMensaje(txtMensaje.getText());
		c.setAsunto(txtAsunto.getText());
		c.setDestino(textDestino.getText().trim());
		c.setNombreArchivo("logo.png");
		c.setRutaArchivo("logo.png");
		
		Controlador ctr = new Controlador();
		if (ctr.enviarCorreo(c))
		{
			JOptionPane.showMessageDialog(null, "Envio Correo");
		}
		else 
		{
			JOptionPane.showMessageDialog(null, "Error ! ");
		}
		
		
	}
	
}
