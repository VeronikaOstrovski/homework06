public class Main {


    public static void main(String[] args) {

        // Task 2

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total = 0;
        for (int i = 0; i < myArray.length; i++)
            total += myArray[i];

        // Task 3

        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int countdown = 10;
        for (countdown = 10; countdown >= 1; countdown--) {
            System.out.println("До начала: " + countdown);
        }
    }
}