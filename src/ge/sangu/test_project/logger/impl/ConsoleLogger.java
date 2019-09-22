package ge.sangu.test_project.logger.impl;

import ge.sangu.test_project.logger.Logger;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Class clazz) {
        super(clazz);
    }

    @Override
    protected void abstractLog(String message) {
        System.out.println(message);
    }
}
