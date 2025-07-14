//Sua empresa exige que todos os funcionários utilizem e-mails corporativos com o domínio @company.com.
// O objetivo deste desafio é criar um programa que valide se o e-mail informado corresponde ao domínio correto.
// Caso o e-mail não tenha o domínio correto, o sistema deverá indicar que o domínio não é válido.
package br;

import java.util.Scanner;

public class CorporateEmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedDomain = "@company.com";
        String email = scanner.nextLine().trim();

        // TODO: Verifique se o e-mail contém o domínio esperado

        if (email.toLowerCase().endsWith(expectedDomain)) {
            System.out.println("E-mail valido");
        } else {
            System.out.println("E-mail invalido");
        }
        scanner.close();

    }
}
