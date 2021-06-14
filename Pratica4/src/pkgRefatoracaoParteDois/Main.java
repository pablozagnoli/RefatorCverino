package pkgRefatoracaoParteDois;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Prefeitura();

    }
    public static void Notas(){
        Scanner vReadLine = new Scanner(System.in);
        int vNalunos = 1;
        double[] vNotas = new double[vNalunos];
        double[] vPresenca = new double[vNalunos];

        for (int i = 0; vNotas[i] > 0; i++){

            System.out.println("Escreva a nota do aluno Numero" + i);
            vNotas[i] = Double.parseDouble(vReadLine.nextLine());
            System.out.println("Escreva a presença do aluno Numero" + i);
            vPresenca[i] = Double.parseDouble(vReadLine.nextLine());
            vNalunos ++;
        }
    }
    public static void Canais(){
        Scanner vReadLine = new Scanner(System.in);
        int vNalunos = 1;
        double[] vPessoas = new double[vNalunos];
        double[] vCanais = new double[vNalunos];

        for (int i = 0; vPessoas[i] > 0; i++){

            System.out.println("Escreva a nota do aluno Numero" + i);
            vPessoas[i] = Double.parseDouble(vReadLine.nextLine());
            System.out.println("Escreva a presença do aluno Numero" + i);
            vCanais[i] = Double.parseDouble(vReadLine.nextLine());
            vNalunos ++;
        }

    }
    public static void Prefeitura() {
        Scanner vReadLine = new Scanner(System.in);
        ArrayList<Integer> vFilhos = new ArrayList();
        ArrayList<Double> vSalario = new ArrayList();
        int vMediaFilhos = 0;
        double vMediaSalario = 0;

        for (int i = 0; vSalario.get(i) > 0; i++) {
            System.out.println("Digite o Salario");
            vSalario.add(Double.parseDouble(vReadLine.nextLine()));
            System.out.println("Digite os Filhos");
            vFilhos.add(Integer.parseInt(vReadLine.nextLine()));
        }
        for (int i = 0; i < vSalario.size(); i++){
            vMediaFilhos = vMediaFilhos + vFilhos.get(i);
            vMediaSalario = vMediaSalario + vSalario.get(i);
        }
        System.out.println(vMediaFilhos);
        System.out.println(vMediaSalario);
    }
}
