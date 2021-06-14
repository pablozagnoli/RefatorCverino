package pkgRefatoracaoParteDois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
    public static void Numeros(){
        Scanner vReadLine = new Scanner(System.in);
        int[] vNumeros = new int[10];
        int vNumerosN =0;
        for (int i = 0; i < 10; i++){

            System.out.println("Digite o valor");
            vNumeros[i] = Integer.parseInt(vReadLine.nextLine());
            if (vNumeros[i] < 0){
                vNumerosN ++;
            }
            System.out.println("Foram digitados " + vNumerosN+ " Numeros negativos");
        }
    }
    public static void NumerosNegativos(){
        int vNumeros = 0;
        for (int i = 7; i > 20; i++){
            vNumeros = vNumeros + i;
        }
        System.out.println("Os Valores entra 7 e 20 sao " );
    }
    public static void NumerosNegativosDigitados(){
        Scanner vReadLine = new Scanner(System.in);
        int vNumer0 =0;
        int vNumero1 = 0;

        System.out.println("Digite o Primeiro Numero ");
        vNumer0 = Integer.parseInt(vReadLine.nextLine());
        System.out.println("Digite o segundo Numero");
        vNumero1 = Integer.parseInt(vReadLine.nextLine());
        int vNumeros = 0;

        for (int i = vNumer0; i > vNumero1; i++){
            vNumeros = vNumeros + i;
        }
        System.out.println("Os Valores entra 7 e 20 sao " );
    }
    public static void Fatorial(){
        Scanner vReadLine = new Scanner(System.in);
        int vNumer0 =0;
        int vCount = 0;
        int vResult = 0;

        vNumer0 = vReadLine.nextInt();
        while (vResult > 2){
            vResult = vNumer0 - 1;
            vCount ++;
        }
        System.out.println("O Vetorial e: " + vCount );

    }
}
