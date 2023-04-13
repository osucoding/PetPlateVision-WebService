package com.github.osucoding.petplatevision;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class PetPlateVisionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void applicationContextTest() {
		PetPlateVisionApplication.main(new String[] {});
	}

	@Test
	void testPackageStructureAndAppName() {
		assertEquals("com.github.osucoding.petplatevision.PetPlateVisionApplication", PetPlateVisionApplication.class.getName());
		List<Method> petPlateVisionApplicationMethodList = List.of(PetPlateVisionApplication.class.getMethods());
		assertNotNull(petPlateVisionApplicationMethodList.stream().filter(m -> m.getName().equals("main")).findFirst().orElse(null));
	}

}
