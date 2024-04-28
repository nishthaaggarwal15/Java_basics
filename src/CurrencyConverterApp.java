import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Implemented Strategy Design Pattern for conversion
interface CurrencyConverter {
    double convert(double amount);
}

class RupeeToDollarConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount / 65.25;
    }
}

class DollarToRupeeConverter implements CurrencyConverter {
    @Override
    public double convert(double amount) {
        return amount * 65.25;
    }
}

public class CurrencyConverterApp {

    private static final CurrencyConverter rupeeToDollarConverter = new RupeeToDollarConverter();
    private static final CurrencyConverter dollarToRupeeConverter = new DollarToRupeeConverter();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConverterFrame frame = new ConverterFrame();
            frame.setVisible(true);
        });
    }
}

class ConverterFrame extends JFrame {

    private final JTextField rupeeTextField;
    private final JTextField dollarTextField;

    ConverterFrame() {
        super("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel rupeeLabel = new JLabel("Rupees:");
        rupeeTextField = new JTextField("0", 10);

        JLabel dollarLabel = new JLabel("Dollars:");
        dollarTextField = new JTextField("0", 10);

        JButton rupeeToDollarButton = new JButton("Convert to Dollar");
        rupeeToDollarButton.addActionListener(e -> {
            double rupees = Double.parseDouble(rupeeTextField.getText());
            double dollars = CurrencyConverterApp.rupeeToDollarConverter.convert(rupees);
            dollarTextField.setText(String.valueOf(dollars));
        });

        JButton dollarToRupeeButton = new JButton("Convert to Rupee");
        dollarToRupeeButton.addActionListener(e -> {
            double dollars = Double.parseDouble(dollarTextField.getText());
            double rupees = CurrencyConverterApp.dollarToRupeeConverter.convert(dollars);
            rupeeTextField.setText(String.valueOf(rupees));
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());

        add(rupeeLabel);
        add(rupeeTextField);
        add(dollarLabel);
        add(dollarTextField);
        add(rupeeToDollarButton);
        add(dollarToRupeeButton);
        add(closeButton);
    }
}