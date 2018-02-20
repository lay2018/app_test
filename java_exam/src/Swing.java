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
        frm.setLayout(new FlowLayout());                     //button point setup in frame.





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
        MouseListener listener2 = new MouseEventHandler();
        btn1.addMouseListener(listener2);

        JButton btn2 = new JButton("Btn2");
        btn2.addMouseListener(listener2);

        JButton btn3 = new JButton("Btn3");
        btn3.addMouseListener(listener2);

        frm.add(btn1);      //add button in frame.
        frm.add(btn2);
        frm.add(btn3);


        frm.setVisible(true);                                 //show frame
    }
}
