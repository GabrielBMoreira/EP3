package com.example.ep3.GUI.cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroEmprestados {
    private JPanel cadastroEmprestados;
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
    private JLabel lblDevolucao;
    private JLabel lblEmprestimo;
    private JTextField txtTitulo;
    private JTextField txtDesc;
    private JTextField txtAno;
    private JTextField txtPeriodo;
    private JTextField txtPais;
    private JTextField txtEstilo;
    private JTextField txtTipo;
    private JTextField txtCat;
    private JTextField txtNome;
    private JTextField txtDevolucao;
    private JTextField txtEmprestimo;
    private JButton cadastrarButton;
    private JButton cancelarButton;
    private JLabel lblColecao;
    private JTextField txtColecao;

    public JPanel getCadastroEmprestados() {
        return cadastroEmprestados;
    }

    public CadastroEmprestados() {
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
                registrarEmprestados();
            }
        });
    }

    private void registrarEmprestados() {
        String titulo = txtTitulo.getText();
        String desc = txtDesc.getText();
        String criacao = txtAno.getText();
        String periodo = txtPeriodo.getText();
        String pais = txtPais.getText();
        String estilo = txtEstilo.getText();
        String tipoObj = txtTipo.getText();
        String cat = txtCat.getText();
        String nome = txtNome.getText();
        String devolucao = txtDevolucao.getText();
        String emprestimo = txtEmprestimo.getText();
        String colecao = txtColecao.getText();

        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroEmprestados,
                    "Por favor preencha o campo obrigatorio Titulo",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroEmprestados,
                    "Por favor preencha o campo obrigatorio Nome",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

//        criarEmprestadosDB();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro emprestados");
        frame.setContentPane(new CadastroEmprestados().getCadastroEmprestados());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
