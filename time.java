public class time {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10*100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
