package com.company.SpringTutorial;

import com.company.SpringTutorial.model.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class SpringTutorialApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	public void TestShouldTestSomething() {
		Person marcus = new Person(UUID.randomUUID(), "marcus");
		Assert.assertEquals("marcus", marcus.getName());

	}

	@Test
	public void TestShouldBreakCI() {
		Person marcus = new Person(UUID.randomUUID(), "marcus");
		Assert.assertEquals("daniel", marcus.getName());
	}
}
