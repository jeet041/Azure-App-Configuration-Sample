package com.brillio.Azureappconfigurationsample.repos;

import com.brillio.Azureappconfigurationsample.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

// Interface extending CrudRepository
public interface DepartmentRepository
        extends CrudRepository<Department, Long> {
}