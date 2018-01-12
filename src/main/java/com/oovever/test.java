package com.oovever;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author OovEver
 * 2018/1/12 18:34
 */
@Slf4j
public class test {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(test.class);
        log.info("aaa");
        log.error("aaa");
        log.error("error1");
//        logger.debug("debug");
//        logger.info("ddd");
//        logger.error("test");
    }
}
