package com.youlai.spring.ch01;

import com.youlai.spring.ch01.config.ContextConfig;
import com.youlai.spring.ch01.service.IUserService;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ContextApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ContextConfig.class
		);
		IUserService bean = context.getBean(IUserService.class);
		System.out.println(bean);
		//手动发布一个事件
		context.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});

		//容器关闭也发布事件
		context.close();
	}
}
