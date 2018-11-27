public class Character {
    //Luis D. Hernandez
    //COP 2006
    //class that creates object character
    // primitive use for setting and getting name

    private String name;

    public Character() {
        // System.out.println("This is the default constructor!");
        name = " not set";
    }

    public Character(String userName) {
        // System.out.println("This is the overloaded constructor!");
        userName = name;
    }

    public void setName(String userName) {
        //sets the name as input from userName in main
        name = userName;
    }

    public String getName() {
        return name;
    }
}