public class numofsentence {
    public static void main(String[] args) {
        String[] s = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

        System.out.println(mostWordsFound(s));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String string : sentences) {
            max = Math.max(string.split(" ").length, max);

        } // for (int i = 0; i < sentences.length; i++) {
          // String[] a = sentences[i].split(" ");

        // if (a.length > max) {
        // max = a.length;

        // }

        // }
        return max;

    }
}
