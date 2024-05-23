import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal;
        System.out.println("Digite um número decimal: ");
        decimal = sc.nextInt();

        toOctal(decimal);

        sc.close();
    }
    
    public static String toOctal(int decimal) {    
        int resto; // declarando uma variável para armazenar o resto  
        String octal = ""; // declarando uma variável para armazenar o número octal  
        // declarando um array de caracteres que representam os dígitos octais  
        char octalchars[] = {'0', '1', '2', '3', '4', '5', '6', '7'};  
    
        while (decimal > 0) {  
            resto = decimal % 8;  // calculando o resto da divisão do número decimal por 8  
            octal = octalchars[resto] + octal;  // encontrando o caractere octal correspondente e adicionando à string 'octal'
            decimal = decimal / 8;  // atualizando o número decimal dividindo-o por 8  
        }  
        System.out.printf("O número em octal é %s", octal);
        return octal;  // retornando a representação octal como uma string  
    }
}
