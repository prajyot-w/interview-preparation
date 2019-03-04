package prep.interview.InterviewPreparation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTests {
    private ReverseString component;

    @Before
    public void init() {
        component = new ReverseString();
    }

    @Test
    public void test1() {
        String testString = "Exzemplification";
        String resultString = "noitacifilpmezxE";

        Assert.assertEquals(resultString, component.run(testString));
    }

    @Test
    public void test2() {
        String testString = "profile";
        String resultString = "eliforp";

        Assert.assertEquals(resultString, component.run(testString));
    }

    @Test
    public void test3() {
        String testString = "breathe";
        String resultString = "ehtaerb";

        Assert.assertEquals(resultString, component.run(testString));
    }

    @Test
    public void test4() {
        String testString = "begin";
        String resultString = "nigeb";

        Assert.assertEquals(resultString, component.run(testString));
    }

    @Test
    public void test5() {
        String testString = "dream";
        String resultString = "maerd";

        Assert.assertEquals(resultString, component.run(testString));
    }

}
