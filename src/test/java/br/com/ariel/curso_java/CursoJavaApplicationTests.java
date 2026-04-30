package br.com.ariel.curso_java;

import br.com.ariel.curso_java.integrationtests.testcontainers.AbstractIntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CursoJavaApplicationTests extends AbstractIntegrationTest {

	@Test
	void contextLoads() {
	}

}
