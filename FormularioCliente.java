package farmacia;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormularioCliente extends JFrame{
	public FormularioCliente() {
        setTitle("Cadastro de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        JTextField nomeField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField telefoneField = new JTextField();
        JButton salvarButton = new JButton("Salvar");

        panel.add(new JLabel("Nome:"));
        panel.add(nomeField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Telefone:"));
        panel.add(telefoneField);
        panel.add(new JLabel()); // Espaço em branco para alinhar botão
        panel.add(salvarButton);

        add(panel);

        salvarButton.addActionListener(e -> {
            // Aqui você pode adicionar a lógica para salvar os dados do cliente
            JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso!");
            dispose(); // Fecha a janela de cadastro após salvar
        });
    }
}
