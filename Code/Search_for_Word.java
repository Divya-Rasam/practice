public class Search_for_Word {

    static String[] arr = new String[]{"cat", "dog", "bird"};
    static String search = "dog";

    public static void main(String[] args) {

        // boolean Found = false;
        
       for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i].equals(search) ) {
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
    }
}