public class excerise_06_01 {
    // Main method
    public static void main(String[] args){
        final int pentagonals = 100; // displays the first 100 pentagonals.
        final int perLine = 10; // displays 10 per line.
        
        System.out.println("These are the first 100 pentagonal numbers:"); 
        for (int i = 1; i <= pentagonals; i++) { 
            
            if (i % perLine == 0)
                System.out.printf("%7d\n", getPentagonalNumber(i));
            else
                System.out.printf("%7d", getPentagonalNumber(i));
        }
    }
    
    public static int getPentagonalNumber(int n){
            return (n * (3 * n - 1 / 2));
        }
        
}
