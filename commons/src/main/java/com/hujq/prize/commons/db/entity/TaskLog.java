package com.hujq.prize.commons.db.entity;

import java.io.Serializable;
import java.util.Date;

public class TaskLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.task_id
     *
     * @mbg.generated
     */
    private Integer taskId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.result
     *
     * @mbg.generated
     */
    private String result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.end_time
     *
     * @mbg.generated
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.cost_time
     *
     * @mbg.generated
     */
    private Integer costTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_log.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table task_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.id
     *
     * @return the value of task_log.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.id
     *
     * @param id the value for task_log.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.task_id
     *
     * @return the value of task_log.task_id
     *
     * @mbg.generated
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.task_id
     *
     * @param taskId the value for task_log.task_id
     *
     * @mbg.generated
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.result
     *
     * @return the value of task_log.result
     *
     * @mbg.generated
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.result
     *
     * @param result the value for task_log.result
     *
     * @mbg.generated
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.start_time
     *
     * @return the value of task_log.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.start_time
     *
     * @param startTime the value for task_log.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.end_time
     *
     * @return the value of task_log.end_time
     *
     * @mbg.generated
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.end_time
     *
     * @param endTime the value for task_log.end_time
     *
     * @mbg.generated
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.cost_time
     *
     * @return the value of task_log.cost_time
     *
     * @mbg.generated
     */
    public Integer getCostTime() {
        return costTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.cost_time
     *
     * @param costTime the value for task_log.cost_time
     *
     * @mbg.generated
     */
    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_log.remark
     *
     * @return the value of task_log.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_log.remark
     *
     * @param remark the value for task_log.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}