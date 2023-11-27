package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Employee;
import EmployeeRepo.Repo;

@Controller
public class EmployeeController {

    @Autowired
    Repo repo;

    @RequestMapping("/")
    public String index() {
        return "index.jsp"; // Assuming "index.jsp" is the view name
    }

    @RequestMapping("/addEmployee")
    public ModelAndView addEmployee(Employee e) {
        repo.save(e);
        return new ModelAndView("redirect:/go"); // Redirect to the "go" page after adding an employee
    }
}
