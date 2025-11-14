public class Replace_values_even_idx_wid_0 {
    
    static  int [] arr = new int [] {5, 6, 7, 8, 9};

    public static void main(String[] args) {
        
    // Expexted output with brackets: [0,6,0,8,0]

    for ( int i = 0 ; i < arr.length; i++ ) {
        if ( i % 2 == 0) {
            arr[i] = 0;
        }
    }
    
    // System.out.println();

    System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) { // 👈 only add comma if not last element
                System.out.print(",");
            }
        }
        System.out.print("]");


    }
}
