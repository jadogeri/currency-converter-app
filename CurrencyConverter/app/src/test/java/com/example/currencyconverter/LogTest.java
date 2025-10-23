package com.example.currencyconverter;
import static org.junit.Assert.*;
import org.junit.*;

public class LogTest {
    private Log logger;
    private static int testCount = 0;

    @BeforeClass()
    public static void setUpClass(){
        System.out.println("== Set Up Class");

    }
    @Before
    public void setUp() {
        testCount++;
        System.out.println("== Set Up Test "+ testCount);
        logger = new Log();

    }

    @After
    public void tearDown() {
        System.out.println("== Tear Down Test "+ testCount);
        logger = null;
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("== Tear Down Class");
    }

    @Test
    public void getCount() {
        assertEquals(0,logger.getCount());
    }

    @Test
    public void setCount() {
        logger.setCount(5);
        assertEquals(5,logger.getCount());

    }

    @Test
    public void getMessage() {

        assertEquals("Error!! : ugk is not a number",logger.getMessage("ugk"));

    }

    @Test
    public void getRandomMessageOne() {

        String log1 = logger.getRandomMessage("XY4",5);
        assertEquals("Error!! : The input " + "XY4" + " is not a valid number",log1);

    }
    @Test

    public void getRandomMessageTwo() {

        String log2 = logger.getRandomMessage("abx",6);
        assertEquals("Error!! : " + "abx" + " is not a number",log2);
    }
    @Test

    public void getRandomMessageThree() {

        String log3 = logger.getRandomMessage("xyz",8);
        assertEquals("Error!! : Please provide a valid number, not " + "xyz",log3);

    }
}