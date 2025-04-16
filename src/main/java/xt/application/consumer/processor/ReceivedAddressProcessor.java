package xt.application.consumer.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReceivedAddressProcessor{

//    @Override
    @KafkaListener(topics = "${kafka.topics[0]}")
    public void process(String object) {
        log.info(object);
    }
}
