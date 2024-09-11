package com.cloud.cli.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;


public class OrderTimeOutCancelTask {
    private Logger LOGGER =LoggerFactory.getLogger(OrderTimeOutCancelTask.class);


    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder(){

    }
}
