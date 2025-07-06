package br;

import java.util.Scanner;

public class salarioTransfer {

    public static void main(String[] args) {

        Scanner leitordeEntrada = new Scanner(System.in);
        float valorSalario = leitordeEntrada.nextFloat();
        float valorBeneficio = leitordeEntrada.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }


        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));


    }
}
