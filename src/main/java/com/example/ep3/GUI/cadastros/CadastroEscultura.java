package com.example.ep3.GUI.cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroEscultura {
    private JPanel cadastroEscultura;
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
    private JLabel lblMaterial;
    private JLabel lblAltura;
    private JTextField txtTitulo;
    private JTextField txtDesc;
    private JTextField txtAno;
    private JTextField txtPeriodo;
    private JTextField txtPais;
    private JTextField txtEstilo;
    private JTextField txtTipo;
    private JTextField txtCat;
    private JTextField txtNome;
    private JTextField txtMaterial;
    private JTextField txtAltura;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JTextField txtPeso;
    private JLabel lblPeso;

    public JPanel getCadastroEscultura() {
        return cadastroEscultura;
    }

    public CadastroEscultura() {
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
                registrarEscultura();
            }
        });
    }

    private void registrarEscultura() {
        String titulo = txtTitulo.getText();
        String desc = txtDesc.getText();
        String criacao = txtAno.getText();
        String periodo = txtPeriodo.getText();
        String pais = txtPais.getText();
        String estilo = txtEstilo.getText();
        String tipoObj = txtTipo.getText();
        String cat = txtCat.getText();
        String nome = txtNome.getText();
        String material = txtMaterial.getText();
        String altura = txtAltura.getText();
        String peso = txtPeso.getText();

        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroEscultura,
                    "Por favor preencha o campo obrigatorio Titulo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroEscultura,
                    "Por favor preencha o campo obrigatorio Nome",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

//        criarEsculturaDB();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro escultura");
        frame.setContentPane(new CadastroEscultura().getCadastroEscultura());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
