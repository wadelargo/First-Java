import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Addition extends JFrame implements java.awt.event.ActionListener {

    JTextField field1, field2;
    JLabel result;

    public Addition() {
        setTitle("Addition");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(4,1,5,5));

        JButton computeBtn = new JButton("Compute");
        field1 = new JTextField();
        field2 = new JTextField();

        java.awt.Font font = new java.awt.Font("arial",java.awt.Font.PLAIN, 40);

        field1.setHorizontalAlignment(JTextField.TRAILING);
        field2.setHorizontalAlignment(JTextField.TRAILING);
        result = new JLabel("");
        result.setHorizontalAlignment(JLabel.TRAILING);

        field1.setFont(font);
        field2.setFont(font);
        result.setFont(font);
        computeBtn.setFont(font);
        computeBtn.addActionListener(this);


        add(field1);
        add(field2);
        add(computeBtn);
        add(result);

    }

    public static void main(String[] args) {
        new Addition().setVisible(true);
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            double sum = num1+num2;

            result.setText( String.valueOf(sum) );
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}