package ge.sangu.test_project.logger.impl;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Class clazz) {
        super(clazz);
    }

    @Override
    protected void abstractLog(String message) {
        System.out.println(message);
    }
}
