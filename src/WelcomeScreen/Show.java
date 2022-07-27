package WelcomeScreen;

import java.util.ArrayList;

public class Show {
    private String Text1 ="Hello Welcome To The Application LockedMe.com";
    private String Text2 ="Developer Details-Developed By: Geerija Chakraborty";
    private ArrayList<String> a1= new ArrayList<>();
    public ShowScreen()
    {
        a1.add("1. Show Files: ");
        a1.add("2. Files List: ");
        a1.add("3. quit");
    }
    public void MainScreen()
    {
        System.out.println(Text1);
        System.out.println(Text2);

    }

}
