package com.maihaoche.starter.mq;

/**
 * Created by yipin on 2017/6/28.
 * RocketMQ的自定义异常
 */
public class MQException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MQException(String msg) {
        super(msg);
    }
}
