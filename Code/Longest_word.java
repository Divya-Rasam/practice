public class Longest_word {
    
    static String[] words = new String[] {"hi", "hello", "world", "Java"};

    public static void main(String[] args) {

        int longest_length = 0;
        String longest_word = "";
        
        for ( int i = 0; i < words.length; i++ ) {
            if ( words[i].length() > longest_length) {
                longest_length = words[i].length();
                longest_word = words[i];
            }
        }

        System.out.println(longest_word);
    }
}




// Expected Output:

// hello