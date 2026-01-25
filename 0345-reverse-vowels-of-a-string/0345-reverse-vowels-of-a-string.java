class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();

        int i = 0;
        int j = arr.length - 1;
        String vowels = "aeiouAEIOU";

        while (i < j) {

            // move i until vowel
            while (i < j) {
                char ch = arr[i];
                if (vowels.indexOf(ch) != -1) {
                    break;
                }
                i++;
            }

            // move j until vowel
            while (i < j) {
                char ch = arr[j];
                if (vowels.indexOf(ch) != -1) {
                    break;
                }
                j--;
            }

            // swap vowels
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        return new String(arr);
    }
}
