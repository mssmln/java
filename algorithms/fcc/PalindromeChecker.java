import java.util.regex.*;
import java.util.Arrays; 

class PalindromeChecker {
    private static Boolean palindrome(String str) {
        final String REGEX = "[a-z0-9]";
        final String REGEX2 = "[^a-z0-9]";
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile(REGEX2, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str.toLowerCase());
        Matcher matcher2 = pattern2.matcher(str);
        int len = 0;
        while (matcher2.find()) {
            ++len;
        }
        String[] allMatches = new String[str.length() - len]; // we found exactly the length we need
        int i = 0;
        while (matcher.find()) {
            allMatches[i] = matcher.group();
            ++i;
        }

        int inc = 1;
        for (String l : allMatches) {
            if (l.equals(allMatches[allMatches.length - inc])) // we need to compare values and not references, so we can't use ==
                ++inc;
        }
        return inc - 1 == allMatches.length;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("A man, a plan, a canal. Panama"));
        System.out.println(palindrome("eye"));
        System.out.println(palindrome("_eye"));
        System.out.println(palindrome("race car"));
        System.out.println(palindrome("not a palindrome"));
        System.out.println(palindrome("never odd or even"));
        System.out.println(palindrome("nope"));
        System.out.println(palindrome("almostomla"));
        System.out.println(palindrome("My age is 0, 0 si ega ym."));
        System.out.println(palindrome("1 eye for of 1 eye."));
        System.out.println(palindrome("0_0 (: /-\\ :) 0-0")); // used \ to escape
        System.out.println(palindrome("five|\\_/|four")); // used \ to escape
    }
}