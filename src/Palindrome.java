import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrome {
    
    public static boolean isPal(String inp) {
    	String rev = null, inpCaseInsensitive;
    	 if (inp == null || inp.isEmpty())  {
             throw new IllegalArgumentException();
     }
        String inpNoWhitespace = inp.replaceAll("\\s+",""); // remove whitespace
        //System.out.println(inpNoWhitespace);
        // Check for punctuation mark
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(inpNoWhitespace);
        
        boolean isSpl = m.find();
        if (isSpl == true)
	    {
	           //System.out.println("There is a special character in input ");
	           return false;
	    }
	    else
	    {
	    	
	        inpCaseInsensitive = inpNoWhitespace.toLowerCase(); // inp to lowercase
	        //System.out.println(inpCaseInsensitive);
	        //check for palindrome
	        int len = inpCaseInsensitive.length();
	        for (int i = 0; i < len/2; i++ ) {
	        	if(inpCaseInsensitive.charAt(i) != inpCaseInsensitive.charAt(len-1-i)) {
	        		//System.out.println("Not a Palindrome");
	        		return false;
	            }
	        }
	        //System.out.println("String is a Palindrome");	
	        return true;
	    }
    }
}