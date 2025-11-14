public class Positive_negative_num {

    static int[] arr = new int[] {-3, -1, 0, 4, 6};
    
    public static void main(String[] args) {

        int posCount = 0;
        int negCount = 0;
        
        for ( int i = 0; i < arr.length; i++ ) {
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0 ) {
                negCount++;
            } else {
                continue;
            }
        }

        System.out.println("Positive: " + posCount);
        System.out.println("Negative: " + negCount);

    }
}
