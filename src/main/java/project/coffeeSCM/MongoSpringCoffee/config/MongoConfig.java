package project.coffeeSCM.MongoSpringCoffee.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ConfigurationProperties
@EnableMongoRepositories(basePackageClasses = project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository.class, project.coffeeSCM.MongoSpringCoffee.repository.EmployeeRepository.class,project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository.class)
public class MongoConfig {
	
}
