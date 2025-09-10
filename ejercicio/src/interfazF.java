import javax.swing.*;
import java.awt.*;

public class interfazF extends JFrame {

    public interfazF() {
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JLabel nombre = new JLabel("Nombre:");
        nombre.setForeground(Color.BLUE);
        nombre.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtNombre = new JTextField(10);
        txtNombre.setBackground(Color.LIGHT_GRAY);
        txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel apellido1 = new JLabel("Apellido 1:");
        apellido1.setForeground(Color.BLUE);
        apellido1.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtApellido1 = new JTextField(10);
        txtApellido1.setBackground(Color.LIGHT_GRAY);
        txtApellido1.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel apellido2 = new JLabel("Apellido 2:");
        apellido2.setForeground(Color.BLUE);
        apellido2.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtApellido2 = new JTextField(10);
        txtApellido2.setBackground(Color.LIGHT_GRAY);
        txtApellido2.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton guardar = new JButton("Guardar");
        guardar.setBackground(Color.GREEN);
        guardar.setForeground(Color.WHITE);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.RED);
        cancelar.setForeground(Color.WHITE);

        jp.add(nombre);
        jp.add(txtNombre);
        jp.add(apellido1);
        jp.add(txtApellido1);
        jp.add(apellido2);
        jp.add(txtApellido2);
        jp.add(guardar);
        jp.add(cancelar);

        add(jp);
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new interfazB();
    }
}
