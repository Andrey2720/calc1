import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calc extends JFrame
{



    public JButton plus = new JButton("+");
    public JButton minus = new JButton("-");
    public JButton ravno = new JButton("=");
    public JTextField first = new JTextField(5);
    public JTextField second = new JTextField(5);
    public JTextField otvet = new JTextField(5);



    JPanel[] pn = new JPanel[6];



    public Calc()
    {
        super("Footbal");
        setLayout(new GridLayout(3,3));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







        for(int i = 0 ; i < pn.length ; i++)
        {

            pn[i] = new JPanel();


            add(pn[i]);
        }
        pn[2].add(plus);
       // pn[4].add(minus);

        pn[0].add(first);
        pn[1].add(second);
        pn[3].add(otvet);





        setSize(500,500);

        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Берем значение вводимое пользователем
                String first1 = first.getText();
                int a = Integer.parseInt (first1);
                System.out.println(a);
                String second1=second.getText();
                int b = Integer.parseInt(second1);
                int c=a+b;
                String c1 = String.valueOf(c);
                otvet.setText(c1);

            }
        });



    }

    public static void main(String[]args)
    {
        new Calc().setVisible(true);

    }

}