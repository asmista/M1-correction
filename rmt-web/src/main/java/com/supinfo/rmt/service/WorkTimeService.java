package com.supinfo.rmt.service;

import com.supinfo.rmt.dao.WorkTimeDao;
import com.supinfo.rmt.entity.WorkTime;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class WorkTimeService {

    @EJB
    private WorkTimeDao workTimeDao;

    public void addWorkTime(WorkTime workTime) {
        workTimeDao.addWorkTime(workTime);
    }
}
