import javax.swing.*; // Import Swing components
import java.awt.*; // Import layout managers
import java.awt.event.*; // Import event handling classes

public class InvestmentCalculator extends JFrame implements ActionListener {

    JTextField principalField, rateField, yearsField, resultField;
    JButton calculateButton;

    InvestmentCalculator() {

        setTitle("Investment Calculator");

        setSize(350, 250);

        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Principal Amount:"));
        principalField = new JTextField();
        add(principalField);

        add(new JLabel("Interest Rate (%):"));
        rateField = new JTextField();
        add(rateField);

        add(new JLabel("Years:"));
        yearsField = new JTextField();
        add(yearsField);

        add(new JLabel("Final Amount:"));
        resultField = new JTextField();
        resultField.setEditable(false); 
        add(resultField);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this); 
        add(calculateButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double principal = Double.parseDouble(principalField.getText());
        double rate = Double.parseDouble(rateField.getText());
        int years = Integer.parseInt(yearsField.getText());

        double amount = principal * Math.pow((1 + rate / 100), years);

        resultField.setText(String.format("%.2f", amount));
    }

    public static void main(String[] args) {

        new InvestmentCalculator();
    }
}