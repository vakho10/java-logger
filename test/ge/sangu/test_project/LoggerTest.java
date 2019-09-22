package ge.sangu.test_project;

import ge.sangu.test_project.logger.Logger;
import ge.sangu.test_project.logger.impl.ConsoleLogger;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LoggerTest {

    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Logger logger = new ConsoleLogger(this.getClass());

        // assert statements
        assertNotNull(logger);
    }
}
