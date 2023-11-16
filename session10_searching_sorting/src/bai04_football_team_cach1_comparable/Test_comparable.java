package bai04_football_team_cach1_comparable;

import java.util.ArrayList;
import java.util.List;
//B2: tạo danh sách các đội bóng và add các phần tử
//B3: gọi các hàm so sánh và truyền danh sách đội bóng vào để sắp xếp.
//B4: in danh sách ra sau sắp xếp và kiểm tra.
public class Test_comparable {
    public static void main(String[] args) {
        List<FootballTeam> foodballTeams = new ArrayList<>();
        foodballTeams.add(new FootballTeam(1, "Team A", 9, 90));
        foodballTeams.add(new FootballTeam(2, "Team B", 9, 60));
        foodballTeams.add(new FootballTeam(3, "Team C", 9, 100));
        foodballTeams.add(new FootballTeam(4, "Team D", 9, 80));

        System.out.println("Foodball Teams before sorting:");
        displayFoodBallTeams(foodballTeams);

//B3: gọi các hàm so sánh và truyền danh sách đội bóng vào để sắp xếp.

        Sorting.BubbleSort<FootballTeam> bubbleSort = new Sorting.BubbleSort<>();
        Sorting.SelectionSort<FootballTeam> selectionSort = new Sorting.SelectionSort<>();
        Sorting.InsertSort<FootballTeam> insertSort = new Sorting.InsertSort<>();

        bubbleSort.sort(foodballTeams);
//        selectionSort.sort(foodballTeams);
//        insertSort.sort(foodballTeams);

//B4: in danh sách ra sau sắp xếp và kiểm tra.
        System.out.println("Foodball Teams after sorted");
        displayFoodBallTeams(foodballTeams);
    }
        public static void displayFoodBallTeams(List<FootballTeam> foodballTeams) {
            foodballTeams.forEach(System.out::println);
        }
}
