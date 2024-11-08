/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pesomosca;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JUAN GUILLERMO DUQUE
 */
class TreeType {
    private final String name;
    private final Color color;
    private final String texture;

    public TreeType(String name, Color color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x - 5, y, 10, 30); 
        g.setColor(Color.GREEN);
        g.fillOval(x - 15, y - 30, 30, 30); 
    }
}
