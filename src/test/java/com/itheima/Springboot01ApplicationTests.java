package com.itheima;


import com.itheima.pojo.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot01ApplicationTests {

	@Test
	public void findAllUser() {

		System.out.println(new User());
	}
}
