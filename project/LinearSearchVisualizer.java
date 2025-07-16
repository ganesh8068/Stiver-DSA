package project;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class LinearSearchVisualizer extends JPanel {

    private final int[] array;
    private int currentIndex = -1;
    private final int target;

    public LinearSearchVisualizer(int size, int target) {
        this.array = new int[size];
        this.target = target;
        generateRandomArray();
        new Thread(this::linearSearch).start();
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(15) + 1;
        }
    }

    private void linearSearch() {
        for (int i = 0; i < array.length; i++) {
            currentIndex = i;
            repaint();
            sleep(300);
            if (array[i] == target) {
                break;
            }
        }
        currentIndex = -1; // Reset after search
        repaint();
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {}
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth() / array.length;
        g.setFont(new Font("Arial", Font.BOLD, 12));

        for (int i = 0; i < array.length; i++) {
            if (i == currentIndex) {
                if (array[i] == target) g.setColor(Color.GREEN);
                else g.setColor(Color.RED);
            } else {
                g.setColor(Color.GRAY);
            }
            int x = i * width;
            int y = getHeight() - array[i];
            g.fillRect(x, y, width - 2, array[i]);

            // Draw number above the bar, centered
            g.setColor(Color.BLACK);
            String numStr = String.valueOf(array[i]);
            int strWidth = g.getFontMetrics().stringWidth(numStr);
            g.drawString(numStr, x + (width - 2 - strWidth) / 2, y - 5);
        }

        // Draw target label
        g.setColor(Color.BLACK);
        g.drawString("Target: " + target, 10, 20);
    }

    public static void main(String[] args) {
        int size = 15;
        int target = 9; // You can change target here
        JFrame frame = new JFrame("Linear Search Visualizer");
        LinearSearchVisualizer panel = new LinearSearchVisualizer(size, target);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
