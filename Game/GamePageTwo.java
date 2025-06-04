import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePageTwo {
    private int x=0, y=0;
    private JButton buttonImageMario;

    public GamePageTwo() {

        JFrame frame = new JFrame("Movimentar Mario");
        frame.setSize(750, 480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        JPanel panel = new JPanel(null);
        panel.setBounds(0, 0, 750, 480);
        panel.setBackground(Color.BLACK);
        frame.add(panel);

        ImageIcon marioImage = new ImageIcon("resources/mario bros.png");
        ImageIcon resizedImage = new ImageIcon(marioImage.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        JButton buttonImageMario = new JButton(resizedImage);
        buttonImageMario.setBorder(null);
        buttonImageMario.setBackground(Color.BLACK);
        buttonImageMario.setBounds(0, 0, 60, 60);
        panel.add(buttonImageMario);

        ImageIcon mushroomImage = new ImageIcon("resources/cogumelo.png");
        ImageIcon resizedImageMushroom = new ImageIcon(mushroomImage.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH));
        JButton buttonImageMushroom = new JButton(resizedImageMushroom);
        buttonImageMushroom.setBounds(480, 340, 60, 60);
        buttonImageMushroom.setBackground(Color.BLACK);
        buttonImageMushroom.setBorder(null);
        panel.add(buttonImageMushroom);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                // Movimentar o botão com as teclas direcionais
                if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_UP) {
                    y -= 10;  // Mover para cima
                } else if (keyCode == KeyEvent.VK_S || keyCode == KeyEvent.VK_DOWN) {
                    y += 10;  // Mover para baixo
                } else if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_LEFT) {
                    x -= 10;  // Mover para a esquerda
                } else if (keyCode == KeyEvent.VK_D || keyCode == KeyEvent.VK_RIGHT) {
                    x += 10;  // Mover para a direita
                }

                // Atualizar a posição do botão
                buttonImageMario.setBounds(x, y, 60, 60);

                Rectangle marioBounds = buttonImageMario.getBounds();
                Rectangle mushroomBounds = buttonImageMushroom.getBounds();

                if (marioBounds.intersects(mushroomBounds)) {
                    frame.dispose();
                }

                // Impedir que o Mario saia da tela
                if (x < 0) x = 0;
                if (y < 0) y = 0;
                if (x > 750 - 100) x = 750 - 100;
                if (y > 480 - 100) y = 480 - 100;
            }
        });
        frame.setFocusable(true);  // Necessário para que o JFrame receba os eventos de teclado
        frame.requestFocusInWindow();
    }
}