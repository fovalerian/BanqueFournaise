/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import entity.User;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author v
 */
public class UserGestionTest {
    
    public UserGestionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addUser method, of class usersGestion.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        Map users = null;
        User user = null;
        UserGestion instance = new UserGestion();
        Map expResult = null;
        Map result = instance.addUser(users, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class usersGestion.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        Map users = null;
        User user = null;
        UserGestion instance = new UserGestion();
        Map expResult = null;
        Map result = instance.deleteUser(users, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class usersGestion.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        Map users = null;
        User user = null;
        UserGestion instance = new UserGestion();
        Map expResult = null;
        Map result = instance.updateUser(users, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readUser method, of class usersGestion.
     */
    @Test
    public void testReadUser() {
        System.out.println("readUser");
        Map users = null;
        User user = null;
        UserGestion instance = new UserGestion();
        instance.readUser(users, user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
