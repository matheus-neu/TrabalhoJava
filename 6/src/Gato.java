import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gato  extends JFrame{

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel painel;
    private JButton adicionarButton;
    private JList list1;
    private JButton limparButton;
    private JLabel aviso;

    private DefaultListModel lista;
    public Gato() {
        setContentPane(painel);
        setTitle("Contato");
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        lista = new DefaultListModel();
        list1.setModel(lista);




    adicionarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String informacao = textField1.getText();
            String informacao2 = textField2.getText();
            String informacao3 = textField3.getText();
            String informacao4 = textField4.getText();
            lista.addElement(informacao);
            lista.addElement(informacao2);
            lista.addElement(informacao3);
            lista.addElement(informacao4);
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            if (informacao.isEmpty()){
                aviso.setText("Informações faltando!!");
            }
            if (informacao2.isEmpty()){
                aviso.setText("Informações faltando!!");
            }
            if (informacao3.isEmpty()){
                aviso.setText("Informações faltando!!");
            }
            if (informacao4.isEmpty()){
                aviso.setText("Informações faltando!!");
            }

        }
    });

        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.clear();
                aviso.setText("Bem vindo a lista de contatos");
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new Gato());
    }
}


