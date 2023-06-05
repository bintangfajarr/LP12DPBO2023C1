/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization.ViewModel;

import synchronization.Model.GameInterface;
import synchronization.Model.GameObject;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Satria Ramadhani
 */
public class Handler implements GameInterface
{
    /**
     * Attribute declaration.
     */
    
    private ArrayList<GameObject> object; // Array / List of GameObject.
    private Random rand;                  // Randomizer.
    
    /**
     * Constructor.
     */
    
    // Default constructor.
    public Handler()
    {
        this.object = new ArrayList<>();
       
    }
    
    /**
     * Object access and manipulations.
     */
    
    // Add object to list.
    public void add(GameObject object)
    {
        this.object.add(object);
    }
    
    // Access object from list.
    public GameObject get(int i)
    {
        return this.object.get(i);
    }
    
    // Count total object on list.
    public int count()
    {
        return this.object.size();
    }
    
    // Remove object from list based on its index.
    public void remove(int i)
    {
        this.object.remove(i);
    }
    
    // Remove object from list.
    public void remove(GameObject object)
    {
        this.object.remove(object);
    }
    
    public boolean collision(GameObject player, GameObject enemy){
        return (player.getX()+25) >= enemy.getX() && 
               player.getX() <= (enemy.getX()+25) && 
               (player.getY()+25) >= enemy.getY() && 
               player.getY() <= (enemy.getY()+25);
    }
    
    /**
     * 
     * Override interface.
     */
    
    @Override
    public void render(Graphics g)
    {
        for(int i = 0; i < object.size(); i++)
        {
            GameObject temp;
            temp = object.get(i);
            
            temp.render(g);
        }
    }
    
    @Override
    public void loop()
    {
        for(int i = 0; i < object.size(); i++)
        {
            GameObject temp;
            temp = object.get(i);
            
            temp.loop();
        }
    }
}
