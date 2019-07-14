package com.zenmode.yan.entity;

import org.litepal.crud.LitePalSupport;
import org.litepal.exceptions.DataSupportException;

import java.io.Serializable;

/***
 * @Description:
 * @ClassName: DateEntity
 * @Author: Mr.Yan
 * @Date: 2019/7/14 2:57
 * */
public class DateEntity extends LitePalSupport implements Serializable {
    private int isZenTime;//是否是禅定时间(0 不是,1 是)
    private long startTime;//开始时间
    private long endTime;//结束时间
    private long atLastEndTime;//最后结束时间

    public int getIsZenTime() {
        return isZenTime;
    }

    public void setIsZenTime(int isZenTime) {
        this.isZenTime = isZenTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getAtLastEndTime() {
        return atLastEndTime;
    }

    public void setAtLastEndTime(long atLastEndTime) {
        this.atLastEndTime = atLastEndTime;
    }

    @Override
    public String toString() {
        return "DateEntity{" +
                "isZenTime=" + isZenTime +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", atLastEndTime=" + atLastEndTime +
                '}';
    }
}
