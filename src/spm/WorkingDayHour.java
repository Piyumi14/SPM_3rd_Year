/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spm;

import java.sql.Time;

/**
 *
 * @author ASUS
 */
public class WorkingDayHour {
    
    private int wrkid;
    private String noWrkDaysPWeek;
    private String wrkDays;
    private String wrkTimePDay;
    private String oneHourSlot;
    private String halfHourSlot;
    private String batch;

    /**
     * @return the wrkid
     */
    public int getWrkid() {
        return wrkid;
    }

    /**
     * @param wrkid the wrkid to set
     */
    public void setWrkid(int wrkid) {
        this.wrkid = wrkid;
    }

    /**
     * @return the noWrkDaysPWeek
     */
    public String getNoWrkDaysPWeek() {
        return noWrkDaysPWeek;
    }

    /**
     * @param noWrkDaysPWeek the noWrkDaysPWeek to set
     */
    public void setNoWrkDaysPWeek(String noWrkDaysPWeek) {
        this.noWrkDaysPWeek = noWrkDaysPWeek;
    }

    /**
     * @return the wrkDays
     */
    public String getWrkDays() {
        return wrkDays;
    }

    /**
     * @param wrkDays the wrkDays to set
     */
    public void setWrkDays(String wrkDays) {
        this.wrkDays = wrkDays;
    }

    /**
     * @return the WrkTimePDay
     */
    public String getWrkTimePDay() {
        return wrkTimePDay;
    }

    /**
     * @param wrkTimePDay the wrkTimePDay to set
     */
    public void setWrkTimePDay(String wrkTimePDay) {
        this.wrkTimePDay = wrkTimePDay;
    }

    /**
     * @return the oneHourSlot
     */
    public String getOneHourSlot() {
        return oneHourSlot;
    }

    /**
     * @param oneHourSlot the oneHourSlot to set
     */
    public void setOneHourSlot(String oneHourSlot) {
        this.oneHourSlot = oneHourSlot;
    }

    /**
     * @return the halfHourSlot
     */
    public String getHalfHourSlot() {
        return halfHourSlot;
    }

    /**
     * @param halfHourSlot the halfHourSlot to set
     */
    public void setHalfHourSlot(String halfHourSlot) {
        this.halfHourSlot = halfHourSlot;
    }

    /**
     * @return the batch
     */
    public String getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }
    
}
