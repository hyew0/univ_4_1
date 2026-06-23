package w11;

public class Student {
    private String id, name;
    private int  score;

    public Student(String id, String name, int score) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "학번: " + id + ", 이름: " + name + ", 점수: " + score;
    }
}
