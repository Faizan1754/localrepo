public class FCFS_WaitingTime {
    public static void main(String[] args) {
        int n = 5;
        int[] burstTime = {2, 4, 1, 5, 3};
        int[] waitingTime = new int[n];

        waitingTime[0] = 0;

        for (int i = 1; i < n; i++) {
            waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
        }

        System.out.println("Process\tBurst Time\tWaiting Time");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i]);
        }
    }
}
