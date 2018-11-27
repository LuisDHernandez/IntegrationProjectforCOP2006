
public class MonthinGame {
    // Luis D. Hernandez
    // COP 2006
    // Switch takes in parameter month to decide what case to execute
    // Exception will loop program until a proper number  is selected [1-12]

    public static String TimeOfTheYear(int month) {
        String theMonth;

        switch (month) {

            case 1:
                theMonth = "January";
                break;
            case 2:
                theMonth = "February";
                break;
            case 3:
                theMonth = "March";
                break;
            case 4:
                theMonth = "April";
                break;
            case 5:
                theMonth = "May";
                break;
            case 6:
                theMonth = "June";
                break;
            case 7:
                theMonth = "July";
                break;
            case 8:
                theMonth = "August";
                break;
            case 9:
                theMonth = "September";
                break;
            case 10:
                theMonth = "October";
                break;
            case 11:
                theMonth = "November";
                break;
            case 12:
                theMonth = "December";
                break;
            default:
                theMonth = "invalid month my guy.";
                break;
        }
        

        return theMonth;

    }

}
