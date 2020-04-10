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
public class update
{
	 public static void main( String[ ] args ) {
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaPU" );
      
      EntityManager entitymanager = emfactory.createEntityManager( );
      entitymanager.getTransaction( ).begin( );
      User user = entitymanager.find( User.class, 2);
      
      //before update
      System.out.println( user );
      user.setName("77");
      entitymanager.getTransaction( ).commit( );
      
      //after update
      System.out.println( user );
      entitymanager.close();
      emfactory.close();
   }
}

	

