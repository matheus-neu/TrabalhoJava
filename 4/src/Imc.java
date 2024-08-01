import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Imc extends JFrame {
    private JTextField textFieldpeso;
    private JTextField textFieldaltura;
    private JButton button1;
    private JPanel mainPanel;
    private JLabel ado;

    public Imc() {
        setContentPane(mainPanel);
        setTitle("Calculadora IMC");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculo();
            }

        private void Calculo() {
            double peso = Double.parseDouble(textFieldpeso.getText());
            double altura = Double.parseDouble(textFieldaltura.getText());
            double imc = peso / (altura * altura);
            ado.setText("IMC: " + String.format("%.2f", imc));}
        });


    }

    public static void main(String[] args) {
        Imc tela = new Imc();
    }
}
