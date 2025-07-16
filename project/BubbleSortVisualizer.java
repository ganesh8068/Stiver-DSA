package project;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class BubbleSortVisualizer extends JPanel {

    private final int[] array;
    private int current = -1;
    private int comparing = -1;

    public BubbleSortVisualizer(int size) {
        this.array = new int[size];
        generateRandomArray();
        new Thread(this::bubbleSort).start();
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(400) + 50;
        }
    }

    private void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                current = j;
                comparing = j + 1;
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
                repaint();
                sleep(50); // control animation speed
            }
        }
        current = -1;
        comparing = -1;
        repaint();
    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
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
        for (int i = 0; i < array.length; i++) {
            if (i == current) g.setColor(Color.RED);
            else if (i == comparing) g.setColor(Color.BLUE);
            else g.setColor(Color.GRAY);

            g.fillRect(i * width, getHeight() - array[i], width - 2, array[i]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bubble Sort Visualizer");
        BubbleSortVisualizer panel = new BubbleSortVisualizer(50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
