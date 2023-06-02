// You are an assistant on a TV show where celebrities are dancing and 4 judges evaluate their performance and give them a score between 1 and 10.
// The program you are given takes the scores as input.
// Complete the method to take them as parameters, then calculate and return the average score.

import java.util.Scanner;

class MethodReturnTypes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double score1 = read.nextDouble();
        double score2 = read.nextDouble();
        double score3 = read.nextDouble();
        double score4 = read.nextDouble();
        double avgScore = getAverageScore(score1, score2, score3, score4);
        System.out.println(avgScore);
    }
    public static double getAverageScore(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}