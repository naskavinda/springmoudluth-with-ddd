package com.example.springmodulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class SpringmodulithApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	ApplicationModules modules = ApplicationModules.of(SpringmodulithApplication.class);
	@Test
	void shouldBeCompliant() {
		modules.forEach(System.out::println);
		modules.verify();
	}

	@Test
	void writeDocumentationSnippets() {
		new Documenter(modules)
				.writeModulesAsPlantUml()
				.writeIndividualModulesAsPlantUml();
	}

}
