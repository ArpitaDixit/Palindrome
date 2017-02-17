import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class PalindromeTest {

	static String str = null;
	@BeforeClass
	public static void userInp()  {
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter a word, number or a Phrase");
	    str = in.nextLine();
    }
	//Null
	@Test(expected = IllegalArgumentException.class)
	public void throwArrayExceptionForEmptyString() {
	    Palindrome.isPal(null);
	}

	//odd length alphanumeric Palindrome
	@Test
	public void oddAlphanumPal()  {
                assertTrue(Palindrome.isPal("1a000a1")); //Palindrome                
            }
	//even length alphanumeric Palindrome
	@Test
	public void evenAlphanumPal()  {
        assertTrue(Palindrome.isPal("1a0000a1")); //Palindrome 
	}
      //alphanumeric not a Palindrome
    	@Test
    	public void alphanum()  {
            assertFalse(Palindrome.isPal("Arpita124")); //Not a Palindrome   
    }
    	//Phrase Palindrome same case whitespaces ignored
    	@Test
    	public void phrasePal()  {
        assertTrue(Palindrome.isPal("do geese see god")); //Palindrome                
    }
    	//Phrase Palindrome Case Insensitive whitespaces ignored
    	@Test
    	public void phrasePalCaseinsensitive()  {
        assertTrue(Palindrome.isPal("A Santa Lived As a Devil At NASA")); //Palindrome                
    }
    	//Phrase Case Insensitive not a palindrome
    	@Test
    	public void phraseCaseinsensitive()  {
        assertFalse(Palindrome.isPal("My name is Arpita")); //Not a Palindrome                
    }
    	//Palindrome Phrase Case Insensitive special character 
    	@Test
    	public void phrasePalCaseinsensitiveSpcl()  {
    		//Palindrome if special Character allowed
        assertFalse(Palindrome.isPal("Eva, Can I Stab Bats In A Cave?"));     																				
    }
    	//Phrase Case Insensitive special character
    	@Test
    	public void phraseCaseinsensitiveSpcl()  {
        assertFalse(Palindrome.isPal("My!")); //Not a Palindrome    																			
    }
    	//Ignore
    	@Ignore
    	public void phrasePalDupl()  {
        assertTrue(Palindrome.isPal("hel l o ol leh")); //Not a Palindrome    																			
    }   //assertion not null
    	@Test
    	public void testNotNullString() {
    		assertNotNull("Abc", false);
    	}
    	// assertion null
    	@Test
    	public void testNullString() {
    		assertNull("", null);
    	}
    	//User can test any string
    	@Test
    	public void testInp() {
                    assertTrue(Palindrome.isPal(str));
                }
}
