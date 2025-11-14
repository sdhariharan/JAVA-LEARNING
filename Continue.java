public class Continue {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            if(i == 3) {
                continue;   // skips printing when i is 3
            }

            System.out.println("Number: " + i);
        }
    }
}
