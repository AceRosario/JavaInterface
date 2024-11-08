import javax.swing.*;

public class Student implements Status {
    private int id;
    private String name;
    private double [] scores;

    public Student(int id, String n, int[] s){
        this.id = id;
        this.name = n;
        scores = new double[s.length];
        System.arraycopy(s,0,scores,0,s.length);
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public double[] getScores(){
        return scores.clone();
    }

    public String getStatus ( )
    {
        String status="";

        status="Student\nid="+id+", name="+name+", socres= ";
        for (int i=0;i<scores.length;i++)
        {
            status=status+scores[i]+" ";
        }
        status=status+"\n";
        return status;
    }

    public void displayStatus()
    {
        String status=getStatus ();
        JOptionPane.showMessageDialog (null, status);
    }
}
