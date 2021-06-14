package pkgRefatoracaoParteDois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void Numeros(){
        Scanner vReadLine = new Scanner(System.in);
        int[] vNumeros = new int[10];
        int vNumerosN =0;

        for (int i = 0; i < 10; i++){

            System.out.println("Digite o valor");
            vNumeros[i] = vReadLine.nextInt();
            if (vNumeros[i] % 2 == 0){
                vNumerosN = vNumerosN + vNumeros[i];
            }

            System.out.println("A Soma dos Numeros Pares é: " + vNumerosN);
        }
    }
    public static void NumerosReais(){
        Scanner vReadLine = new Scanner(System.in);
        double[] vNumeros = new double[10];
        double vNumerosN =0;

        for (int i = 0; i < 10; i++){

            System.out.println("Digite o valor");
            vNumeros[i] = vReadLine.nextInt();

        }

        for (int i =0; i < vNumeros.length; i++){
            if (vNumeros[i] < 0){
                System.out.println(vNumeros[i]);
                System.out.println("A Posição: " + i + "Armazena um numero negativo");
            }
        }
    }
    public static void NumerosReaisMaiorMenor(){
        Scanner vReadLine = new Scanner(System.in);
        double[] vNumeros = new double[10];
        double vMaiorNumero = 0;
        double vMenorNumero = 0;


        for (int i = 0; i < 10; i++){

            System.out.println("Digite o valor");
            vNumeros[i] = vReadLine.nextInt();

        }

        for (int i =0; i < vNumeros.length; i++){

            if (vMaiorNumero < vNumeros[i]){
                vMaiorNumero = vNumeros[i];
            }
            if (vMenorNumero > vNumeros[i]){
                vMenorNumero = vNumeros[i];
            }
        }
        System.out.println("Maior numero: " + vMaiorNumero);
        System.out.println("Maior numero: " + vMenorNumero);
    }
}
