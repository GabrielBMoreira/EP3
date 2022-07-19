package com.example.ep3.GUI.cadastros;

import javax.swing.*;

public class CadastroMain {
    private JPanel cadastroMain;
    private JLabel msgmCadastro;
    private JLabel cadastroArtista;
    private JButton artistaButton;
    private JLabel cadastroPintura;
    private JButton pinturaButton;
    private JLabel cadastroEscultura;
    private JButton cadastrarButton1;
    private JLabel cadastrarOutros;
    private JButton outrosButton;
    private JLabel cadastrarEmprestados;
    private JButton emprestadosButton;
    private JButton permanentesButton;
    private JLabel cadastrarPermanentes;
    private JLabel cadastrarColecoes;
    private JButton colecoesButton;
    private JButton exposicoesButton;
    private JLabel cadastrarExposicoes;

    public JPanel getCadastroMain() {
        return cadastroMain;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Painel de cadastros");
        frame.setContentPane(new CadastroMain().cadastroMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
