package Capgemeni.Training;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    public static void main(String[] args) {
    	App app=new App();
    	String regex="^(.+)@(.+)$";
    	
    	
    	String email=app.userEmail("abcgmail.com");
    	Pattern pattern =Pattern.compile(regex);
    	Matcher match=pattern.matcher(email);
    	System.out.println("Is It Matched:  "+match.matches());
    	System.out.println(email);
    	String pwd=app.userPassword("ACDFass4573846");
    	 
    	 
    	System.out.println(pwd);
    	app.login();
    }
 
}
