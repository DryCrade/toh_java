import java.util.Scanner;

class HanoiTowers {
    // Method to perform the Hanoi Towers logic
    public static void solveHanoi(int disks, char firstPole, char targetPole, char intPole) {
        if (disks == 1) {
            System.out.println("Shift disk 1 from pole " + firstPole + " to pole " + targetPole);
            return;
        }
        solveHanoi(disks - 1, firstPole, intPole, targetPole);
        System.out.println("Shift disk " + disks + " from pole " + firstPole + " to pole " + targetPole);
        solveHanoi(disks - 1, intPole, targetPole, firstPole);
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int diskCount = inputReader.nextInt(); // Read the number of disks
        solveHanoi(diskCount, 'A', 'C', 'B'); // Initiate the solution
    }
}
