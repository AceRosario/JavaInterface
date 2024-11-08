import javax.swing.*;

public class Student implements Status {
    private int id;
    private String name;
    private double[] scores;

    public Student(int id, String n, int[] s) {
        this.id = id;
        this.name = n;
        scores = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            scores[i] = s[i];
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double[] getScores() {
        return scores.clone();
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder("Student\nid=" + id + ", name=" + name + ", scores= ");
        for (double score : scores) {
            status.append(score).append(" ");
        }
        status.append("\n");
        return status.toString();
    }

    @Override
    public void displayStatus() {
        String status = getStatus();
        JOptionPane.showMessageDialog(null, status);
    }
}
