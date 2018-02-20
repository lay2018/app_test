import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PwHandler implements ActionListener {

    JTextField id;
    JPasswordField pw;

    public PwHandler(JTextField id, JPasswordField pw) {
        this.id = id;
        this.pw = pw;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ID"+id.getText());
        System.out.println("Password"+pw.getPassword());
        id.setText(""); // 우선 빈칸으로
        pw.setText("");
    }
}
