package com.edgewalk.calculator;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 属性注入bean
 */
@ConfigurationProperties("spring.calculator")
public class CalculatorServiceProperties {
	/**
	 * 是否开启
	 */
	private boolean enable = true;

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}
}