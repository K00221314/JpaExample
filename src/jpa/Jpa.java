/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rob
 */
public class Jpa
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaPU" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );

      User user = new User( ); 
     
      user.setName("Abcl123" );
      user.setPassword("12345" );
      //user.setDeg( "Technical Manager" );
      
      entitymanager.persist( user );
      entitymanager.getTransaction( ).commit( );

      entitymanager.close( );
      emfactory.close( );
   }
	
	
}
