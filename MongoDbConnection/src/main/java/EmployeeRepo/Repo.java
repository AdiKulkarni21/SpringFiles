package EmployeeRepo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.Employee;

public interface Repo extends MongoRepository<Employee,Integer> {
	  @Query("{Id:?0}")
	    Employee findEmployeeById(Integer Employee_Id);
	    
	    @Query(value="{Employee_Name:'?0'}", fields="{'Employee_Id' : 1}")
	    List<Employee> findAll(Integer Employee_Id);
	    
	    public long count();
}
