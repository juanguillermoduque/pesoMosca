package com.mycompany.pesomosca;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightTreeExample extends JFrame {
    private final Forest forest;

    public FlyweightTreeExample() {
        setTitle("Patrón Flyweight - Bosque");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        forest = new Forest();
        add(forest);
        plantRandomTrees();
    }

    private void plantRandomTrees() {
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 600);
            if (i % 3 == 0) {
                forest.plantTree(x, y, "Pino", Color.GREEN, "Textura Pino");
            } else if (i % 3 == 1) {
                forest.plantTree(x, y, "Roble", Color.ORANGE, "Textura Roble");
            } else {
                forest.plantTree(x, y, "Abeto", Color.BLUE, "Textura Abeto");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlyweightTreeExample example = new FlyweightTreeExample();
            example.setVisible(true);
        });
    }
}
