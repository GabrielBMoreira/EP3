package com.example.ep3.GUI.cadastros;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroColecao {
    private JPanel cadastroColecao;
    private JLabel mensagemPintura;
    private JLabel lblNome;
    private JLabel lblDescricao;
    private JLabel lblEndereco;
    private JLabel lblTel;
    private JLabel lblContato;
    private JLabel lblTipo;
    private JTextField txtNome;
    private JTextField txtDesc;
    private JTextField txtEndereco;
    private JTextField txtTel;
    private JTextField txtContato;
    private JTextField txtTipo;
    private JButton cadastrarButton;
    private JButton cancelarButton;

    public JPanel getColecao() {
        return cadastroColecao;
    }

    public CadastroColecao() {
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
                registrarColecao();
            }
        });
    }

    private void registrarColecao() {
        String nome = txtNome.getText();
        String desc = txtDesc.getText();
        String endereco = txtEndereco.getText();
        String telefone = txtTel.getText();
        String contato = txtContato.getText();
        String tipo = txtTipo.getText();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(cadastroColecao,
                    "Por favor preencha o campo obrigatorio Nome",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

//        criarColecaoDB();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro colecoes");
        frame.setContentPane(new CadastroColecao().getColecao());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
