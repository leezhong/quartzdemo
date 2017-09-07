package com.leezhong.demo2.job;

import com.leezhong.demo2.bean.AuthBean;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class FirstScheduledJob extends QuartzJobBean{

   private AuthBean authBean;

    public void setAuthBean(AuthBean authBean) {
        this.authBean = authBean;
    }

    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("----scheduled-First----");
        authBean.auth();
    }
}
