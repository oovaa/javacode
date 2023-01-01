public class Garbagetrucks {
    public static void main(String[] args) {
        // StringBuffer types = new StringBuffer("GPM");
        // System.out.println(types.substring(0,1));
        String[] garbage = { "MMM", "PGM", "GP" };
        int[] travel = { 3, 10 };
        System.out.println(garbageCollection(garbage, travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        StringBuffer types = new StringBuffer("GPM");
        for (String i : garbage) {
            time += i.length();
        }

        for (int j = 0; j < 3; j++) {
            for (int i = garbage.length - 1; i > 0; i--) {
                // System.out.println(types.substring(j, j+1)+" " +garbage[i]+" "+ time);
                if (garbage[i].matches((".*") + types.subSequence(j, j + 1) + (".*"))) {
                    for (int k = 0; k < i; k++) {
                        time += travel[k];
                    }
                    break;
                }
            }
        }
        // System.out.println(time);
        return time;
    }
} // dam im cool asf :)
