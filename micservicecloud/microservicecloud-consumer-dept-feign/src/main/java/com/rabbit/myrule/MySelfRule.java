package com.rabbit.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
@Configuration
public class MySelfRule {

	@Bean
	public IRule myIRule() {
//		return new RandomRule();//Ribbon默认是轮询，我自定义为随机
		return new RandomRule_LF();//使用我们自己定义的IRule
	}
}
