//9.  Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables. There are stress and fire tests for each products.

import java.util.Scanner;

interface Furniture {
    void stressTest();
    void fireTest();
}

abstract class Chair implements Furniture {
    public abstract String chairType();

}
abstract class Table implements Furniture {
    public abstract String tableType();
}

class MetalChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Stress test score: 10");
    }

    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    @Override
    public String chairType() {
        return "Metal Chair: ";
    }
}

class MetalTable extends Table {
    @Override
    public void stressTest() {
        System.out.println("Stress test score: 10");

    }

    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    @Override
    public String tableType() {

        return "Metal Table";
    }
}


class WoodenTable extends Table {
    @Override
    public void stressTest() {

        System.out.println("Stress test score: 6");
    }

    @Override
    public void fireTest() {

        System.out.println("Failed fire Test");
    }

    @Override
    public String tableType() {

        return "Wooden Table: ";
    }
}


class WoodenChair extends Chair {
    @Override
    public void stressTest() {
        System.out.println("Stress test score: 7");
    }

    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    @Override
    public String chairType() {
        return "Wooden chair";
    }
}

public class Q9 {
    public static void main(String[] args){
        Table table = null;
        Chair chair = null;
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter metal or wooden?");
        String str = input.next();

        if(str.equals("wooden")){
            table = new WoodenTable();
            chair = new WoodenChair();

        }   else if (str.equals("metal")){
            table = new MetalTable();
            chair = new MetalChair();
        }

        System.out.println(table.tableType());
        table.stressTest();
        table.fireTest();

        System.out.println("\n"+chair.chairType());
        chair.stressTest();
        chair.fireTest();

    }
}