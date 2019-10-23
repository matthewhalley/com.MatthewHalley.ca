import javax.swing.*;

public class StudentDriver extends undergrad {
    public StudentDriver(String name, int age, String[] subjects, String category ) {
        super(name, age, category, subjects);
    }

    public static void main(String[] args) {



        String name = JOptionPane.showInputDialog("Please enter your name:");

        String subjects = JOptionPane.showInputDialog("What are the subjects you are participating in?");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age: "));



    }



    }
    class selectOldestUnderGrad{


    }

