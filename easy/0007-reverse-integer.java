class Solution {
    public int reverse(int x) {
        
        try {
        
            if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
                return 0;
            }

            StringBuilder stringBuilder = new StringBuilder();

            String inputStr = String.valueOf(x);
            int inputLength = inputStr.length();

            for (int i=inputLength-1; i>=0; i--) {

                if (inputStr.charAt(i) == '-') {
                    stringBuilder.insert(0, "-");
                    break;
                }

                if (inputStr.charAt(i) != '0' || stringBuilder.length() > 0 || inputStr.charAt(0) == '0') {
                    stringBuilder.append(inputStr.charAt(i));
                }

            }

            return Integer.parseInt(stringBuilder.toString());
            
        } catch (NumberFormatException numberFormatException) {
            return 0;
        }
        
    }
}


// other solution
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

// 시간 복잡도 : O(log(x))
// 공간 복잡도 : O(1)

// Reference
// https://medium.com/duckuism/leetcode-algorithm-no-7-reverse-integer-6fc150c12524
