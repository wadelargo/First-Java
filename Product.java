import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class Product extends JFrame implements java.awt.event.ActionListener {


    //Declaration
    JTextField field1, field2, field3;
    JButton add;
    JComboBox collBox;
    JLabel total;

    //constractor
    public Product(){
        setTitle("Purchase Details");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(9,1,5,5));

        field1 = new JTextField();
        field2 = new JTextField();
        field3 = new JTextField();

        add = new JButton("Add");
        add.addActionListener(this);

        collBox = new JComboBox<Item>();
        collBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev){
                Item IT = (Item) collBox.getSelectedItem();
                JOptionPane.showMessageDialog(null, "You selected "+ IT + "!","Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        total = new JLabel(" ");
        JPanel totalPanel = new JPanel();
        totalPanel.setLayout(new GridLayout(1,2,1,1));
        totalPanel.add(new JLabel("Total: "));
        totalPanel.add(total);

        add(new JLabel("Item Name:"));
        add(field1);
        add(new JLabel("Price:"));
        add(field2);
        add(new JLabel("Quantity:"));
        add(field3);
        add(add);
        add(collBox);
        add(totalPanel);
    }

    public void actionPerformed(ActionEvent ev){
        String name = field1.getText();
        Double price = Double.parseDouble(field2.getText());
        Double count = Double.parseDouble(field3.getText());

        Item newItem = new Item(name, price, count);

        collBox.addItem(newItem);
        
        clear();
    }

    public void clear(){
        field1.setText(null);
        field2.setText(null);
        field3.setText(null);
        field1.grabFocus();
    }

    public static void main(String[] args) {
        new Product().setVisible(true);
    }
}