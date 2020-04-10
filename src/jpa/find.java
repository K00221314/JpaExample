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
public class find
{
	  public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaPU" );
      EntityManager entitymanager = emfactory.createEntityManager();
      User user = entitymanager.find( User.class, 7 );

      System.out.println("User ID = " + user.getUserId());
      System.out.println("User NAME = " + user.getName());
      System.out.println("User Password = " + user.getPassword());
    
   }
	
}
