package com.aut.height;

import com.aut.height.mapper.UserMapper;
import com.aut.height.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired(required = true)
	UserMapper userMapper;

	@Test
	void contextLoads() {

		User user = userMapper.selectById("1l");
		System.out.println(user);
	}

}
