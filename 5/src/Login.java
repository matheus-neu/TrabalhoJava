import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JFrame {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel mainPanel;
    private JLabel adoado;
    private JButton cadastroButton;

    public Login() {
        setContentPane(mainPanel);
        setTitle("Login");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logar();
            }
        });
        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cadastrar();

            }
        });
    }

    private void logar() {

        String usuario = textField1.getText();
        char[] senhaChars = passwordField1.getPassword();
        String senha = new String(senhaChars);

        if (usuario.equals("admin") && senha.equals("1234")) {
            adoado.setText("Acesso Permitido!!");
            new Login2(usuario);
        } else {
            adoado.setText("Negado!!!");
        }

    }
    public static void main(String[] args) {
        Login frame = new Login();
    }
}
