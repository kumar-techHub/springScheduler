package com.scrollingBee.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SimpleTaskScheduler {

	@Scheduled(fixedDelay = 5000)
	public void fixedDelayTask() {
		MyTask task = new MyTask("fixedDelayTask");
		task.reportCurrentTime();
	}
	
	@Scheduled(fixedRate = 5000)
	public void fixedRatetask() {
		MyTask task = new MyTask("fixedRatetask");
		task.reportCurrentTime();
	}
	
	@Scheduled(cron = "30 * * * * *") // Will run at 30 second of every minute. 
	public void cronScheduledTask() {
		MyTask task = new MyTask("cronScheduledTask");
		task.reportCurrentTime();
	}
	
	@Scheduled(fixedDelay = 5000, initialDelay = 2000)
	public void fixedDelayWithInitialDelayTask() {
		MyTask task = new MyTask("fixedDelayWithInitialDelayTask");
		task.reportCurrentTime();
	}
}
