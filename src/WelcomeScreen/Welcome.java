package WelcomeScreen;
//Code to display the welcome screen. It should display:
//
//   Application name and the developer details
//   The details of the user interface such as options displaying the user interaction information
//   Features to accept the user input to select one of the options listed


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {
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
        System.out.println("\n");
        DisplayShow();

    }
    public void DisplayShow()
    {
        System.out.println("Final list ");
        for (String v:a1);
        {
            System.out.println(v);
        }

    }
    public void FetchInput()
    {
        int optionChosen =0;
        while ((optionChosen =this.getOption())!=3)
        {
            this.linkOption(optionChosen);
        }
    }
    public void linkOption(int choice)
    {
        switch (choice)
        {
            case 1: this.ContentDisplay();
                this.DisplayShow();
                break;
            case 2:
                ScreenService.setCurrentScreen(ScreenService.FileOptionsScreen);
                ScreenService.getCurrentScreen().Show();
                ScreenService.getCurrentScreen().GetUserInput();
                this.DisplayShow();
                break;
            default:
                System.out.println("Selected choice not available");
                break;
        }
    }
    private int getOption()
    {
        Scanner in =new Scanner(System.in);
        int returnOption=0;
        try{
            returnOption=in.nextInt();
        }
        catch (InputMismatchException exception)
        {
        }
        return returnOption;
    }
}
