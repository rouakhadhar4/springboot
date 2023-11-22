package tpex2;

import java.util.Scanner;

public class Authentification {
    final String LoginCorrect = "scott";
    final String PwdCorrect = "tiger";
    static Scanner sc = new Scanner(System.in);

    public void getUserLogin() throws WrongLoginException {
        System.out.println("Quel est le login correct? ");
        String Login = sc.nextLine();
        if (!LoginCorrect.equals(Login)) {
            throw new WrongLoginException("le login est incorrect");
        }
    }

    public void getUserPwd() throws WrongPwdException, WrongInputLength {
        boolean passwordCorrect = false;
        while (!passwordCorrect) {
            System.out.println("Quel est le password correct? ");
            String Pwd = sc.nextLine();
            if (Pwd.length() > 10) {
                System.out.println("Mot de passe incorrect. Veuillez réessayer.");
                System.out.println("Le mot de passe ne doit pas dépasser 10 caractères.");
            } else if (!PwdCorrect.equals(Pwd)) {
                System.out.println("Mot de passe incorrect. Veuillez réessayer.");
            } else {
                passwordCorrect = true;
            }
        }
    }

    Authentification() throws WrongLoginException, WrongInputLength, WrongPwdException {
        getUserLogin();
        getUserPwd();
    }
}
