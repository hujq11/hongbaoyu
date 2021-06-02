package com.hujq.prize.commons.constants;

public interface RedisKeys {

    //活动信息
    String INFO = "game_info_";

    //令牌前缀
    String TOKEN = "game_token_";

    //令牌桶key
    String TOKENS = "game_tokens_";

    //最大中将数
    String MAXGOAL = "game_maxgoal_";

    //最大抽奖数
    String MAXENTER = "game_maxgoal_";

    //redis session
    String SESSIONID="user_sessionid_";
    //用户中将数
    String USERHIT="user_hit_";
    //用户登录错误次数
    String USERLOGINTIMES="user_login_times_";

    //用户是否参数该活动
    String USERGAME = "user_game_";
}
