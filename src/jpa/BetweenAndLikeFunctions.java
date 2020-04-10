/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Rob
 */
public class BetweenAndLikeFunctions
{
	public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaPU" );
      EntityManager entitymanager = emfactory.createEntityManager();
      
      //Between
      Query query = entitymanager.createQuery( "Select e " + "from User e " + "where e.password " + "Between 30000 and 40000" );
      
      List<User> list=(List<User>)query.getResultList( );

      for( User e:list ){
         System.out.print("User ID :" + e.getUserId());
         System.out.println("\t User name :" + e.getName());
      }

      //Like
      Query query1 = entitymanager.createQuery("Select e " + "from User e " + "where e.name LIKE 'G%'");
      
      List<User> list1=(List<User>)query1.getResultList( );
      
      for( User e:list1 ) {
         System.out.print("User ID :"+e.getUserId( ));
         System.out.println("\t User name :"+e.getName( ));
      }
   }
}
