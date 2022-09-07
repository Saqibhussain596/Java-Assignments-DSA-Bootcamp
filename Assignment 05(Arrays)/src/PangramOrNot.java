
// A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
// or false otherwise.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PangramOrNot {
    public static void main(String[] args)
    {
        String sen = "thequickbrownfoxjumpsoverthelazydog";

        int sum = 0;
        int[] check = new int[123];
       char[] arr = sen.toCharArray();
        for (char c : arr) {
            if (check[c] == 1)
                continue;
            check[c]++;

            sum += check[c];
        }
        System.out.println(sum); // return sum == 26

    }
}
