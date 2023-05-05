package frame;

import metodos.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Pantalla extends JFrame {
    Metodos m = new Metodos();
    List<Integer> next = m.filasTablaAll();

    public Pantalla(){
        init();
        this.setTitle("Memory Game");
        this.setLocationRelativeTo(this);
        m.startImage();
    }

    private void init() {
        jBoton3 = new JButton();
        jBoton4 = new JButton();
        jBoton5 = new JButton();
        btn01 = new JButton();
        btn02 = new JButton();
        btn03 = new JButton();
        btn04 = new JButton();
        btn05 = new JButton();
        btn06 = new JButton();
        btn07 = new JButton();
        btn08 = new JButton();

        jBoton3.setText("jButton1");

        jBoton4.setText("jButton1");

        jBoton5.setText("jButton1");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn01.setForeground(new Color(240, 240, 240));
        btn01.setHorizontalTextPosition(SwingConstants.CENTER);
        btn01.setMaximumSize(new Dimension(64, 64));
        btn01.setMinimumSize(new Dimension(64,64));
        btn01.setPreferredSize(new Dimension(64,64));
        btn01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn01MouseClicked(evt);
            }
        });
        btn02.setForeground(new Color(240, 240, 240));
        btn02.setHorizontalTextPosition(SwingConstants.CENTER);
        btn02.setMaximumSize(new Dimension(64, 64));
        btn02.setMinimumSize(new Dimension(64,64));
        btn02.setPreferredSize(new Dimension(64,64));
        btn02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn02MouseClicked(evt);
            }
        });
        btn03.setForeground(new Color(240, 240, 240));
        btn03.setHorizontalTextPosition(SwingConstants.CENTER);
        btn03.setMaximumSize(new Dimension(64, 64));
        btn03.setMinimumSize(new Dimension(64,64));
        btn03.setPreferredSize(new Dimension(64,64));
        btn03.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn03MouseClicked(evt);
            }
        });
        btn04.setForeground(new Color(240, 240, 240));
        btn04.setHorizontalTextPosition(SwingConstants.CENTER);
        btn04.setMaximumSize(new Dimension(64, 64));
        btn04.setMinimumSize(new Dimension(64,64));
        btn04.setPreferredSize(new Dimension(64,64));
        btn04.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn04MouseClicked(evt);
            }
        });
        btn05.setForeground(new Color(240, 240, 240));
        btn05.setHorizontalTextPosition(SwingConstants.CENTER);
        btn05.setMaximumSize(new Dimension(64, 64));
        btn05.setMinimumSize(new Dimension(64,64));
        btn05.setPreferredSize(new Dimension(64,64));
        btn05.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn05MouseClicked(evt);
            }
        });
        btn06.setForeground(new Color(240, 240, 240));
        btn06.setHorizontalTextPosition(SwingConstants.CENTER);
        btn06.setMaximumSize(new Dimension(64, 64));
        btn06.setMinimumSize(new Dimension(64,64));
        btn06.setPreferredSize(new Dimension(64,64));
        btn06.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn06MouseClicked(evt);
            }
        });
        btn07.setForeground(new Color(240, 240, 240));
        btn07.setHorizontalTextPosition(SwingConstants.CENTER);
        btn07.setMaximumSize(new Dimension(64, 64));
        btn07.setMinimumSize(new Dimension(64,64));
        btn07.setPreferredSize(new Dimension(64,64));
        btn07.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn07MouseClicked(evt);
            }
        });
        btn08.setForeground(new Color(240, 240, 240));
        btn08.setHorizontalTextPosition(SwingConstants.CENTER);
        btn08.setMaximumSize(new Dimension(64, 64));
        btn08.setMinimumSize(new Dimension(64,64));
        btn08.setPreferredSize(new Dimension(64,64));
        btn08.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                btn08MouseClicked(evt);
            }
        });
        GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn02, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn01, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn03, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn04, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn05, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn06, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(btn07, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn08, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn07, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn08, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn05, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn06, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btn03, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn04, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn01, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn02, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    private void btn01MouseClicked(MouseEvent evt) {
        Emparejar e = new Emparejar();
        e.setBtn(btn01);
        e.setNumBtn(1);
        e.setValor(next.get(0));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn02MouseClicked(MouseEvent evt){
        Emparejar e = new Emparejar();
        e.setBtn(btn02);
        e.setNumBtn(2);
        e.setValor(next.get(1));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn03MouseClicked(MouseEvent evt){
        Emparejar e = new Emparejar();
        e.setBtn(btn03);
        e.setNumBtn(3);
        e.setValor(next.get(2));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn04MouseClicked(MouseEvent evt){
        Emparejar e = new Emparejar();
        e.setBtn(btn04);
        e.setNumBtn(4);
        e.setValor(next.get(3));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn05MouseClicked(MouseEvent evt){
        Emparejar e = new Emparejar();
        e.setBtn(btn05);
        e.setNumBtn(5);
        e.setValor(next.get(4));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn06MouseClicked(MouseEvent evt){
        Emparejar e = new Emparejar();
        e.setBtn(btn06);
        e.setNumBtn(6);
        e.setValor(next.get(5));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn07MouseClicked(MouseEvent evt) {
        Emparejar e = new Emparejar();
        e.setBtn(btn07);
        e.setNumBtn(7);
        e.setValor(next.get(6));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    private void btn08MouseClicked(MouseEvent evt) {
        Emparejar e = new Emparejar();
        e.setBtn(btn08);
        e.setNumBtn(8);
        e.setValor(next.get(7));
        m.getPareja().add(e);
        m.emparejado();
        m.emparejar();
    }
    public static void main (String args[]){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Pantalla().setVisible(true);
            }
        });
    }
    //Declaracion de variables
    public static JButton btn01;
    public static JButton btn02;
    public static JButton btn03;
    public static JButton btn04;
    public static JButton btn05;
    public static JButton btn06;
    public static JButton btn07;
    public static JButton btn08;
    private JButton jBoton3;
    private JButton jBoton4;
    private JButton jBoton5;

}
