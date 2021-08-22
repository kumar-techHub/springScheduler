package com.scrollingBee.scheduler.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTask {
	private static final Logger log = LoggerFactory.getLogger(MyTask.class);

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	private String message;

	public MyTask(String message) {
		this.message = message;
	}

	public void reportCurrentTime() {
		log.info("New Task from {} at {}",this.message, dateFormat.format(new Date()));
	}
}
