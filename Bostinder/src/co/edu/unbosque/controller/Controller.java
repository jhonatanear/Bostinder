package co.edu.unbosque.controller;

import java.awt.event.ActionListener;

import co.edu.unbosque.view.Login;

public class Controller {
	
	private Login login;
	private String usuario, pass;
	
	public Controller() {
		login = new Login();
		iniciarApp();
		asignarOyentes();
	}
	
	public void iniciarApp() {
		
		login.setVisible(true);
		login.setLocationRelativeTo(null);
	}
	
	public void asignarOyentes() {
		login.getButton();
	}
	

}
