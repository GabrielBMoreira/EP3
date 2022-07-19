package com.example.ep3.GUI.cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroPintura {
    private JPanel cadastroPintura;
    private JLabel mensagemPintura;
    private JLabel lblTitulo;
    private JLabel lblDescricao;
    private JLabel lblCriacao;
    private JLabel lblObjt;
    private JLabel lblPais;
    private JLabel lblEstilo;
    private JLabel lblTipo;
    private JLabel lblCat;
    private JLabel lblArtist;
    private JLabel lblTinta;
    private JLabel lblSuporte;
    private JTextField txtTitulo;
    private JTextField txtDesc;
    private JTextField txtAno;
    private JTextField txtPeriodo;
    private JTextField txtPais;
    private JTextField txtEstilo;
    private JTextField txtTipo;
    private JTextField txtCat;
    private JTextField txtNome;
    private JTextField txtTinta;
    private JTextField txtSuporte;
    private JButton cadastrarButton;
    private JButton cancelarButton;

    public JPanel getCadastroPintura() {
        return cadastroPintura;
    }

    public CadastroPintura() {
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
                registrarPintura();
            }
        });
    }

    private void registrarPintura() {
        String titulo = txtTitulo.getText();
        String desc = txtDesc.getText();
        String criacao = txtAno.getText();
        String periodo = txtPeriodo.getText();
        String pais = txtPais.getText();
        String estilo = txtEstilo.getText();
        String tipoObj = txtTipo.getText();
        String cat = txtCat.getText();
        String nome = txtNome.getText();
        String tipoTinta = txtTinta.getText();
        String suporte = txtSuporte.getText();

        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroPintura,
                    "Por favor preencha o campo obrigatorio Titulo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroPintura,
                    "Por favor preencha o campo obrigatorio Nome",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

//        criarPinturaDB();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro pintura");
        frame.setContentPane(new CadastroPintura().cadastroPintura);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
