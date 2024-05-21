public class Operadores {
    
    public static void main(String[] args) {
        int num1, num2;

        num1 = 5;
        num2 = 6;

        boolean simNao = num1 == num2;

        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = num1 != num2;

        System.out.println("Numero1 é diferente de numero2? " + simNao);

        simNao = num1 > num2;

        System.out.println("Numero1 é maior que numero2? " + simNao);

        simNao = num1 < num2;

        System.out.println("Numero1 é menor que numero2? " + simNao);
    }
}
