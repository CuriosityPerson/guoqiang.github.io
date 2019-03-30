package com.mrlong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01ApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        logger.trace("这是trace消息");
        logger.debug("这是debug消息");
        logger.info("这是info消息");
        logger.warn("这是warn消息");
        logger.error("这是error消息");

    }

}
