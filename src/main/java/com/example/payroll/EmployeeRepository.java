package com.example.payroll;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Galih_P on 8/9/2016.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
