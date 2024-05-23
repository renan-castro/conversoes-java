import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Conversão de hexadecimal para binário");
            System.out.println("2. Conversão de decimal para octal");
            System.out.println("3. Subtração de números binários");
            System.out.println("4. Divisão de números binários");
            System.out.println("5. Portas lógicas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (option) {
                case 1:
                    hexToBinary(scanner);
                    break;
                case 2:
                    decimalToOctal(scanner);
                    break;
                case 3:
                    subtractBinary(scanner);
                    break;
                case 4:
                    divideBinary(scanner);
                    break;
                case 5:
                    logicGate(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 0);

        scanner.close();
    }

    public static void hexToBinary(Scanner scanner) {
        System.out.print("Digite um número hexadecimal: ");
        String hex = scanner.nextLine();
        String binary = new java.math.BigInteger(hex, 16).toString(2);
        System.out.println("Binário: " + binary);
    }

    public static void decimalToOctal(Scanner scanner) {
        System.out.print("Digite um número decimal: ");
        int decimal = scanner.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }

    public static void subtractBinary(Scanner scanner) {
        System.out.print("Digite o primeiro número binário: ");
        String bin1 = scanner.next();
        System.out.print("Digite o segundo número binário: ");
        String bin2 = scanner.next();
        int decimal1 = Integer.parseInt(bin1, 2);
        int decimal2 = Integer.parseInt(bin2, 2);
        int result = decimal1 - decimal2;
        String binarySubtraction = Integer.toBinaryString(result);
        System.out.println("Resultado da subtração binária: " + binarySubtraction);
    }

    public static void divideBinary(Scanner scanner) {
        System.out.print("Digite o dividendo binário: ");
        String dividend = scanner.next();
        System.out.print("Digite o divisor binário: ");
        String divisor = scanner.next();
        int decimalDividend = Integer.parseInt(dividend, 2);
        int decimalDivisor = Integer.parseInt(divisor, 2);
        int result = decimalDividend / decimalDivisor;
        String binaryDivision = Integer.toBinaryString(result);
        System.out.println("Resultado da divisão binária: " + binaryDivision);
    }

    public static void logicGate(Scanner scanner) {
        int optionLogic;
        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. AND");
            System.out.println("2. OR");
            System.out.println("3. NOT");
            System.out.println("4. NAND");
            System.out.println("5. NOR");
            System.out.println("6. XOR");
            System.out.println("7. XNOR");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            optionLogic = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (optionLogic) {
                case 1:
                    logicOperation("AND", scanner);
                    break;
                case 2:
                    logicOperation("OR", scanner);
                    break;
                case 3:
                    logicOperation("NOT", scanner);
                    break;
                case 4:
                    logicOperation("NAND", scanner);
                    break;
                case 5:
                    logicOperation("NOR", scanner);
                    break;
                case 6:
                    logicOperation("XOR", scanner);
                    break;
                case 7:
                    logicOperation("XNOR", scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (optionLogic != 0);
    }

    public static void logicOperation(String operation, Scanner scanner) {
        System.out.print("Digite a primeira entrada binária para a porta " + operation + ": ");
        String input1 = scanner.next();
        System.out.print("Digite a segunda entrada binária para a porta " + operation + ": ");
        String input2 = scanner.next();

        switch (operation) {
            case "AND":
                System.out.println("Resultado da porta AND: " + logicalAnd(input1, input2));
                break;
            case "OR":
                System.out.println("Resultado da porta OR: " + logicalOr(input1, input2));
                break;
            case "NOT":
                System.out.println("Resultado da porta NOT: " + logicalNot(input1));
                break;
            case "NAND":
                System.out.println("Resultado da porta NAND: " + logicalNand(input1, input2));
                break;
            case "NOR":
                System.out.println("Resultado da porta NOR: " + logicalNor(input1, input2));
                break;
            case "XOR":
                System.out.println("Resultado da porta XOR: " + logicalXor(input1, input2));
                break;
            case "XNOR":
                System.out.println("Resultado da porta XNOR: " + logicalXnor(input1, input2));
                break;
        }
    }

    public static String logicalAnd(String input1, String input2) {
        int length = Math.min(input1.length(), input2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char bit1 = input1.charAt(i);
            char bit2 = input2.charAt(i);
            result.append((bit1 == '1' && bit2 == '1') ? '1' : '0');
        }
        return result.toString();
    }

    public static String logicalOr(String input1, String input2) {
        int length = Math.min(input1.length(), input2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char bit1 = input1.charAt(i);
            char bit2 = input2.charAt(i);
            result.append((bit1 == '1' || bit2 == '1') ? '1' : '0');
        }
        return result.toString();
    }

    public static String logicalNot(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char bit = input.charAt(i);
            result.append(bit == '1' ? '0' : '1');
        }
        return result.toString();
    }

    public static String logicalNand(String input1, String input2) {
        String andResult = logicalAnd(input1, input2);
        return logicalNot(andResult);
    }

    public static String logicalNor(String input1, String input2) {
        String orResult = logicalOr(input1, input2);
        return logicalNot(orResult);
    }
    
    public static String logicalXor(String input1, String input2) {
        int length = Math.min(input1.length(), input2.length());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char bit1 = input1.charAt(i);
            char bit2 = input2.charAt(i);
            result.append((bit1 == bit2) ? '0' : '1');
        }
        return result.toString();
    }
    
    public static String logicalXnor(String input1, String input2) {
        String xorResult = logicalXor(input1, input2);
        return logicalNot(xorResult);
    }
}
