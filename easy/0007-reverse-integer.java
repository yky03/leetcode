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
