public class Try_catch {
    public static void main(String[] args) {
        int a=10;
        try{
        a=a/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
