package com.example.ep3.GUI.cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroExposicoes {
    private JPanel cadastroExposicao;
    private JLabel mensagemPintura;
    private JLabel lblNome;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JTextField txtNome;
    private JTextField txtInicio;
    private JTextField txtFim;
    private JButton cadastrarButton;
    private JButton cancelarButton;

    public JPanel getExposicao() {
        return cadastroExposicao;
    }

    public CadastroExposicoes() {
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComponent comp = (JComponent) e.getSource();
                Window win = SwingUtilities.getWindowAncestor(comp);
                win.dispose();
            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarExposicao();
            }
        });
    }

    private void registrarExposicao() {
        String nome = txtNome.getText();
        String inicio = txtInicio.getText();
        String fim = txtFim.getText();


        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroExposicao,
                    "Por favor preencha o campo obrigatorio Nome",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

//        criarExposicaoDB();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro exposicoes");
        frame.setContentPane(new CadastroExposicoes().getExposicao());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
