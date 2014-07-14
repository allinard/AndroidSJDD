package com.example.asmaprediccio.utils;

public class LoginHospSJD {

	/** Constructeur priv� */
	private LoginHospSJD() {
	}

	/** Instance unique pr�-initialis�e */
	private static LoginHospSJD INSTANCE = new LoginHospSJD();
	
	private String currentUserLoggedIn;
	
	/** Point d'acc�s pour l'instance unique du singleton */
	public static LoginHospSJD getInstance() {
		return INSTANCE;
	}

	/**
	 * Permet l'authentification
	 * @param userName le nom d'utilisateur entr�
	 * @param passWord le mdp entr�
	 * @return si l'authentification est effectu�e
	 */
	public boolean logIn(String userName, String passWord){
		if(userName.equals("test")&&passWord.equals("test")){
			setCurrentUserLoggedIn(userName);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void logOut(){
		setCurrentUserLoggedIn(null);
	}
	
	
	public String getCurrentUserLoggedIn() {
		return currentUserLoggedIn;
	}

	public void setCurrentUserLoggedIn(String currentUserLoggedIn) {
		this.currentUserLoggedIn = currentUserLoggedIn;
	}

}
