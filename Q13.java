//Q13. Create a custom exception that do not have any stack trace



class CustomException extends Exception {

    CustomException(String msg, boolean enableSuppression, boolean writableStackTrace)
    {
        super(msg,null,enableSuppression,writableStackTrace);
    }
}
public class Q13 {
    public static void main(String[] args) throws CustomException {
        try {
            throw new CustomException("Custom message", true, false);
        }catch(CustomException e) {
            e.printStackTrace();
        }
    }
}
