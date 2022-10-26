package CodeBookM12;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

 public class MarcoBotton extends JFrame {
    private final JButton botonJButtonSimple;
    private final JButton botonJButtonElegante;
        // MarcoBoton agrega objetos JButton a JFrame
        public MarcoBotton(){
            super("Prueba de botones");
            setLayout(new FlowLayout());
            botonJButtonSimple = new JButton("Boton simple");
            add(botonJButtonSimple); // agrega botonJButtonSimple a JFrame
            Icon insecto1 = new ImageIcon(getClass().getResource("insecto1.gif"));
            Icon insecto2 = new ImageIcon(getClass().getResource("insecto2.gif"));
            botonJButtonElegante = new JButton("Boton elegante", insecto1); // establece la imagen
            botonJButtonElegante.setRolloverIcon(insecto2); // establece la imagen de sustitución
            add(botonJButtonElegante); // agrega botonJButtonElegante a JFrame


            ManejadorBoton manejador = new ManejadorBoton();
            botonJButtonElegante.addActionListener(manejador);
            botonJButtonSimple.addActionListener(manejador);
        }

        // clase interna para manejar eventos de botón
        private class ManejadorBoton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent evento) {
                JOptionPane.showMessageDialog(MarcoBotton.this, String.format("Usted oprimio: %s",
                        evento.getActionCommand()));
        }

        }
}