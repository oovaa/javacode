public class JewelsandStones {
    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (char i : stones.toCharArray()) // it workes
            if (jewels.indexOf(i) != -1)
                ans++;

        return ans;
    }
}
