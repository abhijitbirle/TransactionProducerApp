package com.mywork.begin.transactiondataproducerapp.kafka;

import com.mywork.begin.transactiondataproducerapp.config.ApplicationProperties;
import com.mywork.begin.transactiondataproducerapp.model.TransactionEvent;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Log4j2
@Component
public class TransactionProducer {

    @Autowired
    private KafkaTemplate<String, TransactionEvent> kafkaTemplate;

    @Autowired
    private ApplicationProperties applicationProperties;

    /**
     * The send API returns a ListenableFuture object. If we want to block the sending thread and get the result about
     * the sent message, we can call the get API of the ListenableFuture object. The thread will wait for the result,
     * but it will slow down the producer.
     * <p>
     * Kafka is a fast stream processing platform. So it's a better idea to handle the results asynchronously so that
     * the subsequent messages do not wait for the result of the previous message. We can do this through a callback
     *
     * @param TransactionEvent
     */
    public void sendToKafkaTopic(TransactionEvent TransactionEvent) {
        ListenableFuture<SendResult<String, TransactionEvent>> future =
                kafkaTemplate.send(applicationProperties.getKafkaTopics().get(0), TransactionEvent);

        future.addCallback(new ListenableFutureCallback<SendResult<String, TransactionEvent>>() {

            @Override
            public void onSuccess(SendResult<String, TransactionEvent> result) {
             log.error("Sent message= with offset=[" + result.getRecordMetadata().offset() + "]");
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("Unable to send message= due to : " + ex.getMessage());
            }
        });
    }
}
