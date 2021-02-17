//5. WAP to show object cloning in java using cloneable and copy constructor both.

import java.lang.*;

class TTN implements Cloneable
{
    private String name;
    private int id;

    TTN(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    TTN(TTN c)
    {
        System.out.println("Copy constructor called: ");
        name=c.name;
        id=c.id;
    }
    void display()
    {
        System.out.println(name+" "+id);
    }
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}
public class Q5
{
    public static void main(String[] args) throws CloneNotSupportedException {
        TTN obj=new TTN("Shivam tyagi",102);
        TTN obj2=new TTN(obj);
        obj.display();
        obj2.display();

        TTN t=new TTN("Shivam",103);
        TTN t1=(TTN)t.clone();
        System.out.println("\nCloneable called: ");
        t.display();
        t1.display();

    }}