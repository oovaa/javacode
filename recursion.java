class recursion {
    public static void main(String[] args) {
        System.out.println(steps(5));
    }

    private static int steps(int i) {
        if (i < 1)
            return 1;
        return i * steps(i - 1);

    }

}