package xt.application.consumer.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ReceivedDataProcessor{

    @KafkaListener(topics = "${kafka.topics[0]}")
    public void processAddress(String object) {
        log.info("@@ Address details : {}",object);
    }

    @KafkaListener(topics = "${kafka.topics[1]}")
    public void processMetadata(String object) {
        log.info("@@ Metadata details : {}",object);
    }

    @KafkaListener(topics = "${kafka.topics[2]}")
    public void processCustomer(String object) {
        log.info("@@ Customer details : {}",object);
    }
}
