package bai04_foodball_team_cach2_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_comparator {
    public static void main(String[] args) {
        List<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(new FootballTeam(1, "Team A", 9, 90));
        footballTeams.add(new FootballTeam(2, "Team B", 9, 60));
        footballTeams.add(new FootballTeam(3, "Team C", 9, 100));
        footballTeams.add(new FootballTeam(4, "Team D", 9, 80));

        System.out.println("Football Teams before sorting:");
        displayFootballTeams(footballTeams);

        Sorting.BubbleSort<FootballTeam> bubbleSort = new Sorting.BubbleSort<>();
        Sorting.SelectionSort<FootballTeam> selectionSort = new Sorting.SelectionSort<>();
        Sorting.InsertSort<FootballTeam> insertSort = new Sorting.InsertSort<>();

        // Sắp xếp và hiển thị kết quả (tăng dần)
        System.out.println("\nSorting using Bubble Sort (Ascending):");
        bubbleSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore));
        displayFootballTeams(footballTeams);

        // Sắp xếp và hiển thị kết quả (giảm dần)
        System.out.println("\nSorting using Bubble Sort (Descending):");
        bubbleSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore).reversed());
        displayFootballTeams(footballTeams);

        // Sắp xếp và hiển thị kết quả (tăng dần)
        System.out.println("\nSorting using Selection Sort (Ascending):");
        selectionSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore));
        displayFootballTeams(footballTeams);

        // Sắp xếp và hiển thị kết quả (giảm dần)
        System.out.println("\nSorting using Selection Sort (Descending):");
        selectionSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore).reversed());
        displayFootballTeams(footballTeams);

        // Sắp xếp và hiển thị kết quả (tăng dần)
        System.out.println("\nSorting using Insertion Sort (Ascending):");
        insertSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore));
        displayFootballTeams(footballTeams);

        // Sắp xếp và hiển thị kết quả (giảm dần)
        System.out.println("\nSorting using Insertion Sort (Descending):");
        insertSort.sort(footballTeams, Comparator.comparing(FootballTeam::getScore).reversed());
        displayFootballTeams(footballTeams);
    }

    private static void displayFootballTeams(List<FootballTeam> footballTeams) {
        footballTeams.forEach(System.out::println);
    }
}
