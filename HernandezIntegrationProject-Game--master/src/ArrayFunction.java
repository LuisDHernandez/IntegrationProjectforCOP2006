
public class ArrayFunction {

    public static void projectArray() {
        int[] BonusArray = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < BonusArray.length; i++) {
            sum += BonusArray[i];
        }
        System.out.println("The sum of the array is : " + sum);
        int avgSum = sum / BonusArray.length;
        System.out.println("The average of the sums is : " + avgSum);

    }
   }

   
      

    


