package com.hujq.prize.msg;


import com.hujq.prize.commons.constants.RabbitKeys;
import com.hujq.prize.commons.db.entity.CardUserGame;
import com.hujq.prize.commons.db.mapper.CardUserGameMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitKeys.QUEUE_HIT)
public class PrizeGameReceiver {

    private final static Logger logger = LoggerFactory.getLogger(PrizeGameReceiver.class);

    @Autowired
    private CardUserGameMapper cardUserGameMapper;

    @RabbitHandler
    public void processMessage3(CardUserGame message){
        logger.info("user play : game={},user={},time={}",message.getGameid(),message.getUserid(),message.getCreatetime());
        cardUserGameMapper.insert(message);
    }
}
