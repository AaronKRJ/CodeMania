package ListPractice;

import java.util.Scanner;


// What is this project? Idk like some easy to use list "library" just do stuff
public class Main
{
    public static void main(String[] args)
    {
      init();
    }

    public static void init()
    {
        // Instance of Interfaces Test Class
        UsingInterfaces2 i2 = new UsingInterfaces2();
        i2.feed();

        // Prompt for Input
        System.out.println("Choose a type for your list");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();

        // Instance of List Class
        ListStuff ls = new ListStuff();
        ls.makeList(choice);



        // Instance of Class
        Main m = new Main();
    }



}
