import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class Main {
    static JLabel d2, d4, d6, d8, d12, d20, dAle, dadosSum, dadosTot;
    static JTextField dT2, dT4, dT6, dT8, dT12, dT20, dTAle1, dTAle2;

    private static class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int dado2;
            int dado4;
            int dado6;
            int dado8;
            int dado12;
            int dado20;
            int dadoAle;
            int dadoAle2;

            int i;
            int j;

            int dad2Re = 0;
            int dad4Re = 0;
            int dad6Re = 0;
            int dad8Re = 0;
            int dad12Re = 0;
            int dad20Re = 0;
            int dadAleRe = 0;

            Random r = new Random();

            String dad2, dad4, dad6, dad8, dad12, dad20, dadAle1, dadAle2;
            String sr = "";
            if (evt.getSource() == dT2) {
                try {
                    dad2 = dT2.getText();
                    dado2 = Integer.parseInt(dad2);
                }catch (NumberFormatException e) {
                    dT2.setText("Illegal Data");
                    dT2.requestFocus();
                    return;
                }
                for (i = 0; i < dado2; i++) {
                    j = r.nextInt((2 - 1) + 1) + 1;
                    dad2Re = dad2Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad2Re));
                }
            }
            if (evt.getSource() == dT4) {
                try {
                    dad4 = dT4.getText();
                    dado4 = Integer.parseInt(dad4);
                } catch (NumberFormatException e) {
                    dT4.setText("Illegal Data");
                    dT4.requestFocus();
                    return;
                }
                for (i = 0; i < dado4; i++) {
                    j = r.nextInt((4 - 1) + 1) + 1;
                    dad4Re = dad4Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad4Re));
                }
            }
            if (evt.getSource() == dT6) {
                try {
                    dad6 = dT6.getText();
                    dado6 = Integer.parseInt(dad6);
                } catch (NumberFormatException e) {
                    dT6.setText("Illegal Data");
                    dT6.requestFocus();
                    return;
                }
                for (i = 0; i < dado6; i++) {
                    j =r.nextInt((6 - 1) + 1) + 1;
                    dad6Re = dad6Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad6Re));
                }
            }
            if (evt.getSource() == dT8) {
                try {
                    dad8 = dT8.getText();
                    dado8 = Integer.parseInt(dad8);
                } catch (NumberFormatException e) {
                    dT8.setText("Illegal Data");
                    dT8.requestFocus();
                    return;
                }
                for (i = 0; i < dado8; i++) {
                    j = r.nextInt((8 - 1) + 1) + 1;
                    dad8Re = dad8Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad8Re));
                }
            }
            if (evt.getSource() == dT12) {
                try {
                    dad12 = dT12.getText();
                    dado12 = Integer.parseInt(dad12);
                } catch (NumberFormatException e) {
                    dT12.setText("Illegal Data");
                    dT12.requestFocus();
                    return;
                }
                for (i = 0; i < dado12; i++) {
                    j = r.nextInt((12 - 1) + 1) + 1;
                    dad12Re = dad12Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad12Re));
                }
            }
            if (evt.getSource() == dT20) {
                try {
                    dad20 = dT20.getText();
                    dado20 = Integer.parseInt(dad20);
                } catch (NumberFormatException e) {
                    dT20.setText("Illegal Data");
                    dT20.requestFocus();
                    return;
                }
                for (i = 0; i < dado20; i++) {
                    j = r.nextInt((20 - 1) + 1) + 1;
                    dad20Re = dad20Re + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dad20Re));
                }
            }
            if (evt.getSource() == dTAle1 || evt.getSource() == dTAle2) {
                try {
                    dadAle1 = dTAle1.getText();
                    dadoAle = Integer.parseInt(dadAle1);
                    dadAle2 = dTAle2.getText();
                    dadoAle2 = Integer.parseInt(dadAle2);

                } catch (NumberFormatException e) {
                    dTAle1.setText("Illegal Data");
                    dTAle1.requestFocus();
                    dTAle2.setText("Illegal Data");
                    dTAle2.requestFocus();
                    return;
                }
                for (i = 0; i < dadoAle; i++) {
                    j = r.nextInt(( dadoAle2 - 1) + 1) + 1;
                    dadAleRe = dadAleRe + j;
                    sr = sr + simplificarString(j);
                    dadosTot.setText(Integer.toString(dadAleRe));
                }
            }
            //mostrar los sumandos de la tirada
            sr = sr.substring(0,sr.length()-2);
            dadosSum.setText(sr);
        }


        private static String simplificarString(int a){
            String sumando = "";
            sumando = sumando + a + " + ";
            return sumando;
        }
    }

    public static class JPanelBackground extends JPanel{
        private Image background;

        public void paintComponent(Graphics g){
            int width = this.getSize().width;
            int height = this.getSize().height;

            if(this.background != null){
                g.drawImage(this.background,0,0, width, height, null);
            }
            super.paintComponent(g);
        }

        public void setBackground(String imagePath){
            this.setOpaque(false);
            this.background = new ImageIcon(imagePath).getImage();
            repaint();
        }
    }

    public static void main(String[] args){

        JFrame window = new JFrame("Roll Dice beta 0.1");

        JPanelBackground  zzz = new JPanelBackground ();
        zzz.setOpaque(true);
        zzz.setBackground("C:\\Users\\elret\\IdeaProjects\\dados\\src\\media\\TEST.png");
        JPanel main = new JPanel();
        main.setBackground(new Color(0,0,0,0));
        JPanel d2Panel = new JPanel();
        JPanel d4Panel = new JPanel();
        JPanel d6Panel = new JPanel();
        JPanel d8Panel = new JPanel();
        JPanel d12Panel = new JPanel();
        JPanel d20Panel = new JPanel();
        JPanel dAlePanel = new JPanel();
        JPanel sumaSumandos = new JPanel();
        JPanel dadosTotal = new JPanel();

        main.setLayout(new GridLayout(9,0));

        ButtonHandler bh = new ButtonHandler();

        d2 = new JLabel("D2");
        d4 = new JLabel("D4");
        d6 = new JLabel("D6");
        d8 = new JLabel("D8");
        d12 = new JLabel("D12");
        d20 = new JLabel("D20");
        dAle = new JLabel("D");

        dadosSum = new JLabel("0");
        dadosTot = new JLabel("0");


        dT2 =new JTextField("",2);
        dT2.setHorizontalAlignment(JTextField.CENTER);
        dT4 =new JTextField("",2);
        dT4.setHorizontalAlignment(JTextField.CENTER);
        dT6 =new JTextField("",2);
        dT6.setHorizontalAlignment(JTextField.CENTER);
        dT8 =new JTextField("",2);
        dT8.setHorizontalAlignment(JTextField.CENTER);
        dT12 =new JTextField("",2);
        dT12.setHorizontalAlignment(JTextField.CENTER);
        dT20 =new JTextField("",2);
        dT20.setHorizontalAlignment(JTextField.CENTER);
        dTAle1 =new JTextField("",2);
        dTAle1.setHorizontalAlignment(JTextField.CENTER);
        dTAle2 =new JTextField("",2);
        dTAle2.setHorizontalAlignment(JTextField.CENTER);

        dT2.addActionListener(bh);
        dT4.addActionListener(bh);
        dT6.addActionListener(bh);
        dT8.addActionListener(bh);
        dT12.addActionListener(bh);
        dT20.addActionListener(bh);
        dTAle1.addActionListener(bh);
        dTAle2.addActionListener(bh);

        d2Panel.add(dT2);
        d2Panel.add(d2);


        d4Panel.add(dT4);
        d4Panel.add(d4);

        d6Panel.add(dT6);
        d6Panel.add(d6);

        d8Panel.add(dT8);
        d8Panel.add(d8);

        d12Panel.add(dT12);
        d12Panel.add(d12);

        d20Panel.add(dT20);
        d20Panel.add(d20);

        dAlePanel.add(dTAle1);
        dAlePanel.add(dAle);
        dAlePanel.add(dTAle2);

        sumaSumandos.add(dadosSum);
        dadosTotal.add(dadosTot);

        main.add(d2Panel).setBackground(new Color(0,0,0,0));
        main.add(d4Panel).setBackground(new Color(0,0,0,0));
        main.add(d6Panel).setBackground(new Color(0,0,0,0));
        main.add(d8Panel).setBackground(new Color(0,0,0,0));
        main.add(d12Panel).setBackground(new Color(0,0,0,0));
        main.add(d20Panel).setBackground(new Color(0,0,0,0));
        main.add(dAlePanel).setBackground(new Color(0,0,0,0));
        main.add(sumaSumandos).setBackground(new Color(0,0,0,0));
        main.add(dadosTotal).setBackground(new Color(0,0,0,0));

        zzz.add(main, BorderLayout.CENTER);

        window.setContentPane(zzz);
        window.setSize(400,400);
        window.setLocationRelativeTo(null);
        window.setIconImage(new ImageIcon("C:\\Users\\elret\\IdeaProjects\\dados\\src\\media\\d20.png").getImage());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
