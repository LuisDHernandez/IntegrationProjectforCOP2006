
public class UltimateCannon {
    public static int theUltimateAnswer(String userAnswer,int Reputation,String userName) {
        // infinity has 8 char
        int theAnswerFromPlayer = userAnswer.length();
       
                if (theAnswerFromPlayer == 8) {
                    Reputation += 4;
                    System.out.println("Amazing! You did it! The meteor was blown to pieces! "
                            + "You saved "
                            + "the Earth! Thank you, "+ userName +"!");
                }
                else {
                    System.out.println("It's too late.... we're done for!!!");
                    Reputation -=4;
                }
        return Reputation;
        
    }
}
