//2. WAP to sorting string without using string Methods?.

class Q2
{
    static void sort(char[] str1, int n)
    {

        for(int i = 0; i<n-1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (str1[j] > str1[j + 1])
                {
                    char temp = str1[j];
                    str1[j] = str1[j + 1];
                    str1[j + 1] = temp;
                }
    }
    public static void main(String[] args)
    {
        String str = "hello";
        int n = str.length();

        System.out.println("Original String: " + str);

        char[] str1= str.toCharArray();
        sort(str1,n);

        System.out.print("Sorted String: ");
        for(int i=0; i<n;i++)
            System.out.print(str1[i]);

    }

}