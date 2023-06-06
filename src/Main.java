public class Main {


    public static void main(String[] args) {

        // Task 1.2.

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int total =0;
        for (int i = 0; i < myArray.length; i++)
            total += myArray[i];

        // Task 1.3.

        int[] myArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for (int i = 0; i < myArray.length; i++);
        int countdown = 10;
        for (countdown = 10; countdown >= 1; countdown --){
            System.out.println("До начала: " + countdown);
        }

        }



}





//        for (int i = 0; i < myArray.length; i++) {
//            if (i != i) {
//                System.out.println("Повторяющихся элементов нет");
//            }


//
//            {
////          if (myArray[i] != true && myArray[i].equals (myArray[j]))
//              System.out.println("Повторяющихся элементов нет");
//            }
//        }



//    }

