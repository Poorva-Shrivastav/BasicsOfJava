public class PrintPatternRecursion {
    public static void main(String [] args) {
        int n = 16;
        printPattern(n);
    }
    public static void printPattern(int n){
        System.out.print(n + " ");

        if(n<=0){
            return;
        }
        printPattern(n-5);
        System.out.print(n + " ");
    }
}
