import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        BottomBorder bottom = new BottomBorder(800,30);
        Player p = new Player();
        Step1 s1 = new Step1(350,30);
        Step1 s2 = new Step1(350,30);
        Step1 s3 = new Step1(350,30);
        Monster m = new Monster();
        addObject(p, 50,50);
        addObject(m, 750,50);
        addObject(bottom, 400,587);
        addObject(s1, 412,140);
        addObject(s2, 264,291);
        addObject(s3, 420,432);
    }
}
