package pkgRefatoracaoParteDois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }
    public static void Area(){
        Scanner Vteclado = new Scanner(System.in);
        double V1 =0;
        double V2 =0;
        double v3=0;

        System.out.println("Escreva o Primeiro Valor");
        V1 = Vteclado.nextInt();
        System.out.println("Escreva o Segundo Valor");
        V2 = Vteclado.nextInt();
        v3 = (V1 * V2)/2;

        System.out.println("A area do losango e: " + v3);
    }
    public static void Temperatura(){
        Scanner Vteclado = new Scanner(System.in);
        double V1 =0;
        double V2 =0;

        System.out.println("Escreva A temperatura em Celsius");
        V1 = Vteclado.nextInt();
        V2 = (V1 * 1.8)/+32;

        System.out.println("A temperatura em F e: " + V2);
    }
    public static void Salario(){
        Scanner Vteclado = new Scanner(System.in);
        double V1 =0;
        double V2 =0;
        double v3=0;

        System.out.println("Escreva o Valor do Salario Minimo");
        V1 = Vteclado.nextInt();
        System.out.println("Escreva o Valor do Salario do funcionario");
        V2 = Vteclado.nextInt();
        v3 = (V2 / V1);

        System.out.println("O funcionario recebe: " + v3 + "Salarios minimos");
    }
    public static void Catetos(){
        Scanner Vteclado = new Scanner(System.in);
        double V1 =0;
        double V2 =0;
        double v3=0;

        System.out.println("Escreva o Valor do Primeiro Cateto");
        V1 = Vteclado.nextInt();
        System.out.println("Escreva o Valor do Segundo Cateto");
        V2 = Vteclado.nextInt();
        v3 = (V2 * V2) + (V1 * V1);

        System.out.println("A hipotenusa e: " + v3 );
    }
    public static void Raio(){
        Scanner Vteclado = new Scanner(System.in);
        double V1 =0;
        double V2 =0;
        double v3=0;

        System.out.println("Escreva o Valor do Raio");
        V1 = Vteclado.nextInt();
        v3 = (V2 * V2) + (V1 * V1);

        System.out.println("O comprimento da esfera e: " + (2 * 2.14 * v3) );
        System.out.println("A Area da esfera e: " + (2.14 * (v3 * v3)) );
        System.out.println("O Volume da esfera e: " + ((3/4) * 3.14 * (v3*v3)) );
    }
}
