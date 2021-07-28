package com.youlai.spring.circularreference.service.impl;

import com.youlai.spring.circularreference.service.IServiceB;
import org.springframework.stereotype.Service;

@Service
public class ServiceBImpl implements IServiceB {

	@Override
//	@Transactional
	public void m1()  {
		System.out.println("ServiceBImpl#m1");
	}

}
