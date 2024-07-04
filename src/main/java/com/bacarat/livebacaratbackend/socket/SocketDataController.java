package com.bacarat.livebacaratbackend.socket;

import com.bacarat.livebacaratbackend.entity.SocketData;
import com.bacarat.livebacaratbackend.repository.SocketDataRepository;
import com.bacarat.livebacaratbackend.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@EnableScheduling
public class SocketDataController {

    private final SimpMessagingTemplate template;

    private SocketDataRepository socketDataRepository;

    @Autowired
    public SocketDataController(SimpMessagingTemplate template, SocketDataRepository socketDataRepository) {
        this.template = template;
        this.socketDataRepository = socketDataRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void greeting() throws InterruptedException {
        Integer index = 0;
        List<SocketData> socketDataList = socketDataRepository.findAll();
        while (true) {
            Thread.sleep(1500); // simulated delay
            template.convertAndSend(Constant.URL_PREFIX_DESCRIBE + Constant.URL_CHANNEL_BACCARAT, socketDataList.get(index).getContent());
            index = index == socketDataList.size() - 1 ? 0 : index + 1;
        }
    }

}
