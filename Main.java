package MorseCodeConvertor;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class NewClass extends JFrame implements ActionListener {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();

    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    JPanel p8 = new JPanel();
    JPanel p9 = new JPanel();

    JButton b1 = new JButton("Morse Code to English");
    JButton b2 = new JButton("English to Morse Code ");
    JButton b3 = new JButton("Learn Morse Code ");

    JTextField t = new JTextField();
    JLabel l1 = new JLabel("_. Morse Code Converter ._");
    JLabel l2 = new JLabel("Welcome to the world !!");

    BufferedImage pic = ImageIO.read(new File("E:\\E users\\src\\MorseCodeConvertor\\MorseLogo2.png"));
    JLabel lb = new JLabel(new ImageIcon(pic));

    NewClass() throws IOException {

        ImageIcon icon = new ImageIcon("E:\\E users\\src\\MorseCodeConvertor\\MorseI.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1550, 820);
        setLocation(3, 10);
        setVisible(true);
        setLayout(new BorderLayout(10, 10));


        p1.setLayout(new BorderLayout());
        p1.setPreferredSize(new Dimension(130, 100));
        p1.setBackground(Color.BLACK);
        add(p1, BorderLayout.NORTH);

        p2.setLayout(new BorderLayout());
        p2.setPreferredSize(new Dimension(80, 80));
        p2.setBackground(Color.WHITE);
        add(p2, BorderLayout.CENTER);
        p2.add(lb);

//        p3.setLayout(new BorderLayout());
//        p3.setPreferredSize(new Dimension(400,100));
//        p3.setBackground(Color.LIGHT_GRAY);
//        add(p3,BorderLayout.EAST);

        p4.setLayout(new BorderLayout(10, 10));
        p4.setPreferredSize(new Dimension(400, 710));
        add(p4, BorderLayout.WEST);

//        p5.setLayout(null);
//        p5.setPreferredSize(new Dimension(250,100));
//        p5.setBackground(Color.LIGHT_GRAY);
//        p2.add(p5,BorderLayout.WEST);

        p6.setLayout(new BorderLayout());
        p6.setPreferredSize(new Dimension(180, 80));
        p6.setBackground(Color.WHITE);
        p2.add(p6, BorderLayout.NORTH);

        //on p4
        p7.setLayout(new BorderLayout());
        p7.setPreferredSize(new Dimension(400, 210));
        p7.setBackground(Color.LIGHT_GRAY);
        p4.add(p7, BorderLayout.NORTH);

        p8.setLayout(new BorderLayout());
        p8.setPreferredSize(new Dimension(400, 210));
        p8.setBackground(Color.LIGHT_GRAY);
        p4.add(p8, BorderLayout.CENTER);

        p9.setLayout(new BorderLayout());
        p9.setPreferredSize(new Dimension(400, 210));
        p9.setBackground(Color.LIGHT_GRAY);
        p4.add(p9, BorderLayout.SOUTH);

        l1.setFont(new Font("Serif", Font.BOLD, 55));
        l1.setForeground(Color.GREEN);
        l1.setBounds(0, 30, 290, 30);
        l1.setHorizontalAlignment(JLabel.CENTER);
        p1.add(l1);

        l2.setFont(new Font("Serif", Font.BOLD, 40));
        l2.setForeground(Color.BLUE);
        l2.setBounds(0, 30, 290, 30);
        l2.setHorizontalAlignment(JLabel.CENTER);
        p6.add(l2);

        b1.setFont(new Font("MV Boli", Font.BOLD, 20));
        b1.setBackground(Color.GREEN);
        b1.addActionListener(this);
        p7.add(b1);

        b2.setFont(new Font("MV Boli", Font.BOLD, 20));
        b2.setBackground(Color.RED);
        b2.addActionListener(this);
        p8.add(b2);

        b3.setFont(new Font("MV Boli", Font.BOLD, 20));
        b3.setBackground(Color.PINK);
        b3.addActionListener(this);
        p9.add(b3);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            this.dispose();
            new MorseToEng().setVisible(true);
        }
        if (e.getSource() == b2) {
            this.dispose();
            new EngToMorse().setVisible(true);
        }
        if (e.getSource() == b3) {
            this.dispose();
            try {
                new LearMorse().setVisible(true);
            } catch (IOException a) {
                System.out.println("Error");
            }

        }
    }


        public static void main(String[] args) throws IOException {
            NewClass n = new NewClass();
        }


}