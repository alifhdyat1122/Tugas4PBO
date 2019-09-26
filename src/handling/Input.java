/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handling;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

/**
 *
 * @author Bagas
 */
public class Input extends JFrame {

    public Input() {
        //frame
        JFrame frame = new JFrame();
        frame.setTitle("TUGAS HANDLING");
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);

        //judul
        JLabel label = new JLabel("H A N D L I N G");
        frame.add(label);
        label.setBounds(370, 20, 100, 20);

        //jeniskelamin
        JLabel labelJk = new JLabel("Jenis Kelamin");
        frame.add(labelJk);
        labelJk.setBounds(50, 70, 150, 20);
        JLabel titikDuaC = new JLabel(" : ");
        frame.add(titikDuaC);
        titikDuaC.setBounds(185, 70, 150, 20);
        JRadioButton rbLk = new JRadioButton(" Laki-Laki ");
        frame.add(rbLk);
        rbLk.setBounds(200, 70, 150, 20);
        JRadioButton rbPr = new JRadioButton(" Perempuan ");
        frame.add(rbPr);
        rbPr.setBounds(300, 70, 150, 20);
        ButtonGroup bgJk = new ButtonGroup();
        bgJk.add(rbLk);
        bgJk.add(rbPr);
        JTextField hasilJk = new JTextField("Jenis Kelamin Belum Dipilih");
        rbLk.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbLk) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Laki-Laki");
                }
            }
        });
        rbPr.addItemListener((ItemEvent event) -> {
            if (event.getSource() == rbPr) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    hasilJk.setText("Perempuan");
                }
            }
        });
        frame.add(hasilJk);
        hasilJk.setBounds(200, 100, 200, 20);
        hasilJk.setEditable(false);

        //agama
        JLabel labelAgama = new JLabel("Agama");
        frame.add(labelAgama);
        labelAgama.setBounds(50, 140, 150, 20);
        JLabel titikDuaD = new JLabel(" : ");
        frame.add(titikDuaD);
        titikDuaD.setBounds(185, 140, 150, 20);
        String namaAgama[]
                = {" Islam ", " Kristen ", " Katholik ", " Hindu ", " Budha "};
        JComboBox cbAgama = new JComboBox(namaAgama);
        JTextField hasilAgama = new JTextField("Islam");
        frame.add(cbAgama);
        cbAgama.setBounds(200, 140, 200, 20);
        cbAgama.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                if (cbAgama.getSelectedIndex() == 0) {
                    hasilAgama.setText("Islam");
                } else if (cbAgama.getSelectedIndex() == 1) {
                    hasilAgama.setText("Kristen");
                } else if (cbAgama.getSelectedIndex() == 2) {
                    hasilAgama.setText("Katholik");
                } else if (cbAgama.getSelectedIndex() == 3) {
                    hasilAgama.setText("Hindu");
                } else if (cbAgama.getSelectedIndex() == 4) {
                    hasilAgama.setText("Budha");
                }
            }
        });
        frame.add(hasilAgama);
        hasilAgama.setBounds(200, 170, 200, 20);
        hasilAgama.setEditable(false);

        //goldar
        JLabel labelGd = new JLabel("Golongan Darah");
        frame.add(labelGd);
        labelGd.setBounds(50, 210, 150, 20);
        JLabel titikDuaE = new JLabel(" : ");
        frame.add(titikDuaE);
        titikDuaE.setBounds(185, 210, 150, 20);
        JCheckBox cbO = new JCheckBox(" O ");
        JCheckBox cbAB = new JCheckBox(" AB ");
        JCheckBox cbB = new JCheckBox(" B ");
        JCheckBox cbA = new JCheckBox(" A ");
        frame.add(cbO);
        cbO.setBounds(200, 210, 100, 20);
        frame.add(cbAB);
        cbAB.setBounds(300, 210, 100, 20);
        frame.add(cbB);
        cbB.setBounds(400, 210, 100, 20);
        frame.add(cbA);
        cbA.setBounds(500, 210, 100, 20);
        JTextField golong = new JTextField("GolDar Belum Dipilih");
        cbO.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbO) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    golong.setText("GolDar O");
                    cbO.setSelected(false);
                }
            }
        });
        cbAB.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbAB) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    golong.setText("GolDar AB");
                    cbAB.setSelected(false);
                }
            }
        });
        cbB.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbB) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    golong.setText("GolDar B");
                    cbAB.setSelected(false);
                }
            }
        });
        cbA.addItemListener((ItemEvent event) -> {
            if (event.getSource() == cbA) {
                if (event.getStateChange() == ItemEvent.SELECTED) {
                    golong.setText("GolDar A");
                    cbAB.setSelected(false);
                }
            }
        });
        frame.add(golong);
        golong.setBounds(200, 240, 200, 20);
        golong.setEditable(false);

        //hobi
        JLabel labelHobi = new JLabel("Hobi");
        frame.add(labelHobi);
        labelHobi.setBounds(360, 260, 150, 20);

        JTextField futsal = new JTextField("Futsal");
        JTextField badminton = new JTextField("Badminton");
        JTextField basket = new JTextField("Basket");
        JTextField voli = new JTextField("Voli");
        JTextField hasilJll = new JTextField();
        JTextField hasilnyaJll = new JTextField();
        Font font = new Font("SanSerif", Font.BOLD, 20);
        Font font1 = new Font("SanSerif", Font.BOLD, 10);
        frame.add(futsal);
        futsal.setBounds(25, 280, 150, 20);
        futsal.setEditable(false);
        futsal.setHorizontalAlignment(JTextField.CENTER);
        futsal.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(futsal.getText());
            }
        });
        frame.add(badminton);
        badminton.setBounds(225, 280, 150, 20);
        badminton.setEditable(false);
        badminton.setHorizontalAlignment(JTextField.CENTER);
        badminton.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(badminton.getText());
            }
        });
        frame.add(basket);
        basket.setBounds(425, 280, 150, 20);
        basket.setEditable(false);
        basket.setHorizontalAlignment(JTextField.CENTER);
        basket.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(basket.getText());
            }
        });
        frame.add(voli);
        voli.setBounds(625, 280, 150, 20);
        voli.setEditable(false);
        voli.setHorizontalAlignment(JTextField.CENTER);
        voli.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                hasilJll.setText(voli.getText());
            }
        });
        frame.add(hasilJll);
        hasilJll.setBounds(25, 310, 750, 50);
        hasilJll.setEditable(false);
        hasilJll.setFont(font);
        hasilJll.setHorizontalAlignment(JTextField.CENTER);
    }
}
