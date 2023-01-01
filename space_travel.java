import java.util.Scanner;

public class space_travel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter test casees");
        int testCase = s.nextInt();
        while (testCase > 0) {
            System.out.println("enter numcer of station");
            int stationnum = s.nextInt();
            System.out.println("enter tank capapcity");
            int tankcapacity = s.nextInt();
            System.out.println("enter first full cost");
            int firstfull = s.nextInt();
            int sum = firstfull * tankcapacity;
            int curntf = tankcapacity;
            int[] llost = new int[stationnum];
            int[] lcost = new int[stationnum];
            for (int i = 0, j = 1; j < stationnum; j++, i++) {
                System.out.println("ener lost fuel");
                llost[i] = s.nextInt();
                System.out.println("enter fuel cost in this station");
                lcost[i] = s.nextInt();

                curntf -= llost[i];

                if (curntf < llost[j]) {
                    int tofil = (tankcapacity - curntf)*lcost[i];
                    System.out.println("to filll"+tofil);
                    sum += (tankcapacity - curntf) * lcost[i] + 500+ tofil;
                    curntf = tankcapacity;
                    System.out.println(sum);
                    System.out.println(curntf);
                    break;
                } else if (curntf >= llost[j]) {
                    System.out.println(sum);
                    System.out.println(curntf);

                }
            }
            testCase--;
        }
        s.close();
    }
}
