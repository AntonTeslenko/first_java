public class Calcul3 {
    public static void main(String[] args) {
        calc(6, 2, '+');
        calc(6, 2, '-');
        calc(6, 2, '/');
        calc(6, 2, '*');

    }
    static double calc(double paramA, double paramB, char operation){
        double result = 0;
        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;

            default:
            System.out.println("INCORRECT OPERATION!");
        }
        System.out.println("Calc result:" + result);
        return result;
    }
}

