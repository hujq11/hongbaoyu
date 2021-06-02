package com.hujq.prize.commons.db.entity;

import java.io.Serializable;

public class CardGameRules implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game_rules.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game_rules.gameid
     *
     * @mbg.generated
     */
    private Integer gameid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game_rules.userlevel
     *
     * @mbg.generated
     */
    private Integer userlevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game_rules.enter_times
     *
     * @mbg.generated
     */
    private Integer enterTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game_rules.goal_times
     *
     * @mbg.generated
     */
    private Integer goalTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_game_rules
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game_rules.id
     *
     * @return the value of card_game_rules.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game_rules.id
     *
     * @param id the value for card_game_rules.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game_rules.gameid
     *
     * @return the value of card_game_rules.gameid
     *
     * @mbg.generated
     */
    public Integer getGameid() {
        return gameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game_rules.gameid
     *
     * @param gameid the value for card_game_rules.gameid
     *
     * @mbg.generated
     */
    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game_rules.userlevel
     *
     * @return the value of card_game_rules.userlevel
     *
     * @mbg.generated
     */
    public Integer getUserlevel() {
        return userlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game_rules.userlevel
     *
     * @param userlevel the value for card_game_rules.userlevel
     *
     * @mbg.generated
     */
    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game_rules.enter_times
     *
     * @return the value of card_game_rules.enter_times
     *
     * @mbg.generated
     */
    public Integer getEnterTimes() {
        return enterTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game_rules.enter_times
     *
     * @param enterTimes the value for card_game_rules.enter_times
     *
     * @mbg.generated
     */
    public void setEnterTimes(Integer enterTimes) {
        this.enterTimes = enterTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game_rules.goal_times
     *
     * @return the value of card_game_rules.goal_times
     *
     * @mbg.generated
     */
    public Integer getGoalTimes() {
        return goalTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game_rules.goal_times
     *
     * @param goalTimes the value for card_game_rules.goal_times
     *
     * @mbg.generated
     */
    public void setGoalTimes(Integer goalTimes) {
        this.goalTimes = goalTimes;
    }
}