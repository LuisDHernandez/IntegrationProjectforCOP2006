
public class ArrayFunction {
    // Luis D. Hernandez
    // COP 2006
    // Array usage in main method to run simple mathematics and logic

    public static void projectArray(int Strength, int Agility, int Intelligence, int Stamina) {
        int[] BonusArray = { Strength, Agility, Intelligence, Stamina };
        int sum = 0;
        for (int i = 0; i < BonusArray.length; i++) {
            sum += BonusArray[i];
        }
        // System.out.println("The sum of the array with your Reputation is : " + sum);
        // outputs the sum of the random numbers generated
        int avgSum = sum / BonusArray.length;
        // System.out.println("The average between them is : " + avgSum);
        // outputs 18
        int min = (int) Math.pow(9, 7);
        int max = (int) Math.pow(-9, 7);

        for (int j = 0; j < BonusArray.length; j++) {
            if (min > BonusArray[j]) {
                min = BonusArray[j];
            }
            // min = min > BonusArray[j]
        }
        for(int k = 0; k <BonusArray.length;k++) {
            if(max < BonusArray[k]) {
                max = BonusArray[k];
            }
        }
        System.out.println("The minimum number  in the array of Skills is " + min + ".\nThe maximum"
                + " number in the array of Skills is "+ max+".\n"+ "The "
                + "average sum of your skills is " + avgSum + ".");
    }
}
