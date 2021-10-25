
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Word_Char_Counter implements KeyListener{
    JFrame frame;
    Label lbl_Count;
    TextArea area;
    Word_Char_Counter(){
        frame=new JFrame("Key Listener");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lbl_Count=new Label();
        area=new TextArea();
        area.addKeyListener(this);
        GridBagLayout lay_out=new GridBagLayout();
        frame.setLayout(lay_out);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.BOTH;
        gbc.insets=new Insets(10,20,10,20);
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=2;
        frame.add(lbl_Count,gbc);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2;
        frame.add(area,gbc);
        frame.pack();
        frame.setVisible(true);
    }
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
        String text=area.getText();
        String[] words =text.split("\\s");
        lbl_Count.setText("Words: "+words.length+" Characters:"+text.length());
    }
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new Word_Char_Counter();
    }
}