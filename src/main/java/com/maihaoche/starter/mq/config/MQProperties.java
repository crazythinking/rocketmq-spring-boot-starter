package com.maihaoche.starter.mq.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by yipin on 2017/6/28.
 * RocketMQ的配置参数
 */
@Data
@ConfigurationProperties(prefix = "spring.rocketmq")
public class MQProperties {
    /**
     * config name server address
     */
    private String nameServerAddress;
    /**
     * config producer group , default to DPG+RANDOM UUID like DPG-fads-3143-123d-1111
     */
    private String producerGroup;
    /**
     * config send message timeout
     */
    private Integer sendMsgTimeout = 3000;
    /**
     * switch of trace message consumer: send message consumer info to topic: rmq_sys_TRACE_DATA
     */
    private Boolean traceEnabled = Boolean.TRUE;

    /**
     * switch of send message with vip channel
     */
    private Boolean vipChannelEnabled = Boolean.TRUE;
    
    /**
     * 在声明同步模式发送失败之前，在内部执行的最大重试次数；
     * 这可能导致消息重复，这取决于应用程序开发人员来解决；
     * 与DefaultMQProducer中的属性保持相同默认值
     */
    private Integer retryTimesWhenSendFailed = 2;

}
