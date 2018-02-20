import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxHandler implements ItemListener {

    JCheckBox cb1;


    public CheckBoxHandler(JCheckBox cb1) {
        this.cb1 = cb1;

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) { //변수의 값은 1. 선택되어있음.
            System.out.println(cb1.getText()+"가 선택되었습니다.");
        } else {
            System.out.println("선택이 해제되었습니다.");
        }

    }
}
