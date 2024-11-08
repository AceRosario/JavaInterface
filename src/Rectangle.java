import javax.swing.*;

public class Rectangle implements Status{

    private double length;
    private double width;

    // constructor

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    //

    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }

    public String getStatus(){
        String status = "Rectangle\nLength="+length+", Width="+width+"\n";
        return status;
    }

    public void displayStatus() {
        String status = getStatus();
        JOptionPane.showMessageDialog(null, status);
    }
}
