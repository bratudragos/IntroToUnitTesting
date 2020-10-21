import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    @Test
    public void isTriangleTest1(){
        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void isTriangleTest8(){
        assertFalse(Demo.isTriangle(10,20,10));
    }

    @Test
    public void isTriangleTest9(){
        assertTrue(Demo.isTriangle(100,130,100));
    }

    @Test
    public void isTriangleTest2(){
        assertFalse(Demo.isTriangle(0,1,1));
    }

    @Test
    public void isTriangleTest3(){
        assertFalse(Demo.isTriangle(0,0,0));
    }

    @Test
    public void isTriangleTest4(){
        assertFalse(Demo.isTriangle(-1,0,3));
    }

    @Test
    public void isTriangleTest5(){
        assertTrue(Demo.isTriangle(2,3,4));
    }

    @Test
    public void isTriangleTest6(){
        assertTrue(Demo.isTriangle(1,1,1));
    }

    @Test
    public void isTriangleTest7(){
        assertFalse(Demo.isTriangle(1,5,99));
    }

    @Test
    public void isTriangleTest10(){
        assertFalse(Demo.isTriangle(-10,-20,-10));
    }

    @Test
    public void isTriangleTest11(){
        assertFalse(Demo.isTriangle(5,5,30));
    }

    @Test
    public void isTriangleTest12(){
        assertFalse(Demo.isTriangle(0,-5,30));
    }

    @Test
    public void isTriangleTest13(){
        assertFalse(Demo.isTriangle(5,5,90));
    }

    @Test
    public void isTriangleTest14(){
        assertTrue(Demo.isTriangle(5,5,5));
    }

    @Test
    public void isTriangleTest15(){
        assertTrue(Demo.isTriangle(6,9,10));
    }

    @Test
    public void isTriangleTest16(){
        assertTrue(Demo.isTriangle(7,9,13));
    }

    @Test
    public void isTriangleTest17(){
        assertTrue(Demo.isTriangle(50,50,50));
    }

    @Test
    public void isTriangleTest18(){
        assertFalse(Demo.isTriangle(-6,-9,10));
    }

    @Test
    public void isTriangleTest19(){
        assertFalse(Demo.isTriangle(-10,-15,-10));
    }

    @Test
    public void isTriangleTest20(){
        assertFalse(Demo.isTriangle(0,9,10));
    }

    @Test
    public void isTriangleTest21(){
        assertFalse(Demo.isTriangle(6,9,15));
    }

    @Test
    public void isTriangleTest22(){
        assertFalse(Demo.isTriangle(-6,-5,-11));
    }

    @Test
    public void isTriangleTest23(){
        assertFalse(Demo.isTriangle(10,10,20));
    }

    @Test
    public void isTriangleTest24(){
        assertFalse(Demo.isTriangle(-10,10,0));
    }


    @Test
    public void mainTest1(){
        String input="10\n20\n15\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest2(){
        String input="4\n5\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest3(){
        String input="-1\n0\n3\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest4(){
        String input="1\n5\n99\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest5(){
        String input="0\n0\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest6(){
        String input="100\n100\n130\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest7(){
        String input="-1\n-5\n-99\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest8(){
        String input="0\n5\n-99\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest9(){
        String input="5\n6\n9\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest10(){
        String input="-1\n0\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest11(){
        String input="10\n10\n20\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest12(){
        String input="-1\n-1\n-2\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

    @Test
    public void mainTest13(){
        String input="-1\n1\n0\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args= {};
        Demo.main(args);

        String consoleOutput= "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput,out.toString());
    }

}
