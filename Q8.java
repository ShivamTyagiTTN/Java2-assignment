//8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character.

import java.util.Scanner;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("done"))
                break;
            else if (str.charAt(0) == str.charAt(str.length() - 1))
                System.out.println("Equal");
            else
                System.out.println("Unequal");
        }
    }
}