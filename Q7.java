//7. WAP to convert seconds into days, hours, minutes and seconds.

class Q7{

    static void Convert(int n)
    {
        int day = (n/ 86400);
        int hours = (n / 3600) % 24;
        int minutes = (n / 60) % 60;
        int seconds = n % 60;

        System.out.println(
                day + " " + "days "
                + hours + " hours "
                + minutes + " minutes "
                + seconds + " seconds ");
    }

    public static void main (String[] args)
    {
        int n = 369121517;
        Convert(n);
    }
}