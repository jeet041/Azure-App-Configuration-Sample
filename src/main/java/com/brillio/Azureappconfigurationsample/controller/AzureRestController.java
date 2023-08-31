package com.brillio.Azureappconfigurationsample.controller;

import com.brillio.Azureappconfigurationsample.configuration.AppProperties;
import com.brillio.Azureappconfigurationsample.configuration.ConfigProperties;
import com.brillio.Azureappconfigurationsample.model.Department;
import com.brillio.Azureappconfigurationsample.service.DataService;
import com.brillio.Azureappconfigurationsample.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RefreshScope
public class AzureRestController {
    Logger logger = (Logger) LoggerFactory.getLogger(AzureRestController.class);

//    @Autowired(required = false)
//    private AppConfigurationRefresh refresh;

    private final AppProperties properties;

    private final ConfigProperties configProperties;

    @Autowired
    private DataService dataService;

    public AzureRestController(AppProperties properties,ConfigProperties configProperties){
        this.properties=properties;
        this.configProperties=configProperties;
    }

    @Value("${configMsg:configmsg}")
    private String msg;


    @GetMapping("/getmsg")
    public String getMsg(){
        return msg;
    }

    @GetMapping("/getmsg2")
    public String getMsg2(){
        logger.info("Msg from config2:"+properties.getConfigMsg());
        return properties.getConfigMsg();
    }

    @GetMapping("/getmsg3")
    public String getMsg3(){
        logger.info("Msg from config3:"+configProperties.getConfigMsg());
        return configProperties.getConfigMsg();
    }
    @GetMapping("/getmsg4")
    public String getMsg4(){
        logger.info("Msg from config2:"+dataService.getMsg());
        return dataService.getMsg();
    }

    @Autowired
    private DepartmentService departmentService;

    // Save operation
    @PostMapping("/departments")
    public Department saveDepartment(
            @Valid @RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }

    // Read operation
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }

    // Update operation
    @PutMapping("/departments/{id}")
    public Department
    updateDepartment(@RequestBody Department department,
                     @PathVariable("id") Long departmentId)
    {
        return departmentService.updateDepartment(
                department, departmentId);
    }

    // Delete operation
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id")
                                               Long departmentId)
    {
        departmentService.deleteDepartmentById(
                departmentId);
        return "Deleted Successfully";
    }

}
