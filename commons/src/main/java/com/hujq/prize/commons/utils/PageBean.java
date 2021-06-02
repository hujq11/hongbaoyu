package com.hujq.prize.commons.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.domain.Page;

import java.util.List;

@ApiModel("分页信息")
public class PageBean<T> {

    @ApiModelProperty(value = "当前页，1开始")
    private Integer currentPage = 1;

    @ApiModelProperty(value = "每条页数，默认10")
    private Integer pageSize = 10;

    @ApiModelProperty(value = "总条数")
    private Long totalNum;

    @ApiModelProperty(value = "总页数")
    private Integer totalPage;

    @ApiModelProperty(value = "是否有下一页")
    private Integer isMore;

    @ApiModelProperty(value = "开始索引")
    private Integer startIndex;

    @ApiModelProperty(value = "本页数据")
    private List<T> items;

    public PageBean(){

    }

    public PageBean(Integer currentPage, Integer pageSize, Long totalNum, List<T> items) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalNum = totalNum;
        this.totalPage = Math.toIntExact((totalNum + pageSize - 1) / pageSize);
        this.isMore = this.currentPage >= this.pageSize ? 0 : 1;
        this.startIndex = (this.currentPage -1)*this.pageSize;
        this.items = items;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getIsMore() {
        return isMore;
    }

    public void setIsMore(Integer isMore) {
        this.isMore = isMore;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
