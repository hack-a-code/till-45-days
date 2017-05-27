package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import org.joda.time.LocalDate;
import io.swagger.model.AssignmentRes;
import io.swagger.model.EmployeeRes;
import io.swagger.model.EmployeeReq;
import io.swagger.model.PositionRes;
import io.swagger.model.EmployeeInfoRes;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-01T18:46:10.220+05:30")

@Api(value = "employees", description = "the employees API")
public interface EmployeesApi {

    @ApiOperation(value = "Get the employee assignment data by passing employee code.", notes = "Gets Employee assignment information for the employee. There can be multiple assignments for an employee for over a period of time. Also there can be multiple assignments for a given date. ", response = AssignmentRes.class, tags={ "Assignment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = AssignmentRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = AssignmentRes.class),
        @ApiResponse(code = 404, message = "Assignment not found.", response = AssignmentRes.class) })
    @RequestMapping(value = "/employees/{code}/assignments",
        method = RequestMethod.GET)
    ResponseEntity<AssignmentRes> employeesCodeAssignmentsGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Unique id of an assignment.") @RequestParam(value = "assignmentId", required = false) Long assignmentId



,@ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,@ApiParam(value = "Result will be sorted by fromDate descending and primary descending by default if this parameter is not provided.", defaultValue = "[-fromDate, -primary]") @RequestParam(value = "sort", required = false, defaultValue="[-fromDate, -primary]") List<String> sort



,@ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.") @RequestParam(value = "asOnDate", required = false) LocalDate asOnDate



,@ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "isPrimary", required = false) Boolean isPrimary



);


    @ApiOperation(value = "Delete the employee data for the employee code passed.", notes = "Employee record will be removed from the database on DELETE.", response = Void.class, tags={ "Employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Employee deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Employee does not exist.", response = Void.class) })
    @RequestMapping(value = "/employees/{code}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> employeesCodeDelete(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the employee to be deleted" ,required=true ) @RequestBody RequestInfo employee

);


    @ApiOperation(value = "Get a particular employee information by passing employee code.", notes = "Gets `Employee` objects for the employee code passed ", response = EmployeeRes.class, tags={ "Employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = EmployeeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeRes.class),
        @ApiResponse(code = 404, message = "Employee does not exist.", response = EmployeeRes.class) })
    @RequestMapping(value = "/employees/{code}",
        method = RequestMethod.GET)
    ResponseEntity<EmployeeRes> employeesCodeGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);


    @ApiOperation(value = "Get the employee Position data by passing employee code and other parameters.", notes = "Gets Employee position information for the given date and other optional parameters. Employee may have multiple positions for any given date. ", response = PositionRes.class, tags={ "Assignment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = PositionRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = PositionRes.class),
        @ApiResponse(code = 404, message = "Position not found.", response = PositionRes.class) })
    @RequestMapping(value = "/employees/{code}/positions",
        method = RequestMethod.GET)
    ResponseEntity<PositionRes> employeesCodePositionsGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,

@ApiParam(value = "Commmon request info for getting employee position." ,required=true ) @RequestBody EmployeeReq requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.", required = true) @RequestParam(value = "asOnDate", required = true) LocalDate asOnDate



,@ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,@ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "isPrimary", required = false) Boolean isPrimary



,@ApiParam(value = "Unique Id of the department.") @RequestParam(value = "departmentId", required = false) Long departmentId



,@ApiParam(value = "Unique Id of the designation.") @RequestParam(value = "designationId", required = false) Long designationId



,@ApiParam(value = "Unique Id of Position.") @RequestParam(value = "id", required = false) Long id



,@ApiParam(value = "Result will be sorted by fromDate descending and primary descending by default if this parameter is not provided.", defaultValue = "[-fromDate, -primary]") @RequestParam(value = "sort", required = false, defaultValue="[-fromDate, -primary]") List<String> sort



);


    @ApiOperation(value = "Get the list of employees defined in the system.", notes = "Get the employee list based on the input parameters. Response will give the minimum set of information related to the employee. ", response = EmployeeInfoRes.class, tags={ "Employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = EmployeeInfoRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeInfoRes.class),
        @ApiResponse(code = 404, message = "Employee does not exist.", response = EmployeeInfoRes.class) })
    @RequestMapping(value = "/employees",
        method = RequestMethod.GET)
    ResponseEntity<EmployeeInfoRes> employeesGet(

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "The employee's code.") @RequestParam(value = "code", required = false) String code



,@ApiParam(value = "Unique Department id for the employee assignment.") @RequestParam(value = "assignmentDepartmentId", required = false) Long assignmentDepartmentId



,@ApiParam(value = "Unique Designation Id for the employee assignment.") @RequestParam(value = "assignmentDesignationId", required = false) Long assignmentDesignationId



,@ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.") @RequestParam(value = "asOnDate", required = false) LocalDate asOnDate



,@ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "assignmentIsPrimary", required = false) Boolean assignmentIsPrimary



,@ApiParam(value = "Unique Id of employee") @RequestParam(value = "id", required = false) Long id



,@ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,@ApiParam(value = "Result will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



);


    @ApiOperation(value = "Create a new employee in the system along with all the related informations like - assignment, jurisdiction, service, education and probation", notes = "To create a new employee we can use POST and set all the required and non-mandatory parameters. When an employee is created, an user is also created along with it. Type value in object will be \"EMPLOYEE\".", response = EmployeeRes.class, tags={ "Employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Employee created sucessfully.", response = EmployeeRes.class),
        @ApiResponse(code = 400, message = "Invalid Input.", response = EmployeeRes.class) })
    @RequestMapping(value = "/employees",
        method = RequestMethod.POST)
    ResponseEntity<EmployeeRes> employeesPost(

@ApiParam(value = "Details for the new employee." ,required=true ) @RequestBody EmployeeReq employee

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);


    @ApiOperation(value = "Update Employee data for a particular employee", notes = "To update an existing employee's employee details and all other details like assignment, jurisdiction, qualification service details and porbation for which the code is passed.", response = EmployeeRes.class, tags={ "Employee", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Employee updated.", response = EmployeeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = EmployeeRes.class),
        @ApiResponse(code = 404, message = "Employee does not exist.", response = EmployeeRes.class) })
    @RequestMapping(value = "/employees",
        method = RequestMethod.PUT)
    ResponseEntity<EmployeeRes> employeesPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the employee with new of values." ,required=true ) @RequestBody EmployeeReq employee

);

}
