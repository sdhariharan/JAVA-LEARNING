class Outerclass{
    class innerClass
    {
        public void print()
        {
            System.out.println("Inner class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        Outerclass outerclass=new Outerclass();
        Outerclass.innerClass inner=outerclass.new innerClass();
        inner.print();
    }
}
