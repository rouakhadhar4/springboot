package tpex2;

public class main {

	public static void main(String[] args) {
		
	boolean erreur=false;
		do {
	try {
		
		Authentification a=new Authentification();
		
		erreur=true;
		}
	

	
		catch( WrongLoginException e ) {
			System.out.println("login incorrect");
			e.getMessage();
			e.getStackTrace();
			erreur=false;
		}
	  catch(  WrongInputLength m ) {
		System.out.println("password depasse 10");
		m.getMessage();
		m.getStackTrace();
		erreur=false;
	}
	 catch( WrongPwdException  w) {
			System.out.println("password incorrect");
			w.getMessage();
			w.getStackTrace();
			erreur=false;
		}
		
	}
	while(!erreur);
}
}
	



		
	
