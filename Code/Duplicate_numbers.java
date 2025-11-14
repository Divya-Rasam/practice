public class Duplicate_numbers {

    static int[] arr = new int[] {1, 3, 5, 3, 7, 1, 9};

    public static void main(String[] args) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    // add only if not already added
                    if (!result.contains(arr[i] + " ")) {
                        // insert at beginning to reverse order
                        result = arr[i] + " " + result;
                    }
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
