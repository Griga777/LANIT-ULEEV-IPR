package example.task1Test;

import example.task2Test.ApiTest;
import example.task3Test.WebTest;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        OutputHiInMavenConsoleTest.class,
        ApiTest.class,
        WebTest.class})
public class MyTestSuite extends TestCase {
    protected void runTest() {
    }
}
