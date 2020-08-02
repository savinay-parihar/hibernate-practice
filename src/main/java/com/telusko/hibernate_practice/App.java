package com.telusko.hibernate_practice;

import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Alien alien = new Alien();
        alien.setAid(101);
        alien.setAname("Savinay");
        alien.setColor("Green");
        
        
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        
        SessionFactory sFactory= configuration.buildSessionFactory();
        Session session = sFactory.openSession();
        session.save(alien);
        
        		
    }
}
