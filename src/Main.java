import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String in;
        Status[] status = new Status[6];
        int statusIndex = 0;

        for (int i = 0; i < 3; i++) {
            in = JOptionPane.showInputDialog("Enter length");
            double length = Double.parseDouble(in);

            in = JOptionPane.showInputDialog("Enter width");
            double width = Double.parseDouble(in);

            status[statusIndex] = new Rectangle(length, width);
            statusIndex++;
        }

        for (int i = 0; i < 2; i++) {
            String name = JOptionPane.showInputDialog("Enter sibling name");
            in = JOptionPane.showInputDialog("Enter sibling age");
            int age = Integer.parseInt(in);

            in = JOptionPane.showInputDialog("Enter sibling weight");
            int weight = Integer.parseInt(in);

            status[statusIndex] = new Sibling(name, age, weight);
            statusIndex++;
        }

        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter student ID"));
        String studentName = JOptionPane.showInputDialog("Enter student name");

        int numScores = Integer.parseInt(JOptionPane.showInputDialog("Enter number of scores"));
        int[] scores = new int[numScores];

        for (int i = 0; i < numScores; i++) {
            scores[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter score " + (i + 1)));
        }

        status[statusIndex] = new Student(id, studentName, scores);

        for (Status s : status) {
            s.displayStatus();
        }

        String out = "";
        for (Status s : status) {
            out += s.getStatus();
        }

        JOptionPane.showMessageDialog(null, out);
    }
}
