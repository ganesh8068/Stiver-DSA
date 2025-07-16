package project;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class MergeSortVisualizer extends JPanel {

    private final int[] array;
    private int left = -1, right = -1, mid = -1;

    public MergeSortVisualizer(int size) {
        this.array = new int[size];
        generateRandomArray();
        new Thread(() -> mergeSort(0, array.length - 1)).start();
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(400) + 50;
        }
    }

    private void mergeSort(int start, int end) {
        if (start < end) {
            int m = (start + end) / 2;
            mergeSort(start, m);
            mergeSort(m + 1, end);
            merge(start, m, end);
            repaint();
            sleep(100);
        }
    }

    private void merge(int start, int midVal, int end) {
        int n1 = midVal - start + 1;
        int n2 = end - midVal;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(array, start, L, 0, n1);
        System.arraycopy(array, midVal + 1, R, 0, n2);

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            left = start;
            right = end;
            mid = k;
            if (L[i] <= R[j]) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
            repaint();
            sleep(50);
        }

        while (i < n1) {
            array[k++] = L[i++];
            repaint();
            sleep(50);
        }

        while (j < n2) {
            array[k++] = R[j++];
            repaint();
            sleep(50);
        }

        left = right = mid = -1;
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
            if (i >= left && i <= right) g.setColor(Color.ORANGE);
            else if (i == mid) g.setColor(Color.RED);
            else g.setColor(Color.GRAY);
            g.fillRect(i * width, getHeight() - array[i], width - 2, array[i]);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Merge Sort Visualizer");
        MergeSortVisualizer panel = new MergeSortVisualizer(50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

