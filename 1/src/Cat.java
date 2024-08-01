import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cat extends JFrame {
    private JButton botao;
    private JTextField texto;
    private JPanel mainPanel;
    private JList lista;
    private JButton limparButton;
    private DefaultListModel listModel;
    public Cat() {

        setContentPane(mainPanel);
        setTitle("Lista");
        setSize(1280,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        listModel = new DefaultListModel();
        lista.setModel(listModel);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String listra = texto.getText();
                listModel.addElement(listra);
                texto.setText("");



            }
        });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.clear();
                texto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Cat tela = new Cat();

    }

}
