import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Cato extends JFrame {

    private JButton gerarButton;
    private JCheckBox especiaisCheckBox;
    private JCheckBox numerosCheckBox;
    private JRadioButton minusculasRadioButton;
    private JRadioButton maiusculasRadioButton;
    private JPanel mainPanel;
    private JSpinner spinner1;
    private JTextField textField1;
    private JButton copiarButton;
    private JRadioButton maiusuculasEMinusculasRadioButton;

    public Cato() {
        setContentPane(mainPanel);
        setTitle("Senhas aleatórias");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(minusculasRadioButton);
        buttonGroup.add(maiusculasRadioButton);
        buttonGroup.add(maiusuculasEMinusculasRadioButton);
        setLocationRelativeTo(null);
        int min = 4;
        int max = 40;
        int initia = 8;
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(initia, min, max, 1);
        spinner1.setModel(spinnerModel);

        gerarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = gerarSenha();
                textField1.setText(password);

            }
        });


        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringSelection stringSelection = new StringSelection (textField1.getText());
                Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
                clpbrd.setContents (stringSelection, null);
                /* Peguei esse botao de copiar do stackoverflow */


            }
        });
    }

    private String gerarSenha() {
        StringBuilder letras = new StringBuilder();
        Random random = new Random();
        int comprimento = (int) spinner1.getValue();


        if (minusculasRadioButton.isSelected()) {
            letras.append("abcdefghijklmnopqrstuvwxyz");
        }
        if (maiusuculasEMinusculasRadioButton.isSelected()){
            letras.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (maiusculasRadioButton.isSelected()) {
            letras.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        }
        if (especiaisCheckBox.isSelected()) {
            letras.append("!@#$%^&*()-_+=<>?");
        }
        if (numerosCheckBox.isSelected()) {
            letras.append("0123456789");
        }

        StringBuilder cat = new StringBuilder();
        for (int i = 0; i < comprimento; i++) {
            int randomIndex = random.nextInt(letras.length());
            char randomChar = letras.charAt(randomIndex);
            cat.append(randomChar);
            /* https://www.codejava.net/coding/generate-random-strings-examples <-- Baseei-me aqui pro gerador de string */

        }

        return cat.toString();
    }

    public static void main(String[] args) {
        Cato frame = new Cato();
    }
}
