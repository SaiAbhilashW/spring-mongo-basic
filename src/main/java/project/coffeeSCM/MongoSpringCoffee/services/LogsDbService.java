package project.coffeeSCM.MongoSpringCoffee.services;

import org.springframework.stereotype.Service;

import project.coffeeSCM.MongoSpringCoffee.model.Coffee;
import project.coffeeSCM.MongoSpringCoffee.repository.LogsRepository;

@Service
public class LogsDbService {
	private LogsRepository logsRepository;
	
	public Coffee getFavoriteCoffee(String empId) {
		return null;//
	}
	
	public Coffee getPopularCoffee() {
		return null;//	
	}
}
