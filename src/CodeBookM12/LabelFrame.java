package CodeBookM12;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
public class LabelFrame extends JFrame {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    public LabelFrame(){
        super("Test JLabel");
        setLayout(new FlowLayout());

        label1=new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon insect = new ImageIcon(getClass().getResource("insect1.png"));
        label2= new JLabel("Label with text and icon ",insect,SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3= new JLabel();
        label3.setText("Label with icon and text the bottom");
        label3.setIcon(insect);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);

    }

}
