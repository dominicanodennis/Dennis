import junit.framework.TestCase;

/**
 * Created by dennis on 05.11.15.
 */
public class EuroTest extends TestCase {

    public EuroTest(String name) {
        super(name);
    }

    public void testAmount() {
        Euro two = new Euro(2.00);
        assertTrue(2.00 == two.getAmount());
    }
    public void testRechner(){
        Rechner rechner = new Rechner(2,3);
        assertTrue(rechner.addiere()==5);

    }

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(EuroTest.class);
    }

}
