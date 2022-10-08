package com.vigilantex.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerDB {


    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumerDB.class);

    @KafkaListener(topics = "wikimedia_recentchange",groupId = "myGroup")
    public void consume(String mssg)
    {
        System.out.println("data->"+mssg);
    }

}
