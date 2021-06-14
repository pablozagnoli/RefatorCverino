package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("hellow");
    }
    public void tipoDeTrinangulo(){
    int lA=0, lB =0, lC =0;
        Scanner vReadLine = new Scanner(System.in);
        System.out.println("Por favor escreva o primeiro valor");
        lA = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o segundo valor");
        lB = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o terceiro valor");
        lC = Integer.parseInt(vReadLine.nextLine());

        if (lA == lB && lB == lC){
            System.out.println("Equilatero");
        }
        else if (lA == lB && lB != lC || lA !=lB && lB == lC ){
            System.out.println("Isosceles");
        }
        else if (lA != lB && lB != lC){
            System.out.println("Escaleno");
        }
    };

    public void mediaAluno (){

        int nA=0, nB =0, nC =0, mG =0;
        Scanner vReadLine = new Scanner(System.in);
        System.out.println("Por favor escreva o primeiro valor");
        nA = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o segundo valor");
        nB = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o terceiro valor");
        nC = Integer.parseInt(vReadLine.nextLine());

        mG = (nA + nB + nC) / 3;

        if (mG <=0 || mG < 3){
            System.out.println("Reprovado");
        }
        else if (mG >=3 && mG < 7 ){
            System.out.println("Exame");
        }
        else if (mG >=7 || mG <= 10){
            System.out.println("Aprovado");
        }
    };
    public void imc (){
        int nA=0, nB =0, imcG =0;
        Scanner vReadLine = new Scanner(System.in);
        System.out.println("Por favor escreva a altura ");
        nA = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o peso");
        nB = Integer.parseInt(vReadLine.nextLine());

        imcG = nB / nA;

        if (imcG < 20 ){
            System.out.println("Abaixo do Peso");
        }
        else if (imcG >= 20 || imcG <= 25){
            System.out.println("Sobre peso");
        }
        else if (imcG >= 25 || imcG <= 30){
            System.out.println("Acima do peso");
        }
        else if (imcG >= 30 || imcG <= 40){
            System.out.println("obesidade");
        }
        else if (imcG > 40){
            System.out.println("obesidade");
        }
    };

    public void funcao(){

        int nA=0, nB =0, nC =0, mG =0;
        Scanner vReadLine = new Scanner(System.in);
        System.out.println("Por favor escreva o primeiro valor");
        nA = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o segundo valor");
        nB = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Por favor escreva o terceiro valor");
        nC = Integer.parseInt(vReadLine.nextLine());

    }
}
