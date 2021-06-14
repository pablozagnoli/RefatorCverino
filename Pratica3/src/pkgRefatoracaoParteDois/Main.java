package pkgRefatoracaoParteDois;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dados();

    }
    public static void Dados(){
        Scanner vTeclado = new Scanner(System.in);
        int vNota = 0;
        int vSalario = 0;
        int vIdade = 0;
        String vSexo = "";


        System.out.println("Digite a nota");
        vNota = Integer.parseInt(vTeclado.nextLine());
        if (vNota>0 && vNota < 11){
            System.out.println("Correto");
        }else {
            System.out.println("fora do parametro");
        }

        System.out.println("Digite o Salario");
        vSalario = Integer.parseInt(vTeclado.nextLine());
        if (vSalario>0){
            System.out.println("Correto");
        }else {
            System.out.println("fora do parametro");
        }

        System.out.println("Digite o sexo");
        vSexo = vTeclado.nextLine();
        if (vSexo == "m" || vSexo == "f"){
            System.out.println("Correto");
        }else {
            System.out.println("fora do parametro");
        }
        System.out.println("Digite a idade");
        vIdade = Integer.parseInt(vTeclado.nextLine());
        if (vIdade>0 && vIdade < 150){
            System.out.println("Correto");
        }else {
            System.out.println("fora do parametro");
        }

    }
}
