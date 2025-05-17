import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Classe da terceira tela (final), que mostra o resultado da partida
public class pageThree {
    public pageThree() {

        // Criação da janela principal (frame) e do painel que vai conter os componentes
        JFrame frame = new JFrame("Placar");
        JPanel panel = new JPanel();
        frame.setSize(360, 640);               // Tamanho fixo da janela
        frame.setVisible(true);                // Exibe a janela
        frame.add(panel);                      // Adiciona o painel à janela
        panel.setSize(360, 640);               // Tamanho do painel
        frame.setResizable(false);             // Impede redimensionamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o app ao encerrar
        frame.setLocationRelativeTo(null);     // Centraliza a janela na tela
        panel.setLayout(null);                 // Layout manual (absoluto)

        // Label de mensagem de parabéns para o vencedor
        JLabel label = new JLabel();
        label.setBounds(35, 115, 320, 150);
        panel.add(label);

        // Verifica quem venceu e personaliza a mensagem e cor
        if (dataBase.setPointPlayerOne == 3) {
            // Se o jogador 1 tiver 3 pontos, exibe mensagem de vitória para ele
            label.setText("Parabéns! " + dataBase.playerOne + " Você Ganhou!");
            // Configura a fonte do texto para Arial, negrito, tamanho 16
            label.setFont(new Font("Arial", Font.BOLD, 16));
            // Define a cor do texto como vermelho
            label.setForeground(Color.RED);
        }
        else {
            // Caso contrário, exibe mensagem de vitória para o jogador 2
            label.setText("Parabéns! " + dataBase.playerTwo + " Você Ganhou!");
            // Configura a fonte do texto para Arial, negrito, tamanho 16
            label.setFont(new Font("Arial", Font.BOLD, 16));
            // Define a cor do texto como azul
            label.setForeground(Color.BLUE);
        }

        // Label título "PLACAR FINAL"
        JLabel labelOneFinish = new JLabel("PLACAR FINAL");
        labelOneFinish.setBounds(105, 250, 150, 50);
        labelOneFinish.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(labelOneFinish);

        // Placar final do jogador 1 (com cor vermelha)
        JLabel setsPlayerOne = new JLabel(dataBase.setPointPlayerOne + " SETS");
        setsPlayerOne.setBounds(35, 300, 100, 50);
        setsPlayerOne.setFont(new Font("Arial", Font.BOLD, 20));
        setsPlayerOne.setForeground(Color.RED);
        panel.add(setsPlayerOne);

        // Label "X" entre os dois placares (visualização tipo "2 X 1")
        JLabel labelTwoFinish = new JLabel("X");
        labelTwoFinish.setBounds(165, 300, 50, 50);
        labelTwoFinish.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(labelTwoFinish);

        // Placar final do jogador 2 (com cor azul)
        JLabel setsPlayerTwo = new JLabel(dataBase.setPointPlayerTwo + " SETS");
        setsPlayerTwo.setBounds(225, 300, 100, 50);
        setsPlayerTwo.setFont(new Font("Arial", Font.BOLD, 20));
        setsPlayerTwo.setForeground(Color.BLUE);
        panel.add(setsPlayerTwo);

        // Botão para encerrar o programa com o texto "FIM"
        JButton closeButton = new JButton("FIM");
        closeButton.setBounds(35, 470, 100, 50); // Posição central inferior
        panel.add(closeButton);

        // Ação do botão: fecha a janela e encerra o programa
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();      // Fecha a janela
                System.exit(0);       // Encerra a aplicação
            }
        });

        JButton restart = new JButton("Reiniciar");
        restart.setBounds(225, 470, 100, 50); // Posição central inferior
        panel.add(restart);

        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new scoreboard();
            }
        });
    }
}
