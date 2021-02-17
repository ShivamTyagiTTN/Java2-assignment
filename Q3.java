//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

public class Q3 {

    public static void main(String[] args) {
        test data = new test();
        data.setId(10);
        System.out.println("Data Id = "+data.getId());
    }

}

/*
//Test class:

public class test {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

//Removed test class

assignment-Java2/src$ ls
Q2.java  Q3.class  Q3.java  test.class  test.java
assignment-Java2/src$ rm test.class

//output:

assignment-Java2/src$ java Q3
Exception in thread "main" java.lang.NoClassDefFoundError: test
        at Q3.main(Q3.java:4)
Caused by: java.lang.ClassNotFoundException: test
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:581)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
        ... 1 more
 */