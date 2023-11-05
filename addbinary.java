class addbinary {
  public static void main(String[] args) {
    String a = "1";
    String b = "11";
    System.out.println(addBinary(a, b));

    // public static String addBinary(String a, String b) {
    // StringBuilder sb = new StringBuilder(); // Google immutability or string vs
    // stringbuilder if you don't know why
    // // we use this instead of regular string
    // int i = a.length() - 1, j = b.length() - 1, carry = 0; // two pointers
    // starting from the back, just think of
    // // adding two regular ints from you add from back
    // while (i >= 0 || j >= 0) {
    // int sum = carry; // if there is a carry from the last addition, add it to
    // carry
    // if (j >= 0)
    // sum += b.charAt(j--) - '0'; // we subtract '0' to get the int value of the
    // char from the ascii
    // if (i >= 0)
    // sum += a.charAt(i--) - '0';
    // sb.append(sum % 2); // if sum==2 or sum==0 append 0 cause 1+1=0 in this case
    // as this is base 2 (just
    // // like 1+9 is 0 if adding ints in columns)
    // carry = sum / 2; // if sum==2 we have a carry, else no carry 1/2 rounds down
    // to 0 in integer
    // // arithematic
    // }
    // if (carry != 0)
    // sb.append(carry); // leftover carry, add it
    // return sb.reverse().toString();
  }

  public static String addBinary(String a, String b) {
    StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += a.charAt(i) - '0';
            if (j >= 0)
                sum += b.charAt(j) - '0';

            result.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        if (carry != 0)
            result.insert(0, carry);

        return result.toString();
  }
}