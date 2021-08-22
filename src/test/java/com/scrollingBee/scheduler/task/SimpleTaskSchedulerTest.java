package com.scrollingBee.scheduler.task;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class SimpleTaskSchedulerTest {

	@SpyBean
	SimpleTaskScheduler scheduler;
	
	@Test
	public void testFixedDelayTask() {
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
			verify(scheduler, atLeast(2)).fixedDelayTask();
		});
	}
	
	@Test
	public void testFixedRatetask() {
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
			verify(scheduler, atLeast(2)).fixedRatetask();
		});
	}
	
	@Test
	public void testCronScheduledTask() {
		await().atMost(Durations.ONE_MINUTE).untilAsserted(() -> {
			verify(scheduler, atLeast(1)).cronScheduledTask();
		});
	}
	
	@Test
	public void testFixedDelayWithInitialDelayTask() {
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() -> {
			verify(scheduler, atLeast(1)).fixedDelayWithInitialDelayTask();
		});
	}
}
