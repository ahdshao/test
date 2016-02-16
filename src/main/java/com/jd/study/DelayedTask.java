package com.jd.study;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedTask implements Delayed {

	public int compareTo(Delayed o) {
		return 0;
	}

	public long getDelay(TimeUnit unit) {
		return 0;
	}

}
