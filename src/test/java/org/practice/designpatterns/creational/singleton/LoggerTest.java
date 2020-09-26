package org.practice.designpatterns.creational.singleton;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
class LoggerTest {

	@Test
	void shouldHaveSameInstance() {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		assertTrue(log1 == log2);
	}

	private class WorkerThread extends Thread {
		volatile Logger[] instances;
		int index;

		public WorkerThread(Logger[] instances, int index) {
			this.instances = instances;
			this.index = index;
		}

		@Override
		public void run() {
			instances[index] = Logger.getInstance();
		}
	}

	@Test
	@Order(value = Integer.MIN_VALUE) // highest priority
	void shouldBeThreadSafe() {

		int coreCount = getCpuCoreCount() - 1;
		Logger[] instances = new Logger[coreCount];
		WorkerThread[] threads = new WorkerThread[coreCount];

		for (int i = 0; i < coreCount; i++) {
			threads[i] = new WorkerThread(instances, i);
		}

		for (Thread thread : threads) {
			thread.start();
		}

		waitUntilFinished(instances); // main thread waits until all worker thread finishes the job

		for (int i = 0; i < coreCount - 1; i++) {
			assertTrue(instances[i] == instances[i + 1]);
		}
	}

	private void waitUntilFinished(Logger[] instances) {
		while (true) {
			boolean allDone = true;
			for (Logger logger : instances) {
				if (logger == null) {
					allDone = false;
					break;
				}
			}
			if (allDone)
				return;
		}
	}

	private int getCpuCoreCount() {
		return Runtime	.getRuntime()
						.availableProcessors();
	}

}
