package bai04_football_team_cach1_comparable;

public class FootballTeam implements Comparable<FootballTeam> {
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
        return "FoodballTeam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(FootballTeam o) {
        //ascending order
        return Integer.compare(o.getScore(), this.getScore());
        //descending order
//        return Integer.compare(this.getScore(), o.getScore());
    }
}
