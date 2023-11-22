package tpex2;


	public class WrongLoginException extends Exception {
		WrongLoginException(String msg)
		{
			super("le login est incorrect ");
		}
		

}
