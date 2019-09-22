package ge.sangu.test_project;

import ge.sangu.test_project.logger.Logger;
import ge.sangu.test_project.logger.impl.FileLogger;

import java.nio.file.Paths;

public class Main {

    private static final Logger LOGGER = new FileLogger(Main.class, Paths.get("log.txt"));

    public static void main(String[] args) {
        LOGGER.info("Information");
    }
}
