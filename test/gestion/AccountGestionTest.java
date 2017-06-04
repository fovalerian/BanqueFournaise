/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import entity.Account;
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
public class AccountGestionTest {
    
    public AccountGestionTest() {
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
     * Test of addAccount method, of class accountGestion.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Map accounts = null;
        Account account = null;
        AccountGestion instance = new AccountGestion();
        Map expResult = null;
        Map result = instance.addAccount(accounts, account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteAccount method, of class accountGestion.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        Map accounts = null;
        Account account = null;
        AccountGestion instance = new AccountGestion();
        Map expResult = null;
        Map result = instance.deleteAccount(accounts, account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAccount method, of class accountGestion.
     */
    @Test
    public void testUpdateAccount() {
        System.out.println("updateAccount");
        Map accounts = null;
        Account account = null;
        AccountGestion instance = new AccountGestion();
        Map expResult = null;
        Map result = instance.updateAccount(accounts, account);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAccount method, of class accountGestion.
     */
    @Test
    public void testReadAccount() {
        System.out.println("readAccount");
        Map accounts = null;
        Account account = null;
        AccountGestion instance = new AccountGestion();
        instance.readAccount(accounts, account);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
