package com.leezhong.demo2.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SecondScheduledJob extends QuartzJobBean{


    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("-----scheduled-second-------");
    }
}
