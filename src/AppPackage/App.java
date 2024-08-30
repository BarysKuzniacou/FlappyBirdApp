package AppPackage;

import FlappyBirdPackage.FlappyBird;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        final int  boardWidth = 360;
        final int  boardHeigth = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeigth);
        //frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}
