package com.hujq.prize.commons.constants;

public interface RabbitKeys {
    //中将队列名称
    String QUEUE_HIT = "prize_queue_hit";

    //参与活动名称
    String QUEUE_PLAY = "prize_queue_play";

    //中将路由名称
    String EXCHANGE_DIRECT = "prize_exchange_direct";
}
