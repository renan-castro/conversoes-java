import java.util.Scanner;

public class BinaryToOthers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        do{
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Conversão de binário para decimal");
            System.out.println("2. Conversão de binário para octal");
            System.out.println("3. Conversão de binário para hexadecimal");
            System.out.print("Opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    binaryToDecimal(sc);
                    break;
                case 2:
                    binaryToOctal(sc);
                    break;
                case 3:
                    binaryToHexa(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(option != 0);
        sc.close();
    }

    public static void binaryToDecimal(Scanner sc){
        System.out.println("Digite o número em binário: ");
        String binaryNumber = sc.next();
        int decimalNumber=Integer.parseInt(binaryNumber,2);
        System.out.println("O número em decimal é: " + decimalNumber);

        //O método parseInt analisa a string binaryNumber e interpreta-a como um número na base 2 (binário). Ele percorre os dígitos da string, da esquerda para a direita, e multiplica cada dígito pelo valor correspondente de potência de 2, dependendo da posição do dígito. Por exemplo, o último dígito (o menos significativo) é multiplicado por 2^0, o penúltimo por 2^1, e assim por diante.

        // Depois de calcular o valor para cada dígito, ele soma todos esses valores para obter o valor decimal correspondente ao número binário representado pela string. O resultado é então retornado como um número inteiro.
    }

    public static void binaryToOctal(Scanner sc){
         // Solicita ao usuário que insira o número binário
         System.out.print("Digite um número binário: ");
         String binaryString = sc.next();
         
         // Primeiro, convertemos o número binário para decimal
         int decimal = Integer.parseInt(binaryString, 2);
        
        // Em seguida, convertemos o número decimal para octal
        String octal = Integer.toOctalString(decimal);

        System.out.println("O número em octal é " + octal);

        // O método toOctalString então converte o número inteiro decimal para sua representação octal. Ele faz isso dividindo repetidamente o número decimal por 8 e armazenando os restos das divisões. Em seguida, ele concatena esses restos na ordem inversa para formar a representação octal do número.
    }

    public static void binaryToHexa(Scanner sc){
        System.out.print("Digite um número binário: ");
         String binaryString = sc.next();

          // Primeiro, convertemos o número binário para decimal
          int decimal = Integer.parseInt(binaryString, 2);

          // Em seguida, convertemos o número decimal para hexadecimal
          String hexadecimal = Integer.toHexString(decimal);

          System.out.println("O número em hexadecimal é " + hexadecimal.toUpperCase());
    }

}