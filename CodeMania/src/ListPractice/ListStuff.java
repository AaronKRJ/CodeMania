package ListPractice;

import java.util.ArrayList;
import java.util.List;

class ListStuff
{
    public static void makeList(String varType)
    {
        // Checking Input
        switch (varType)
        {
            case "int":
                List<Integer> intList = new ArrayList<Integer>();
                intList.add(4);
                intList.add(53);
                intList.add(22);
                System.out.println(intList);
                break;
            case "float":
                List<Float> floatList = new ArrayList<Float>();
                floatList.add(23.3f);
                floatList.add(244.53f);
                floatList.add(76f);
                System.out.println(floatList);
                break;
            case "boolean":
                List<Boolean> booleanList = new ArrayList<Boolean>();
                booleanList.add(true);
                booleanList.add(false);
                System.out.println(booleanList);
                break;
            case "String":
                List<String> stringList = new ArrayList<String>();
                stringList.add("Jason");
                stringList.add("Clavicus");
                stringList.add("Ysgramor");
                System.out.println(stringList);
                break;
            case "double":
                List<Double> doubleList = new ArrayList<Double>();
                doubleList.add(3.23526626);
                doubleList.add(1.42426624626);
                doubleList.add(6.26858290265290165195025);
                System.out.println(doubleList);
                break;
            default:
                System.out.println("Unsupported List type");
                break;
        }
    }
}
