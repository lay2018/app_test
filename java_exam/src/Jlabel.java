import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Jlabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("title");
        frame.setBounds(120, 120, 250, 270);
        frame.setLayout(new FlowLayout());



        //체크박스.
        JCheckBox cb1 = new JCheckBox("수박");
        JCheckBox cb2 = new JCheckBox("딸기");
        JCheckBox cb3 = new JCheckBox("사과");

//        ButtonGroup buttonGroup1 = new ButtonGroup(); //체크박스들은 버튼그룹으로 묶어줘야함.
//        buttonGroup1.add(cb1);
//        buttonGroup1.add(cb2);
//        buttonGroup1.add(cb3);

        CheckBoxHandler cbHandler1 = new CheckBoxHandler(cb1);
        CheckBoxHandler cbHandler2 = new CheckBoxHandler(cb2);
        CheckBoxHandler cbHandler3 = new CheckBoxHandler(cb3);
        cb1.addItemListener(cbHandler1);
        cb2.addItemListener(cbHandler2);
        cb3.addItemListener(cbHandler3);

        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);

        //라디오버튼.
        JRadioButton rb1 = new JRadioButton("미국");
        JRadioButton rb2 = new JRadioButton("한국");
        JRadioButton rb3 = new JRadioButton("중국");
        JRadioButton rb4 = new JRadioButton("일본");

        RadioHandler radioHandler1 = new RadioHandler(rb1);
        RadioHandler radioHandler2 = new RadioHandler(rb2);
        RadioHandler radioHandler3 = new RadioHandler(rb3);
        RadioHandler radioHandler4 = new RadioHandler(rb4);
        rb1.addItemListener(radioHandler1);
        rb2.addItemListener(radioHandler2);
        rb3.addItemListener(radioHandler3);
        rb4.addItemListener(radioHandler4);

        //버튼그룹으로 묶었기때문에 하나만 선택 가능.
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        frame.add(rb1);
        frame.add(rb2);
        frame.add(rb3);
        frame.add(rb4);





        JTextArea textArea = new JTextArea(10,20);
        textArea.setText("글자를 입력하세요.");

        //커서의 위치설정.
        textArea.setCaretPosition(textArea.getText().length());

        //자동개행 활성화.
        textArea.setLineWrap(true);

        //단어 자동 개행 활성화
        textArea.setWrapStyleWord(true);


        JButton btn = new JButton("Clear");



        //버튼 텍스트 핸들러 추가 및 버튼에 등록
        ButtonTextHandler btHandler = new ButtonTextHandler(textArea);
        btn.addActionListener(btHandler);

        //스크롤패널 추가
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
//        frame.add(textArea);
        frame.add(btn);



        //시작과 종료함수
        WindowListener listener = new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.out.println("프로그램이 종료되었습니다.");
                System.exit(0);
            }

            public void windowOpened(WindowEvent we) {
                System.out.println("프로그램이 수행되었습니다.");
            }
        };
        frame.setVisible(true);
        frame.addWindowListener(listener);
    }

}

//        frame.setLayout(new GridLayout(3, 2));

        /*JLabel label1 = new JLabel("ID ", SwingConstants.RIGHT);
        JLabel label2 = new JLabel("Password ", SwingConstants.RIGHT);
        JTextField textField1 = new JTextField("ID", 12); // 글자수제한.
        JPasswordField textField2 = new JPasswordField(10); // 패스워드를 위한 전용 필드생성.

        JLabel label3 = new JLabel("E-mail ", SwingConstants.RIGHT);
        JTextField textField3 = new JTextField("E-mail", 24);

        PwHandler pwHandler = new PwHandler(textField1, textField2);
        textField1.addActionListener(pwHandler);
        textField2.addActionListener(pwHandler);


        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);

        frame.setVisible(true);
*/

