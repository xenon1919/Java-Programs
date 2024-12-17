import javax.swing.*;
public class JListdemo {
    JListdemo() {
        JFrame f = new JFrame();
        DefaultListModel<String>l=new DefaultListModel<>();
        l.addElement("Rishi");
        l.addElement("Sai");
        l.addElement("Teja");
        JList<String>list=new JList<>(l);
        list.setBounds(100,100,75,75);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new JListdemo();
    }
}
