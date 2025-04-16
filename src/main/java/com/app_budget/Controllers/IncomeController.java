package com.app_budget.Controllers;


import com.app_budget.Entity.Income;
import com.app_budget.Repositories.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/income")
public class IncomeController {

    @Autowired
    private IncomeRepository incomeRepository;

 //   @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping(path="/post")
    public @ResponseBody String addNewTransaction(@RequestBody Income income){
        incomeRepository.save(income);
        return "Added!";
    }

 //   @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/get")
    public @ResponseBody Iterable<Income> getAllUsers() {
        return incomeRepository.findAll();
    }
}
