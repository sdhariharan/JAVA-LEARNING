public class Break {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {

            if(i == 5) {
                break;   // stops the loop when i becomes 5
            }

            System.out.println("Number: " + i);
        }
    }
}
