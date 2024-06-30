//author Miljohn Gwapo//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Midterm extends JFrame implements java.awt.event.ActionListener {

    //Declaration

    JTextField field1, field2 , field3, field4, field5;
    JButton sumButton, averageButton, maxButton, minButton; 
    JLabel result;

    private void sum(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field3.getText());
            double num4 = Double.parseDouble(field4.getText());
            double num5 = Double.parseDouble(field5.getText());

            double sum = num1+num2+num3+num4+num5;

            result.setText( String.valueOf( "Sum: " + sum));
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
    }   

    private void average(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field3.getText());
            double num4 = Double.parseDouble(field4.getText());
            double num5 = Double.parseDouble(field5.getText());

            double ave = (num1+num2+num3+num4+num5)/5;
            result.setText(String.valueOf("Average: " + ave));

        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
    }

    private void newMax(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field3.getText());
            double num4 = Double.parseDouble(field4.getText());
            double num5 = Double.parseDouble(field5.getText());

            double max = Math.max(num1, Math.max(num2, Math.max(num3, Math.max(num4,num5))));
            result.setText(String.valueOf("Max: " + max));

        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
    }

    private void newMin(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field3.getText());
            double num4 = Double.parseDouble(field4.getText());
            double num5 = Double.parseDouble(field5.getText());

            double min = Math.min(num1, Math.min(num2, Math.min(num3, Math.min(num4,num5))));
            result.setText(String.valueOf("Min :" + min));

        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
    }

    //constructors
    public Midterm(){

        setTitle("Pador Puwtintin");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(7,1,10,10));

        sumButton = new JButton("Sum");
        averageButton = new JButton("Average");
        maxButton = new JButton("Max");
        minButton = new JButton("Min");

        field1 = new JTextField();
        field2 = new JTextField();
        field3 = new JTextField();
        field4 = new JTextField();
        field5 = new JTextField();

        java.awt.Font font = new java.awt.Font("arial",java.awt.Font.PLAIN, 40);

        JPanel buttoPanel = new JPanel();
        buttoPanel.setLayout(new GridLayout(2,2,5,5));
        buttoPanel.add(sumButton);
        buttoPanel.add(averageButton);
        buttoPanel.add(maxButton);
        buttoPanel.add(minButton);

        field1.setHorizontalAlignment(JTextField.TRAILING);
        field2.setHorizontalAlignment(JTextField.TRAILING);
        field3.setHorizontalAlignment(JTextField.TRAILING);
        field4.setHorizontalAlignment(JTextField.TRAILING);
        field5.setHorizontalAlignment(JTextField.TRAILING);
        result = new JLabel("");
        result.setHorizontalAlignment(JLabel.TRAILING);

        field1.setFont(font);
        field2.setFont(font);
        field3.setFont(font);
        field4.setFont(font);
        field5.setFont(font);
        result.setFont(font);

        add(field1);
        add(field2);
        add(field3);
        add(field4);
        add(field5);
        add(buttoPanel);
        add(result);

        //Action Methods
        sumButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sum();
            }
        });
        averageButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                average();
            }
        });
        maxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                newMax();
            }
        });
        minButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                newMin();
            }
        });
    }

    public static void main(String[] args) {
        new Midterm().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}


