import javax.swing.*;
import java.awt.*;

public class interfazBo extends JFrame {

    public interfazBo() {
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jp.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nombre = new JLabel("Nombre:");
        nombre.setForeground(Color.BLUE);
        nombre.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtNombre = new JTextField();
        txtNombre.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        txtNombre.setBackground(Color.LIGHT_GRAY);
        txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel apellido1 = new JLabel("Apellido 1:");
        apellido1.setForeground(Color.BLUE);
        apellido1.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtApellido1 = new JTextField();
        txtApellido1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        txtApellido1.setBackground(Color.LIGHT_GRAY);
        txtApellido1.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel apellido2 = new JLabel("Apellido 2:");
        apellido2.setForeground(Color.BLUE);
        apellido2.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField txtApellido2 = new JTextField();
        txtApellido2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
        txtApellido2.setBackground(Color.LIGHT_GRAY);
        txtApellido2.setFont(new Font("Arial", Font.PLAIN, 14));

        JPanel botones = new JPanel();
        botones.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
        JButton guardar = new JButton("Guardar");
        guardar.setBackground(Color.GREEN);
        guardar.setForeground(Color.WHITE);
        JButton cancelar = new JButton("Cancelar");
        cancelar.setBackground(Color.RED);
        cancelar.setForeground(Color.WHITE);
        botones.add(guardar);
        botones.add(cancelar);

        jp.add(nombre);
        jp.add(txtNombre);
        jp.add(Box.createVerticalStrut(5));
        jp.add(apellido1);
        jp.add(txtApellido1);
        jp.add(Box.createVerticalStrut(5));
        jp.add(apellido2);
        jp.add(txtApellido2);
        jp.add(Box.createVerticalStrut(10));
        jp.add(botones);

        add(jp);
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new interfazB();
    }
}
