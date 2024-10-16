package main;

import utilidades.FuncoesUteis;

public class Main {
    public static void main(String[] args) {
        FuncoesUteis funcoes = new FuncoesUteis();

        // Definir os valores usando os setters
        funcoes.setNum1(5);
        funcoes.setNum2(3);
        funcoes.setAltura(5);
        funcoes.setArquivo("src/teste.txt");

        System.out.println(funcoes.Soma());
        funcoes.Triangulo();
        funcoes.printArquivoComScanner();

    }
}