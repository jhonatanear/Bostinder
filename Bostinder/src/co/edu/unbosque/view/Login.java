package co.edu.unbosque.view;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField text;
	private JPasswordField pass;
	private JLabel label;
	private JButton button;

	public Login() {
		
		setTitle("Bostinder");
		Image icon = new ImageIcon(getClass().getResource("/images/icon.png")).getImage();
        setIconImage(icon);
        setBounds(100, 100, 390, 672);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniComp();
	}
	
	public void iniComp() {
		
		panel = new JPanel();
		setContentPane(panel);
		panel.setLayout(null);
		
		// Titulo 
		JLabel titulo = new JLabel("BOSTINDER");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.white);
		titulo.setFont(new Font("Times New Roman", Font.BOLD, 45));
		titulo.setBounds(50, 180, 270, 50);
		panel.add(titulo);
		
		// Usuario
		JLabel labelUser = new JLabel("Usuario:");
		labelUser.setHorizontalAlignment(SwingConstants.TRAILING);
		labelUser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labelUser.setBounds(40, 300, 86, 34);
		panel.add(labelUser);
		
		text = new JTextField();
		text.setForeground(Color.black);
		text.setFont(new Font("Times New Roman", Font.BOLD, 18));
		text.setBounds(170, 305, 130, 24);
		panel.add(text);
		
		// Contraseña
		JLabel labelPass = new JLabel("Contraseña:");
		labelPass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		labelPass.setBounds(60, 350, 106, 34);
		panel.add(labelPass);
		
		pass = new JPasswordField();
		pass.setForeground(Color.black);
		pass.setToolTipText("Contraseña");
		pass.setFont(new Font("Times New Roman", Font.BOLD, 18));
		pass.setBounds(170, 355, 130, 24);
		panel.add(pass);
		
		// Iniciar Sesion
		JLabel buttonLabel = new JLabel("Iniciar Sesión");
		buttonLabel.setForeground(Color.white);
		buttonLabel.setHorizontalAlignment(SwingConstants.CENTER);
		buttonLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		buttonLabel.setBounds(120, 430, 138, 34);
		panel.add(buttonLabel);
		
		// Registrarse
		label = new JLabel("Registrate");
		label.setForeground(Color.white);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(120, 480, 138, 34);
		panel.add(label);
			
		// Imagen de fondo  
		JLabel label = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/images/background.png")).getImage();
		label.setIcon(new ImageIcon(img1));
		label.setBounds(0, 0, 390, 672);
		panel.add(label);
	}

	
	public JTextField getText() {
		return text;
	}

	public void setText(JTextField text) {
		this.text = text;
	}

	public JPasswordField getPass() {
		return pass;
	}

	public void setPass(JPasswordField pass) {
		this.pass = pass;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

}