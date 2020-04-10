/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Rob
 */
public class ScalarandAggregateFunctions
{
	 public static void main( String[ ] args ) {
   
      EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "jpaPU" );
      EntityManager entitymanager = emfactory.createEntityManager();

      //Scalar function
      Query query = entitymanager.
      createQuery("Select UPPER(u.name) from User u");
      List<String> list = query.getResultList();

      for(String u:list) {
         System.out.println("User NAME :"+u);
      }
      
      //Aggregate function
      Query query1 = entitymanager.createQuery("Select MAX(u.userId) from User u");
      int result = (int) query1.getSingleResult();
      System.out.println("Max User Id :" + result);
   }
   
}
