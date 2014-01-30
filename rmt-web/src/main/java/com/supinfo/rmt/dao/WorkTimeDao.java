package com.supinfo.rmt.dao;

import com.supinfo.rmt.entity.WorkTime;

import javax.ejb.Local;

@Local
public interface WorkTimeDao {

    void addWorkTime(WorkTime workTime);
}
