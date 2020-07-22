package tutorial1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTestClass {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggerTestClass.class);
        logger.info("This work?");
    }
}
