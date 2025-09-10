import javax.swing.*;
import java.awt.*;

public class ejercicio1 extends JFrame {
    JPanel jp;

    public ejercicio1() {
        setTitle("Layouts");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jp = new JPanel();
        add(jp);

          Blay();
         // FLay();
        // CLay();
        setVisible(true);
    }
    public void Blay(){
        jp.setLayout(new BorderLayout());
        JLabel e1 = new JLabel("soy una etiqueta", SwingConstants.CENTER);
        e1.setForeground(Color.DARK_GRAY);
        e1.setFont(new Font("Arial", Font.BOLD, 18));

        JTextField texto = new JTextField("soy un texto");
        texto.setBackground(Color.GRAY);
        JButton boton = new JButton("spy un boton");

        jp.add(e1, BorderLayout.CENTER);
        jp.add(texto, BorderLayout.NORTH);
        jp.add(boton, BorderLayout.SOUTH);

    }

    public void FLay() {
        jp.setLayout(new FlowLayout());

        JLabel e2 = new JLabel("soy una etiqueta2");
        e2.setForeground(Color.GRAY);
        e2.setFont(new Font("Verdana", Font.ITALIC, 16));

        JTextField texto2 = new JTextField("soy un texto2", 15);
        texto2.setBackground(Color.WHITE);

        JButton boton2 = new JButton("Aceptar");

        jp.add(e2);
        jp.add(texto2);
        jp.add(boton2);
    }

    public void CLay() {
        CardLayout card = new CardLayout();
        jp.setLayout(card);

        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("panel 1"));

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Panel 2"));

        jp.add(panel1, "card1");
        jp.add(panel2, "card2");

        card.show(jp, "card2");
    }

    public static void main(String[] args) {
        new ejercicio1();
    }
}
