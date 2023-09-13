import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Inicializando variaveis
        double valorUm;
        double valorDois;
        double soma;

        //Ditando a ideia do programa
        Scanner somaValor = new Scanner(System.in); //coleta o valor da entrada
        System.out.println("Digite seu primeiro número:");//Digita no console
        valorUm=somaValor.nextDouble();//Guarda na variavel o primeiro número solicitado na variável
        System.out.println("Digite seu segundo número:");//Digita no console
        valorDois=somaValor.nextDouble();//Guarda na variavel o primeiro número solicitado na variável
        soma=valorUm+valorDois; //Função de soma do programa
        System.out.println("A soma é:"+soma); // Exibe a soma
    }
}