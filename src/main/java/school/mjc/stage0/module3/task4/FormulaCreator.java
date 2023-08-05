package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        //double a = 2.0;
        //double b = 3.0;

        //double formula =(9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2) ;
        //double var = (9 * a * a - 5 * b + 2 + a - 7) * (a + b - 4 * a * b) / 2;
        int a = 2;
        int b = 3;
        int result;

        result = (9 * (a * a) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        System.out.println(result);

        // System.out.println("9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2");

    }
}
