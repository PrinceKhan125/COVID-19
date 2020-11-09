// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rock rock =  new  Rock();
        addObject(rock, 281, 192);
        Rocket rocket =  new  Rocket();
        addObject(rocket, 276, 125);
        Ted ted =  new  Ted();
        addObject(ted, 39, 49);
        Ted ted2 =  new  Ted();
        addObject(ted2, 36, 361);
        Ted ted3 =  new  Ted();
        addObject(ted3, 561, 41);
        Ted ted4 =  new  Ted();
        addObject(ted4, 561, 364);
    }
}
