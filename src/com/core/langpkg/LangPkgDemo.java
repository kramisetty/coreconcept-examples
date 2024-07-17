package com.core.langpkg;

import java.util.logging.Logger;

public class LangPkgDemo {
    public static final Logger logger = Logger.getLogger(String.valueOf(LangPkgDemo.class));

    public LangPkgDemo() {
        logger.info("Welcome to LongPkgDemo Cls:::::");
    }

    public static void main(String[] args) {
        logger.info("Doing some practice on lang package");
    }
}
