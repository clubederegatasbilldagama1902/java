import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// Classe principal
public class scoreboard {

    // Construtor — usado para iniciar a interface
    public scoreboard() {

        // Cria a janela principal (JFrame)
        JFrame frame = new JFrame("Placar");

        // Cria um painel (JPanel) para colocar os componentes
        JPanel panel = new JPanel();

        // Define tamanho da janela e a torna visível
        frame.setSize(360, 640);
        frame.setVisible(true);

        // Adiciona o painel à janela
        frame.add(panel);

        // Define o tamanho do painel
        panel.setSize(360, 640);

        // Impede redimensionamento da janela
        frame.setResizable(false);

        // Encerra o programa ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        // Define layout nulo (para posicionamento manual dos componentes)
        frame.setLayout(null);

        // Adiciona rótulos com instruções e textos
        label(panel, "Insira os dados abaixo", 10);     // Instrução inicial
        mainLabel(panel, "Jogador 1", 56);              // Rótulo do campo Jogador 1
        mainLabel(panel, "Jogador 2", 156);             // Rótulo do campo Jogador 2
        mainLabel(panel, "Set por partidas", 256);      // Rótulo do campo de sets
        mainLabel(panel, "Ponto por set", 356);         // Rótulo do campo de pontos por set

        // Campos de entrada de texto (text fields)
        JTextField textFieldOne = new JTextField("Jogador 1");
        textFieldOne.setBounds(10, 95, 320, 50);
        panel.add(textFieldOne);

        // Campo de texto para o nome do Jogador 2
        JTextField textFieldTwo = new JTextField("Jogador 2");
        textFieldTwo.setBounds(10, 195, 320, 50);
        panel.add(textFieldTwo);

        // Campo de texto para quantidade de sets por partida
        JTextField textFieldThree = new JTextField("3"); // Sets por partida
        textFieldThree.setBounds(10, 295, 320, 50);
        panel.add(textFieldThree);

        // Campo de texto para quantidade de pontos por set
        JTextField textFieldFour = new JTextField("5"); // Pontos por set
        textFieldFour.setBounds(10, 395, 320, 50);
        panel.add(textFieldFour);

        // Botão "Começar"
        JButton button = new JButton("Começar");
        button.setBounds(120, 470, 100, 50);

        // Ação ao clicar no botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Salva os dados digitados em uma classe chamada dataBase (não fornecida aqui)
                dataBase.playerOne = textFieldOne.getText();
                dataBase.playerOne = dataBase.playerOne.substring(0, 1).toUpperCase()
                        + dataBase.playerOne.substring(1).toLowerCase(); // Capitaliza

                dataBase.playerTwo = textFieldTwo.getText();
                dataBase.playerTwo = dataBase.playerTwo.substring(0, 1).toUpperCase()
                        + dataBase.playerTwo.substring(1).toLowerCase(); // Capitaliza

                // Converte e salva os valores numéricos de sets e pontos
                dataBase.set = Integer.parseInt(textFieldThree.getText());
                dataBase.point = Integer.parseInt(textFieldFour.getText());

                // Abre a próxima página (nova janela)
                new pageTwo();

                // Fecha a janela atual
                frame.dispose();
            }
        });

        // Adiciona o botão ao painel
        panel.add(button);
    }

    // Método para criar um JLabel com texto explicativo mais genérico
    public static void label(JPanel panel, String o, int y) {
        JLabel label = new JLabel(o);
        label.setBounds(10, y, 150, 50);    // Define posição e tamanho do rótulo
        panel.add(label);
    }

    // Método para criar um JLabel com texto e posição vertical (y) específica
    public static void mainLabel(JPanel panel, String o, int y) {
        JLabel label = new JLabel(o);
        label.setBounds(10, y, 100, 50);    // Define posição e tamanho do rótulo
        panel.add(label);
    }
    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        new scoreboard();
    }

}