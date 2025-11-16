public class Multiple_try_catch {
    public static void main(String[] args) {
        try{
            int a=10;
            a=a/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Programm Executed");
        }
    }
}
