/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb.isae.etudiant.mongoDBProject;

import java.util.Arrays;

/**
 *
 * @author unknow
 */
public class Main {
     public static void main(String[] args) {
      CRUD c=new CRUD();
      
      System.out.println("------------------New Command Executed------------------");
      System.out.println("Create The First User");
      c.create("Louay", "123456");
      c.viewAll();
      
      System.out.println("------------------New Command Executed------------------");
      System.out.println("Create The Second User");
      c.create("Louay2", "123456", "Created with description");
      c.viewAll();
     
      System.out.println("------------------New Command Executed------------------");
      System.out.println("Create The Third User");
      c.create("Pascal", "123456", "Created with description and role", Arrays.asList("Prof", "Admin"));
      c.viewAll();
   
      System.out.println("------------------New Command Executed------------------");
      System.out.println("Update The role of Louay ");
      c.updateRole("Louay2",Arrays.asList("Etudiant"));
      c.viewAll();
      
      System.out.println("------------------New Command Executed------------------");
      c.deleteUser("Louay");
      c.viewAll();
     
     
   }
    
}
