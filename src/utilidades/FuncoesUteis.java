package utilidades;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FuncoesUteis {
    // Variáveis encapsuladas
    private int num1;
    private int num2;
    private int altura;

    private String arquivo;

    // metodo Construtor da minha classe
    public FuncoesUteis() {
        this.num1 = 0;
        this.num2 = 0;
        this.altura = 1; // altura mínima para o triângulo
        this.arquivo = "";
    }

    // Get e Set dos meu atributos
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getAltura() {
        return altura;
    }

   // Set validando se a Altura é maior do que 0
    public void setAltura(int altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura deve ser positiva.");
        }
    }
    public void setArquivo(String arquivo) {

        this.arquivo = arquivo;

    }

    public String getArquivo() {
        return arquivo;
    }
    // Métodos

    //Criando metodo soma num1 e num2 e retorna o valor
    public int Soma() {
        return num1 + num2;
    }

    /*Criando metodo que cria um triangulo com base na altura definida, aonde o primeiro for define o número de linhas e o
    * segundo fefine o numero de * na linha
    * */
    public void Triangulo() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*
 * Criando um metodo que le e imprime na tela as linhas de um arquivo texto utilizando
 * as classes File e Scanner do Java.
 */
    public void printArquivoComScanner() {

        File file = new File(arquivo);
        if (!file.exists()) {
            System.err.println("O arquivo " + arquivo + " não existe.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) { // Scanner declarado e instanciado aqui
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao tentar abrir o arquivo: " + e.getMessage());
        }
    }

}
