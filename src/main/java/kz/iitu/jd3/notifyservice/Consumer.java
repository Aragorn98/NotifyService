package kz.iitu.jd3.notifyservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {


    @KafkaListener(topics = "group_requests", groupId = "group_id")
    public void consume(GroupRequest groupRequest) throws IOException {
        System.out.println(String.format("#### -> Notify user by email: -> %s",
                "Teacher " + groupRequest.getTeacherId() + " lead group "
                        + groupRequest.getGroup().toString()));
    }
}