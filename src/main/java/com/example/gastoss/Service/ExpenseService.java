package com.example.gastoss.Service;

import com.example.gastoss.Model.Expense;
import com.example.gastoss.Repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    public Expense findById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteById(Long id) {
        expenseRepository.deleteById(id);
    }
}