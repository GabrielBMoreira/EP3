package com.example.ep3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_old implements ActionListener {

    private int count = 0;
    private JLabel listaObjetos, listaColecoes, listaCompras, gastos, listaEmprestados, totalEmprestados, label;
    private JButton constultaListaObjetos, constultaListaColecoes, consultaListaCompras, consultaGastos, consultaEmprestados, consultaTotalEmprestados;
    private JFrame frame;
    private JPanel panel;
    private Scrollable scrollable;

    public GUI_old() {

        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};

        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", 5, false},
                {"John", "Doe",
                        "Rowing", 3, true},
                {"Sue", "Black",
                        "Knitting", 2, false},
                {"Jane", "White",
                        "Speed reading", 20, true},
                {"Joe", "Brown",
                        "Pool", 10, false}
        };

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame = new JFrame();

        listaObjetos = new JLabel("Lista de objetos de arte comprados por tipo e por classe");
        constultaListaObjetos = new JButton("Consultar");

        listaColecoes = new JLabel("Lista as colecoes com o maior numero de emprestimos por mes e por ano");
        constultaListaColecoes = new JButton("Consultar");

        listaCompras = new JLabel("Lista das compras  de objetos de arte por mes e por ano do museu");
        consultaListaCompras = new JButton("Consultar");

        gastos = new JLabel("Curva de gastos");
        consultaGastos = new JButton("Consultar");

        listaEmprestados = new JLabel("Lista de objetos emprestados por colecao, por mes e por ano");
        consultaEmprestados = new JButton("Consultar");

        totalEmprestados = new JLabel("Lista o total de objetos emprestados por colecao e por museu");
        consultaTotalEmprestados = new JButton("Consultar");

        JButton button = new JButton("Consulta");
        button.addActionListener(this);

        label = new JLabel("Numero de clicks 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(24, 2, 20, 25));
        panel.add(listaObjetos);
        panel.add(constultaListaObjetos);
        panel.add(scrollPane);
        panel.add(listaColecoes);
        panel.add(constultaListaColecoes);
        panel.add(listaCompras);
        panel.add(consultaListaCompras);
        panel.add(gastos);
        panel.add(consultaGastos);
        panel.add(listaEmprestados);
        panel.add(consultaEmprestados);
        panel.add(totalEmprestados);
        panel.add(consultaTotalEmprestados);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Museu de Arte");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI_old();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Numero de clicks" + count);
    }
}
