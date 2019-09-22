package ge.sangu.test_project.logger.impl;

import ge.sangu.test_project.logger.Level;
import ge.sangu.test_project.logger.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileLogger extends Logger {

    private Path filePath;

    public FileLogger(Class clazz, Path filePath) {
        super(clazz);
        this.filePath = filePath;
    }

    public FileLogger(Class clazz, Level level, Path filePath) {
        super(clazz, level);
        this.filePath = filePath;
    }

    @Override
    protected void abstractLog(String message) {
        try {
            Files.writeString(filePath, message, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
