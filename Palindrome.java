public class Palindrome {
    public static void main (String[] args){
        //first approach

        int n = 121;
        int sum  = 0;
        int originalNum = n;
        while(n>0){
            int remainder = n%10;
            sum = sum*10 + remainder;
            n = n/10;
        }
        n = originalNum;

        if(n==sum){
            System.out.println(n + " is a palindrome");
        }
        else{
            System.out.println(n + " is not a palindrome");
        }


//another approach ------------------------------------------

        String str = "123";
        boolean flag = true;

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }


    }
}
