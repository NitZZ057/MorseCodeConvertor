package MorseCodeConvertor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class LearMorse extends JFrame implements ActionListener {

    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JButton b = new JButton("Home");

    JLabel l1 = new JLabel("_. Morse Code Converter ._");

    BufferedImage pic = ImageIO.read(new File("E:\\E users\\src\\MorseCodeConvertor\\lernMOrs.png"));
    JLabel lb = new JLabel(new ImageIcon(pic));
    BufferedImage pic1 = ImageIO.read(new File("E:\\E users\\src\\MorseCodeConvertor\\MorseTable.png"));
    JLabel lb1 = new JLabel(new ImageIcon(pic1));

    LearMorse() throws IOException {
        ImageIcon icon = new ImageIcon("E:\\E users\\src\\MorseCodeConvertor\\MorseI.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1550,820);
        setLocation(0,0);
        setVisible(true);
        setLayout(new BorderLayout(10,10));

        p1.setLayout(new BorderLayout());
        p1.setPreferredSize(new Dimension(130,100));
        p1.setBackground(Color.BLACK);
        add(p1,BorderLayout.NORTH);

        p2.setLayout(new BorderLayout());
        p2.setPreferredSize(new Dimension(80,800));
        p2.setBackground(Color.WHITE);
        p2.add(lb);
        add(p2,BorderLayout.CENTER);

        p3.setLayout(null);
        p3.setPreferredSize(new Dimension(500,800));
        p3.setBackground(Color.GRAY);
        lb1.setBounds(15,30,470,500);
        p3.add(lb1);
        add(p3,BorderLayout.EAST);


        l1.setFont(new Font("Serif",Font.BOLD,55));
        l1.setForeground(Color.GREEN);
        l1.setBounds(0,30,290,30);
        l1.setHorizontalAlignment(JLabel.CENTER);
        p1.add(l1);

        b.setFont(new Font("MV Boli", Font.BOLD, 20));
        b.setBounds(210,600,150,30);
        b.setForeground(Color.GREEN);
        b.addActionListener(this);
        p3.add(b);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            this.dispose();
            try{
                new NewClass().setVisible(true);
            }catch (IOException a){
                System.out.println("Error");
            }


        }

    }

    public static void main(String[] args) throws IOException{
        LearMorse l = new LearMorse();
    }
}
