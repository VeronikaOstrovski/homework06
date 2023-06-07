// Task 5
public class TotalWhile {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int summa = 0;
        for (int i = 0; i < array.length; i++)
            summa = summa + array[i];
        while (summa > 0) {
            System.out.println("summa " + summa);
        }
    }
}