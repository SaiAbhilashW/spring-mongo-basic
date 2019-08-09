package project.coffeeSCM.MongoSpringCoffee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.coffeeSCM.MongoSpringCoffee.model.Logs;

public interface LogsRepository extends MongoRepository<Logs, Integer>{
	//query -> get popular coffee
	
	//query -> get favorite coffee
	
}
