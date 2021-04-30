package ListPractice;

import EnumPractice.Flavors;
import EnumPractice.Levels;
import InterfacePractice.Bird;
import InterfacePractice.WaterBottle;

public class UsingInterfaces implements WaterBottle
{
    public static void init()
    {
        // Instance of subclass
        UsingInterfaces2 i2 = new UsingInterfaces2();
        i2.chirp();

        // Enums
        System.out.println(Flavors.BLUEBERRY + " " + Flavors.CHOCOLATE);
        System.out.println(Flavors.STRAWBERRY + " " + Flavors.VANILLA);

        System.out.println(Levels.LEVEL_1 + " " + Levels.LEVEL_2);
        System.out.println(Levels.LEVEL_3 + " " + Levels.LEVEL_4);
        System.out.println(Levels.LEVEL_5);
    }

    @Override
    public void fillUp()
    {
        System.out.println("Filled!");
    }

    @Override
    public void pourOut()
    {
        System.out.println("Emptied!");
    }

    @Override
    public void drink()
    {
        System.out.println("Drank!");
    }
}

class UsingInterfaces2 implements Bird
{
    @Override
    public void chirp()
    {
        System.out.println("Tweet Tweet!");
    }

    @Override
    public void peck()
    {
        System.out.println("Click Click!");
    }

    @Override
    public void feed()
    {
        System.out.println("chomp");
    }
}