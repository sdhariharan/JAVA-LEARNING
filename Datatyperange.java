public class Datatyperange {
    public static void main(String[] args) {

        System.out.println("----- INTEGER TYPES -----");
        System.out.println("byte    : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short   : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int     : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long    : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        System.out.println("\n----- FLOATING TYPES -----");
        System.out.println("float   : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double  : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("\n----- CHARACTER TYPE -----");
        System.out.println("char    : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);

        System.out.println("\n----- BOOLEAN TYPE -----");
        System.out.println("boolean : true or false");
    }
}

