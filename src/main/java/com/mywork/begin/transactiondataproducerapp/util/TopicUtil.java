package com.mywork.begin.transactiondataproducerapp.util;

import java.util.List;
import java.util.Random;

public class TopicUtil {

    private TopicUtil() {
    }

    public static String getRandomTopics(List<String> kafkaTopics) {
        return kafkaTopics.get(new Random().nextInt(kafkaTopics.size()));
    }
}
