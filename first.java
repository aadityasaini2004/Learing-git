public class first {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // mainLoop:
        for (int i=0; i<=n; i++) {
            // inner loop
            for (int j=0; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}