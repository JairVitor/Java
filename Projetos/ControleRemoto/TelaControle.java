package Projetos.ControleRemoto;

import javax.swing.*;
import java.awt.*;

public class TelaControle extends JFrame {

    private ControleRemoto controle;
    private JLabel status;
    private JSlider volumeSlider;

    public TelaControle() {
        controle = new ControleRemoto();

        setTitle("Controle Remoto PRO");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 🎨 CORES
        Color fundo = new Color(30, 30, 30);
        Color botao = new Color(50, 50, 50);
        Color texto = Color.WHITE;

        getContentPane().setBackground(fundo);

        // 📊 STATUS
        status = new JLabel("Desligado", JLabel.CENTER);
        status.setForeground(texto);
        status.setFont(new Font("Arial", Font.BOLD, 16));
        add(status, BorderLayout.NORTH);

        // 🧱 PAINEL DE BOTÕES
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 3, 10, 10));
        painel.setBackground(fundo);

        JButton ligar = criarBotao("Ligar", botao, texto);
        JButton desligar = criarBotao("Desligar", botao, texto);
        JButton play = criarBotao("Play", botao, texto);
        JButton pause = criarBotao("Pause", botao, texto);
        JButton mais = criarBotao("+", botao, texto);
        JButton menos = criarBotao("-", botao, texto);

        painel.add(ligar);
        painel.add(desligar);
        painel.add(play);
        painel.add(pause);
        painel.add(mais);
        painel.add(menos);

        add(painel, BorderLayout.CENTER);

        // 🎚️ SLIDER
        volumeSlider = new JSlider(0, 100, 50);
        volumeSlider.setBackground(fundo);
        volumeSlider.setForeground(texto);

        add(volumeSlider, BorderLayout.SOUTH);

        // ⚡ EVENTOS

        ligar.addActionListener(e -> {
            controle.ligar();
            atualizar();
        });

        desligar.addActionListener(e -> {
            controle.desligar();
            atualizar();
        });

        play.addActionListener(e -> {
            controle.play();
            atualizar();
        });

        pause.addActionListener(e -> {
            controle.pause();
            atualizar();
        });

        mais.addActionListener(e -> {
            controle.maisVolume();
            volumeSlider.setValue(controle.getVolume());
            atualizar();
        });

        menos.addActionListener(e -> {
            controle.menosVolume();
            volumeSlider.setValue(controle.getVolume());
            atualizar();
        });

        volumeSlider.addChangeListener(e -> {
            if (controle.isLigado()) {
                int valor = volumeSlider.getValue();

                while (controle.getVolume() < valor) {
                    controle.maisVolume();
                }

                while (controle.getVolume() > valor) {
                    controle.menosVolume();
                }

                atualizar();
            }
        });

        setVisible(true);
    }

    // 🔘 MÉTODO PARA CRIAR BOTÕES BONITOS
    private JButton criarBotao(String texto, Color fundo, Color corTexto) {
        JButton botao = new JButton(texto);
        botao.setBackground(fundo);
        botao.setForeground(corTexto);
        botao.setFocusPainted(false);
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        return botao;
    }

    private void atualizar() {
        status.setText(
                "Ligado: " + controle.isLigado() +
                        " | Volume: " + controle.getVolume() +
                        " | Tocando: " + controle.isTocando()
        );
    }
}