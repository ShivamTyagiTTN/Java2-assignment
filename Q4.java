//4. WAP to create singleton class.

class Singleton
{

    private static Singleton instance = null;
    public String str;

    private Singleton() {
        str = "Singleton class";
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
}

public class Q4
{
    public static void main(String[] args)
    {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        a.str = (b.str).toUpperCase();

        System.out.println("a: " + a.str);
        System.out.println("b: " + b.str);

    }
} 