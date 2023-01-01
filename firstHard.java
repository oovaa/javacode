class firstHard {

    public static void main(String[] args) {
        int[] a = { 1,2,3,4};

        System.out.println(isSelfCrossing(a));
    }

    static boolean isSelfCrossing(int[] distance) {
        boolean ans = false;
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < distance.length; i++) {
            switch (i % 4) {
                case 0:
                    up += distance[i];

                    break;

                case 1:
                    left += distance[i];

                    break;
                case 2:
                    down += distance[i];

                    break;
                case 3:
                    right += distance[i];

                    break;

            }
        }
        if ((down >= up || up >= down) && (left >= right || right >= left)) {
            ans = true;
        }

        return ans;
    }
}