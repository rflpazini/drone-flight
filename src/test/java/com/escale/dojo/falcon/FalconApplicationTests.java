package com.escale.dojo.falcon;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FalconApplicationTests {

	@Test
	public void shouldSumTwoNumbers() {
		Assert.assertEquals(3, FalconApplication.Solution(1,3));
	}
}
