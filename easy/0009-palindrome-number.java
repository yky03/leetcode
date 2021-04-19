class Solution {
    public boolean isPalindrome(int x) {
        
        // 원본 1개
        // 121
        String origin_x = String.valueOf(x);
        int origin_x_length = origin_x.length();
        int loopLength = origin_x_length / 2;
        
        // 반복문
        for (int i=0; i<loopLength; i++) {
            if (origin_x.charAt(i) != origin_x.charAt(origin_x_length-i-1)) {
                return false;
            }
        }
        
        return true;
        
    }
}

// other solution c#
public class Solution {
    public bool IsPalindrome(int x) {
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }
}

// other solution java
public boolean isPalindrome(int x) {
    String str = String.valueOf(x);
    int start = 0;
    int end = str.length() - 1;
    while(start < end){
        if(str.charAt(start++) != str.charAt(end--)) return false;
    }
    return true;
}
