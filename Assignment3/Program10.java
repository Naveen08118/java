
//10.)WAP to print Fibonacci series. 
	//0 	 1 	 1 	 2 	 3 	 5 	 8 	 13 … till 100
public class Program10 {
    public static void main(String[] args) {
        int n = 100;
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + ": ");
        System.out.print(firstTerm + " " + secondTerm + " ");

        for (int i = 2; ; i++) {
            int nextTerm = firstTerm + secondTerm;
          
            if(nextTerm > n) break;
          
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}