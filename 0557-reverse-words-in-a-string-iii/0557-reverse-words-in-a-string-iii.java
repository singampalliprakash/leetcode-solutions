class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String st : arr) {
            for (int i = st.length() - 1; i >= 0; i--) {
                result.append(st.charAt(i));
            }
            result.append(" ");
        }

        return result.toString().trim(); 
    }
}
