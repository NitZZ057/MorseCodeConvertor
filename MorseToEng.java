package MorseCodeConvertor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;

public class MorseToEng extends JFrame implements ActionListener {

    String[] str = {"_._.__ ","._.._. ","null ","..._.._ ","null ","._... ",".____. ","_.__. ","_.__._ ","null ","._._. ","__..__ ","_...._ ",
            "._._._ ","_.._. ","_____ ",".____ ","..___ ","...__ ","...._ ","..... ","_.... ","__... ","___.. ","____. ","___... ","_._._. ",
            "null ","_..._ ","null ","..__.. ",".__._. ","._ ","_... ","_._. ","_.. ",". ",".._. ","__. ",".... ",".. ",".___ ","_._ ","._.. ","__ ","_. ","___ ",
            ".__. ","__._ ","._. ","... ","_ ",".._ ","..._ ",".__ ","_.._ ","_.__ ","__.. ","null ","null ","null ","null ","..__._ "};


    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel l1 = new JLabel("_. Morse Code Converter ._");
    JLabel l2 = new JLabel("Enter morse code");
    JLabel l3 = new JLabel("The code says...");
    JButton b = new JButton("Convert");
    JButton back = new JButton("Back");
    JButton home = new JButton("Home");

    JTextField t = new JTextField(15);
    JTextField t1 = new JTextField("");

    String s;
    String[] sa;
    char[] c,ans;
    HashMap<Character,String> map = new HashMap<>();
    HashMap<String,Character> map1 = new HashMap<>();

    MorseToEng(){
        for(int i=0;i<62;i++){
            map.put((char)('!'+i),str[i]);
        }
        for(int i=0;i<62;i++){
            map1.put(str[i],(char)('!'+i));
        }

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

        p2.setLayout(null);
        p2.setPreferredSize(new Dimension(80,80));
        p2.setBackground(Color.LIGHT_GRAY);
        add(p2,BorderLayout.CENTER);

        l1.setFont(new Font("Serif",Font.BOLD,55));
        l1.setForeground(Color.GREEN);
        l1.setBounds(0,30,290,30);
        l1.setHorizontalAlignment(JLabel.CENTER);
        p1.add(l1);

        l2.setFont(new Font("Serif",Font.BOLD,35));
        l2.setForeground(Color.BLUE);
        l2.setBounds(600,50,290,40);
        l2.setHorizontalAlignment(JLabel.CENTER);
//        l2.setVisible(false);
        p2.add(l2);

        l3.setFont(new Font("Serif",Font.BOLD,47));
        l3.setForeground(Color.BLUE);
        l3.setBounds(600,150,340,60);
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setVisible(false);
        p2.add(l3);

        t.setFont(new Font(null,Font.BOLD,25));
        t.setBounds(390,170,800,150);
        t.setHorizontalAlignment(JLabel.CENTER);
        t.setDisabledTextColor(Color.BLACK);
//        t.setVisible(false);
        p2.add(t);

        b.setFont(new Font("Ink Free", Font.BOLD, 25));
        b.setForeground(new Color(25, 255, 0));
        b.setBounds(690,450,150,30);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.addActionListener(this);
//        b.setVisible(false);
        p2.add(b);

        t1.setFont(new Font(null,Font.BOLD,25));
        t1.setBounds(390,330,800,150);
        t1.setHorizontalAlignment(JLabel.CENTER);
        t1.setEnabled(false);
        t1.setDisabledTextColor(Color.BLACK);
        t1.setVisible(false);
        t1.setText(s);
        p2.add(t1);

        back.setFont(new Font("Ink Free", Font.BOLD, 25));
        back.setForeground(new Color(25, 255, 0));
        back.setBounds(690,500,150,30);
        back.setHorizontalAlignment(JLabel.CENTER);
        back.addActionListener(this);
        back.setVisible(false);
        p2.add(back);

        home.setFont(new Font("Ink Free", Font.BOLD, 25));
        home.setForeground(new Color(25, 255, 0));
        home.setBounds(690,550,150,30);
        home.setHorizontalAlignment(JLabel.CENTER);
        home.addActionListener(this);
        p2.add(home);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            l3.setVisible(true);
            t1.setVisible(true);
            back.setVisible(true);
            l2.setVisible(false);
            b.setVisible(false);
            t.setVisible(false);

            //Eng to Morse
//            s = t.getText();
//            c = s.toUpperCase().toCharArray();
//            System.out.println("And here is the code:");
//            for(char k : c){
//                if (Character.isWhitespace(k)) {
//                    t1.setText(t1.getText()+"   ");
////                    System.out.print("   ");
//                }
//                else{
//                    t1.setText(t1.getText()+map.get(k));
////                    System.out.print(map.get(k));
//                }
//            }

            s = t.getText();
            sa = s.split(" ");
            for(String a : sa){
                if(map1.get(a+" ")==null){
                    t1.setText(t1.getText()+" ");
                }else {
                    t1.setText(t1.getText()+map1.get(a+" "));
                }

            }

        }
        if(e.getSource()==back){
            t.setText("");
            t1.setText("");
            l3.setVisible(false);
            t1.setVisible(false);
            back.setVisible(false);
            l2.setVisible(true);
            b.setVisible(true);
            t.setVisible(true);
        }
        if(e.getSource()==home){
            this.dispose();
            try{
                new NewClass().setVisible(true);
            }catch (IOException a){
                System.out.println("Error");
            }


        }

    }

    public static void main(String[] args) {
        MorseToEng m = new MorseToEng();
    }
}
