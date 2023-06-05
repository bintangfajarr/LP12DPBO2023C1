/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization.Model;

import java.awt.Color;
import java.awt.Graphics;
import synchronization.View.Game;
/**
 *
 * @author binta
 */
public class enemy extends GameObject{
    public enemy()
    {
        super(0, 0, "enemy");
        super.setHeight(25);
    }
    
    // Constructor with player position.
    public enemy(int x, int y)
    {
        super(x, y, "enemy");
        super.setHeight(25);
    }
    
    /**
     * Override interface.
     */
    
    @Override
    public void render(Graphics object)
    {
        // Set player shape.
        object.setColor(Color.decode("#ffffff"));
        object.fillRect(x, y, 25, 25);
    }
    
    @Override
    public void loop()
    {
        // Initialize velocity, so object can move.
        this.x += this.velX;
        this.y += this.velY;
        
        // Initialize player bound, so it won't get offset the display.
        x = Game.clamp(x, 0, (Game.width - 50));
        y = Game.clamp(y, 0, (Game.height - 70));
    }
}
