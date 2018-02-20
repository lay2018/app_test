import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventHandler implements MouseListener {
    public void mouseClicked(MouseEvent e) {
        JButton button=(JButton)e.getComponent(); // 클릭하는 버튼의 정보를 취함.
        button.setText("Cliked");
        System.out.println("Clicked Button"+e.getButton());
        System.out.println("마우스 버튼 눌렸다 풀림");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("커서 버튼 위 진입");
    }

    public void mouseExited(MouseEvent e){
        System.out.println("커서 버튼 위 탈출");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("마우스 버튼 눌림");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("마우스 버튼 풀림");
    }
}
