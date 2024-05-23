import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número hexadecimal: ");
        String hex = scanner.nextLine();
        
        // Converte o número hexadecimal para decimal
        int decimal = Integer.parseInt(hex, 16);
        
        // Converte o número decimal para binário
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("O número binário é: " + binary);
        
        scanner.close();
    }
}