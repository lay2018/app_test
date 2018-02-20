import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Swing {
    public static void main(String[] args) {

        JFrame frm = new JFrame("Frist Swing");         //frame 객체 생성
        frm.setBounds(120,120,400,100);   //frame size setup
//        frm.setLayout(new FlowLayout());                     //button point setup in frame.
        frm.setLayout(new BorderLayout());
//        frm.setLayout(new GridLayout(3,2,10,20));



        //listner setup to close
        WindowListener listener = new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
            public void windowOpened(WindowEvent we) {
                System.out.println("프로그램이 수행되었습니다.");
            }
        };
        frm.addWindowListener(listener);

        JButton btn1 = new JButton("Btn1"); //"" text in button.
//        MouseListener listener2 = new MouseEventHandler();
//        btn1.addMouseListener(listener2);

        JButton btn2 = new JButton("Btn2");
        JButton btn3 = new JButton("Btn3");
        JButton btn4 = new JButton("Btn4");
        JButton btn5 = new JButton("Btn5");
        JButton btn6 = new JButton("Btn6");
        JButton btn7 = new JButton("Btn7");
        JButton btn8 = new JButton("Btn8");
        JButton btn9 = new JButton("Btn9");
        JButton btn10 = new JButton("Btn10");

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(btn1);      //add button in frame.
        panel1.add(btn2);        panel1.add(btn3);        panel1.add(btn4);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,3,2,2));
        panel2.add(btn5);        panel2.add(btn6);        panel2.add(btn7);
        panel2.add(btn8);        panel2.add(btn9);        panel2.add(btn10);

        frm.add(panel1, BorderLayout.NORTH);
        frm.add(panel2, BorderLayout.CENTER);

        frm.setVisible(true);                                 //show frame
    }
}
