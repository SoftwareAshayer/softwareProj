package org.example;

    public class CustomLogger {
        private Level level;

        public enum Level {
            INFO, WARNING, SEVERE
        }

        public CustomLogger(Level level) {
            this.level = level;
        }


        public void info(String message) {
            log(message, Level.INFO);
        }

        public void log(String message, Level logLevel) {
            if (logLevel.ordinal() >= level.ordinal()) {
                System.out.println(message);
            }
        }
    }


