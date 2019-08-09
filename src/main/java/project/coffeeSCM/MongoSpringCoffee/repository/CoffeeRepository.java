package project.coffeeSCM.MongoSpringCoffee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;

public interface CoffeeRepository extends MongoRepository<Coffee, Integer>{
	public Coffee findByCoffeeId(int coffeeId);
}
