import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class CheckItTest {
    @Test
    public void predicateCoverageTest1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void predicateCoverageTest2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, false);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(false, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest4() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void caccCoverageTest1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void caccCoverageTest2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void raccCoverageTest1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void raccCoverageTest2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void mccCoverageTest1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        CheckIt.checkIt(false, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

}