package project.coffeeSCM.MongoSpringCoffee.services;

import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.repository.CoffeeRepository;

@Service
public class CoffeeDbService {
	private CoffeeRepository coffeeRepository;
	
	public Coffee getCoffeeById(int coffeeId) {
		return this.coffeeRepository.findByCoffeeId(coffeeId);
	}
}
