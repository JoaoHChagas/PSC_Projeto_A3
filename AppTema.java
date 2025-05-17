
package pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppTema {
   
    public static void main(String[] args) {
        JFrame janela = new JFrame("Ajustes e Preferências");
        janela.setSize(400, 250);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titulo = new JLabel("Tema Atual: Claro");
        titulo.setFont(new Font("Verdana", Font.BOLD, 18));
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoTema = new JButton("Alternar Tema");
        JButton btnNotifica = new JButton("Ativar Notificações");
        JButton sair = new JButton("Deslogar");

        boolean[] modoEscuro = {false};
        boolean[] notificacaoLigada = {false};

        botaoTema.addActionListener(e -> {
            modoEscuro[0] = !modoEscuro[0];
            if (modoEscuro[0]) {
                painel.setBackground(Color.DARK_GRAY);
                titulo.setForeground(Color.WHITE);
                botaoTema.setForeground(Color.WHITE);
                botaoTema.setBackground(Color.GRAY);
                btnNotifica.setForeground(Color.WHITE);
                btnNotifica.setBackground(Color.GRAY);
                sair.setForeground(Color.WHITE);
                sair.setBackground(Color.GRAY);
                titulo.setText("Tema Atual: Meia-noite");
            } else {
                painel.setBackground(Color.WHITE);
                titulo.setForeground(Color.BLACK);
                botaoTema.setForeground(Color.BLACK);
                botaoTema.setBackground(Color.LIGHT_GRAY);
                btnNotifica.setForeground(Color.BLACK);
                btnNotifica.setBackground(Color.LIGHT_GRAY);
                sair.setForeground(Color.BLACK);
                sair.setBackground(Color.LIGHT_GRAY);
                titulo.setText("Tema Atual: Claro");
            }
        });

        btnNotifica.addActionListener(e -> {
            notificacaoLigada[0] = !notificacaoLigada[0];
            if (notificacaoLigada[0]) {
                btnNotifica.setText("Desativar Notificações");
                System.out.println("Notificacoes ativadas pelo usuario");
            } else {
                btnNotifica.setText("Ativar Notificações");
                System.out.println("Notificacoes desativadas pelo usuario");
            }
        });

        sair.addActionListener(e -> {
            System.out.println("Programa fechado!");
            janela.dispose();
        });

        painel.setBackground(Color.WHITE);
        botaoTema.setBackground(Color.LIGHT_GRAY);
        btnNotifica.setBackground(Color.LIGHT_GRAY);
        sair.setBackground(Color.LIGHT_GRAY);

        painel.add(titulo);
        painel.add(Box.createRigidArea(new Dimension(0, 10)));
        painel.add(botaoTema);
        painel.add(Box.createRigidArea(new Dimension(0, 10)));
        painel.add(btnNotifica);
        painel.add(Box.createRigidArea(new Dimension(0, 10)));
        painel.add(sair);

        janela.add(painel);
        janela.setVisible(true);
    }
}

