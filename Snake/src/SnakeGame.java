import javax.swing.*;
import java.util.Scanner;

public class SnakeGame {
    static void runGame() {
        ProgressBar pro = new ProgressBar();
        pro.setVisible(true);
        pro.test();
    }

    public static void main(String[] args) {
        try {
            runGame();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getCause());
        }
    }
}
