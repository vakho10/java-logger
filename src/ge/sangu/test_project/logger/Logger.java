package ge.sangu.test_project.logger;

public abstract class Logger implements Loggerable {

    private final Class clazz;
    private Level level;

    public Logger(Class clazz) {
        this.clazz = clazz;
        this.level = Level.TRACE;
    }

    public Logger(Class clazz, Level level) {
        this.clazz = clazz;
        this.level = level;
    }

    protected abstract void abstractLog(String message);

    private String formatMessage(Level level, String message) {
        return String.format("[%s][%s]: %s\n", clazz.getName(), level, message);
    }

    @Override
    public void log(Level level, String message) {
        if (this.level.getValue() <= level.getValue()) {
            abstractLog(formatMessage(level, message));
        }
    }

    @Override
    public void trace(String message) {
        log(Level.TRACE, message);
    }

    @Override
    public void debug(String message) {
        log(Level.DEBUG, message);
    }

    @Override
    public void info(String message) {
        log(Level.INFO, message);
    }

    @Override
    public void warn(String message) {
        log(Level.WARN, message);
    }

    @Override
    public void error(String message) {
        log(Level.ERROR, message);
    }

    @Override
    public void fatal(String message) {
        log(Level.FATAL, message);
    }
}
