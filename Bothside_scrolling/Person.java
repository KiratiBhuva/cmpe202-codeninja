import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Background1
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
    } 
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            shoot();
        }
    }
    public void shoot()
    {
        getWorld().addObject(new Bullet(), getX(), getY());
    }
}
