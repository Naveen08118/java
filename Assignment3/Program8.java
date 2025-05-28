//8.)WAP to print the following pattern 
 // 13 	 7 	 13 	 21… till 100


public class Program8 {
    public static void main(String[] args) {
        int num = 13;
        int diff = 6;
        for (int i = 0; num <= 100; i++) {
            System.out.print(num + "\t");
            if (i % 2 == 0) {
                num = num - diff;
            } else {
                num = num + diff + 8;
                diff = diff + 8;
            }
        }
    }
} 