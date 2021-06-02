package com.hujq.prize.commons.db.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

@ApiModel("活动")
public class CardGame implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.id
     *
     * @mbg.generated
     */
    @ApiModelProperty("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.title
     *
     * @mbg.generated
     */
    @ApiModelProperty("活动标题")
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.pic
     *
     * @mbg.generated
     */
    @ApiModelProperty("宣传图")
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.info
     *
     * @mbg.generated
     */
    @ApiModelProperty("活动介绍")
    private String info;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.starttime
     *
     * @mbg.generated
     */
    @ApiModelProperty("开始时间")
//    @DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.endtime
     *
     * @mbg.generated
     */
    @ApiModelProperty("结束时间")
//    @DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.type
     *
     * @mbg.generated
     */
    @ApiModelProperty("类型（1=概率类，2=随机类）")
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column card_game.status
     *
     * @mbg.generated
     */
    @ApiModelProperty("状态（0=新建，1=已加载）")
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table card_game
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.id
     *
     * @return the value of card_game.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.id
     *
     * @param id the value for card_game.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.title
     *
     * @return the value of card_game.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.title
     *
     * @param title the value for card_game.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.pic
     *
     * @return the value of card_game.pic
     *
     * @mbg.generated
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.pic
     *
     * @param pic the value for card_game.pic
     *
     * @mbg.generated
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.info
     *
     * @return the value of card_game.info
     *
     * @mbg.generated
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.info
     *
     * @param info the value for card_game.info
     *
     * @mbg.generated
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.starttime
     *
     * @return the value of card_game.starttime
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.starttime
     *
     * @param starttime the value for card_game.starttime
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.endtime
     *
     * @return the value of card_game.endtime
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.endtime
     *
     * @param endtime the value for card_game.endtime
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.type
     *
     * @return the value of card_game.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.type
     *
     * @param type the value for card_game.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column card_game.status
     *
     * @return the value of card_game.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column card_game.status
     *
     * @param status the value for card_game.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}