public class MyException {
    public static void main(String[] args) {
        UserDefinedException udf = new UserDefinedException();
        try{
            udf.validate(19);
            udf.validate(12);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}