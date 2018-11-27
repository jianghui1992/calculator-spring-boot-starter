package com.github.edgewalk.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CalculatorServiceProperties.class) //// 开启指定类的配置
@ConditionalOnProperty(name = "spring.calculator.enable", havingValue = "true") // 指定的属性是否有指定的值
public class CalculatorAutoConfiguration {

	@Autowired
	private CalculatorServiceProperties properties;

	@Bean
	@ConditionalOnMissingBean  //当Spring Context中不存在该Bean时
	Calculator cal() {
		return new Calculator();
	}
}