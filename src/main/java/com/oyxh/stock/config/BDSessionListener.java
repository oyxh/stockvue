package com.oyxh.stock.config;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

public class BDSessionListener implements SessionListener {

	private final AtomicInteger sessionCount = new AtomicInteger(0);

	@Override
	public void onStart(Session session) {
		System.out.println(session.getHost()+" start...");
		System.out.println(session.getAttributeKeys()+" start...");
		sessionCount.incrementAndGet();
	}

	@Override
	public void onStop(Session session) {
		sessionCount.decrementAndGet();
	}

	@Override
	public void onExpiration(Session session) {
		sessionCount.decrementAndGet();

	}

	public int getSessionCount() {
		return sessionCount.get();
	}

}
