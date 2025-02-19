import java.util.Scanner;

public class IFElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Maior de idade ou menor
        System.out.print("Digite sua idade");
        int idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

        //Par ou Impar
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero % 2 ==0) {
            System.out.println(numero + " É par");
        } else {
            System.out.println(numero + " É impar");
        }


        // Aposentadoria
        System.out.println("Digite sua idade para verificarmos se você está apto a aposentadoria: ");
        int idadeAposentadora = scanner.nextInt();

        System.out.println("Digite o tempo de contribuição");
        int tempoDeContribuicao = scanner.nextInt();

        if(idadeAposentadora >= 65 || tempoDeContribuicao >= 30 ) {
            System.out.println("Você pode solicitar a aposentadoria");
        } else {
            System.out.println("Vai trabaia");
        }

        //Nota do Estudante
        System.out.println("Informe sua nota (0 - 10): ");
        int notaEscolar = scanner.nextInt();

        if(notaEscolar >= 7) {
            System.out.println("Parabéns! você foi aprovado.");
        } else if (notaEscolar == 5){
            System.out.println("Você passou na média");
        } else {
            System.out.println("Você reprovou!");
        }

        //Velocidade
        System.out.println("Informe a velocidade que você esta: ");
        int velocidadeKm = scanner.nextInt();

        if(velocidadeKm > 80) {
            System.out.println("Você está acima da velocidade permitida!");
        } else {
            System.out.println("Você está na velocidade permitida pela via!");
        }
    }
}

