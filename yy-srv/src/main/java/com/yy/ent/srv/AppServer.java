package com.yy.ent.srv;

import com.yy.ent.mvc.ioc.Cherry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2015/10/22
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public class AppServer extends YYServer {

    private final static Logger LOGGER = LoggerFactory.getLogger(AppServer.class);

    private Cherry cherry;

    public AppServer() {
        try {
            cherry = new Cherry("cherry.xml");
        } catch (Exception e) {
            LOGGER.info(e.getMessage(), e);
        }
    }

    public static void main(String[] args) {
        LOGGER.info("______________start____________");
        new AppServer().start(8888);
    }
}
