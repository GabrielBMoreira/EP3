package com.example.ep3.GUI;

import com.example.ep3.GUI.cadastros.CadastroMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MuseumGUI {
    private JLabel cadastro;
    private JLabel listagem;
    private JButton cadastroButton;
    private JButton consultasButton;
    private JPanel mainPanel;

    public MuseumGUI() {
        cadastroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame cadastro = new JFrame("Cadastro");
                cadastro.setContentPane(new CadastroMain().getCadastroMain());
                cadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                cadastro.pack();
                cadastro.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nakamura Chan Museum");
        frame.setContentPane(new MuseumGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
