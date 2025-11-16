class Outerclass{
    static class InnerClass{
        void print()
        {
            System.out.println("Static Inner Class");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        Outerclass .InnerClass staticinnerclass=new Outerclass.InnerClass();
        staticinnerclass.print();
    }
}
