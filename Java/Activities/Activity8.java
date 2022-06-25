package activities;

public class Activity8 {

    public static void main(String[] args) throws CustomException {

        CustomException CustomExceptionActivity = new CustomException("String is null");
        Activity8 obj = new Activity8();
        obj.exceptionTest(null);
        obj.exceptionTest("String is present");
    }

    public void exceptionTest(String message) throws CustomException {

       if(message.isEmpty()){

           throw new CustomException("String value is null");
       }

    }
}

class CustomException extends Exception{

    private String message;

    public CustomException(String m){

        this.message=m;
    }

    @Override
    public String getMessage(){

        return message;
    }
}