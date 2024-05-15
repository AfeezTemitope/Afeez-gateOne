import java.util.Scanner;

public class StudentGrade {
    private static int studentCount;
    private static int subjectCount;

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many Students Do You Have? ");
        studentCount = input.nextInt();

        System.out.print("How Many Subjects do they offer? ");
        subjectCount = input.nextInt();

        int[][] score = new int[studentCount][subjectCount];
        int[] subjectTotals = new int[subjectCount];
        int[] subjectHighest = new int[subjectCount];
        int[] subjectLowest = new int[subjectCount];
        double[] average = new double[studentCount];
	int[] studentWithHighestScore = new int[subjectCount];
        int[] studentWithLowestScore = new int[subjectCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Entering scores for student " + (i + 1) + ":");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter subject score " + (j + 1) + ": ");
                score[i][j] = input.nextInt();
                subjectTotals[j] += score[i][j];
                if (i == 0) {
                    subjectHighest[j] = score[i][j];
                    subjectLowest[j] = score[i][j];
                } else {
                    subjectHighest[j] = Math.max(subjectHighest[j], score[i][j]);
                    subjectLowest[j] = Math.min(subjectLowest[j], score[i][j]);
                }
            }
        }

        printHeader();
        printStudentScores(score, subjectTotals);
        printSummary(subjectTotals, subjectHighest, subjectLowest);
    }

    public static void printHeader() {
        System.out.println("==========================================================");
        System.out.print("STUDENT\t\t");
        for (int i = 0; i < subjectCount; i++) {
            System.out.print("SUB" + (i + 1) + "\t");
        }
        System.out.println("TOT\tAVE\tPOS");
        System.out.println("==========================================================");
    }

    public static void printStudentScores(int[][] score, int[] subjectTotals) {
        for (int i = 0; i < studentCount; i++) {
            double average = (double) subjectTotals[i] / subjectCount;
            System.out.print("Student " + (i + 1) + "\t");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.print(subjectTotals[i] + "\t");
            System.out.printf("%.2f\t", average);
            // position calculation when i have enough knowledge
            System.out.println();
        }
    }

    public static void printSummary(int[] subjectTotals, int[] subjectHighest, int[] subjectLowest) {
        System.out.println("\n\nSUBJECT SUMMARY");
        System.out.println("============================================");
        for (int j = 0; j < subjectCount; j++) {
            double average = (double) subjectTotals[j] / studentCount;
            System.out.println("============================================");
            System.out.println("SUBJECT " + (j + 1) + ":");
            System.out.println("Average score: " + String.format("%.2f", average));
            System.out.println("Highest score: " + subjectHighest[j]);
            System.out.println("Lowest score: " + subjectLowest[j]);
            System.out.println("============================================");
        }
    }
}