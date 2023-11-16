package bai04_foodball_team_cach2_comparator;

import java.util.Comparator;

public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayers;
    private int score;

    public FootballTeam(int id, String name, int numberOfPlayers, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", score=" + score +
                '}';
    }

    public static class FootballTeamComparator implements Comparator<FootballTeam> {
        @Override
        public int compare(FootballTeam team1, FootballTeam team2) {
            // Compare teams scores in descending order
            return Integer.compare(team2.getScore(), team1.getScore());
        }
    }
}
