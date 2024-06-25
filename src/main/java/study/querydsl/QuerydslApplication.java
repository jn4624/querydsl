package study.querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuerydslApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuerydslApplication.class, args);
	}

	/**
	 * Bean 으로 등록해서 사용 가능
	 */
//	@Bean
//	JPAQueryFactory jpaQueryFactory(EntityManager entityManager) {
//		return new JPAQueryFactory(entityManager);
//	}

}
