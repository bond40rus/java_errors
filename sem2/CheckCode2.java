package sem2;

public class CheckCode2 {
    public static void main(String[] args) {
        division();
    }

    private static void division() {
        try {
            int[] intArray = { 1, 2, 3, 4, 5, 6, 7};
            int d = 0;  
            try {
                double catchedRes1 = intArray[5] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArrayIndexOutOfBoundsException p) {
                System.out.println("вышли за предел массива");
            }
        } catch (ArithmeticException e) {
            System.out.println("ошибка: " + e);
        }
    }
}
