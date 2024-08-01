import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;

public class Cor extends JFrame {

    private JPanel mainPanel;
    private JSlider red;
    private JSlider green;
    private JSlider blue;
    private JLabel alterar;
    private JSlider red2;
    private JSlider green2;
    private JSlider blue2;

    public Cor() {
        setContentPane(mainPanel);
        setTitle("Colorir");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        alterar.setOpaque(true);
        alterar.setBackground(Color.GREEN);
        alterar.setForeground(Color.BLACK);

        red.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Cortexto();
            }
        });
        green.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Cortexto();
            }
        });
        blue.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Cortexto();
            }
        });
        red2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Corfundo();
            }
        });
        green2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Corfundo();
            }
        });
        blue2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Corfundo();
            }
        });
    }
    private void Corfundo(){
        int vermelho = red2.getValue();
        int verde = green2.getValue();
        int azul = blue2.getValue();
        alterar.setForeground(new Color(vermelho, verde, azul));
    }
    private void Cortexto() {
        int vermelho = red.getValue();
        int verde = green.getValue();
        int azul = blue.getValue();
        alterar.setBackground(new Color(vermelho, verde, azul));
    }

    public static void main(String[] args) {
        Cor at = new Cor();
    }


}

