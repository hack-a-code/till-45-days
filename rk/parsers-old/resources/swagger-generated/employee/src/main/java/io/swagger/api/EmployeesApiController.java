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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-01T18:46:10.220+05:30")

@Controller
public class EmployeesApiController implements EmployeesApi {

    public ResponseEntity<AssignmentRes> employeesCodeAssignmentsGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,
        

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Unique id of an assignment.") @RequestParam(value = "assignmentId", required = false) Long assignmentId



,
        @ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,
        @ApiParam(value = "Result will be sorted by fromDate descending and primary descending by default if this parameter is not provided.", defaultValue = "[-fromDate, -primary]") @RequestParam(value = "sort", required = false, defaultValue="[-fromDate, -primary]") List<String> sort



,
        @ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.") @RequestParam(value = "asOnDate", required = false) LocalDate asOnDate



,
        @ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "isPrimary", required = false) Boolean isPrimary



) {
        // do some magic!
        return new ResponseEntity<AssignmentRes>(HttpStatus.OK);
    }

    public ResponseEntity<Void> employeesCodeDelete(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the employee to be deleted" ,required=true ) @RequestBody RequestInfo employee

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<EmployeeRes> employeesCodeGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,
        

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<EmployeeRes>(HttpStatus.OK);
    }

    public ResponseEntity<PositionRes> employeesCodePositionsGet(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("code") String code


,
        

@ApiParam(value = "Commmon request info for getting employee position." ,required=true ) @RequestBody EmployeeReq requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.", required = true) @RequestParam(value = "asOnDate", required = true) LocalDate asOnDate



,
        @ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,
        @ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "isPrimary", required = false) Boolean isPrimary



,
        @ApiParam(value = "Unique Id of the department.") @RequestParam(value = "departmentId", required = false) Long departmentId



,
        @ApiParam(value = "Unique Id of the designation.") @RequestParam(value = "designationId", required = false) Long designationId



,
        @ApiParam(value = "Unique Id of Position.") @RequestParam(value = "id", required = false) Long id



,
        @ApiParam(value = "Result will be sorted by fromDate descending and primary descending by default if this parameter is not provided.", defaultValue = "[-fromDate, -primary]") @RequestParam(value = "sort", required = false, defaultValue="[-fromDate, -primary]") List<String> sort



) {
        // do some magic!
        return new ResponseEntity<PositionRes>(HttpStatus.OK);
    }

    public ResponseEntity<EmployeeInfoRes> employeesGet(

@ApiParam(value = "Commmon request info for getting employee." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "The employee's code.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "Unique Department id for the employee assignment.") @RequestParam(value = "assignmentDepartmentId", required = false) Long assignmentDepartmentId



,
        @ApiParam(value = "Unique Designation Id for the employee assignment.") @RequestParam(value = "assignmentDesignationId", required = false) Long assignmentDesignationId



,
        @ApiParam(value = "The date as on which employee assignment has to be checked against. Assignment will be for a date range and hence `as_on_date` should fall within the assignment from_date and to_date.") @RequestParam(value = "asOnDate", required = false) LocalDate asOnDate



,
        @ApiParam(value = "True will be set in cases where only Primary assignments are needed and False will be set when all temporary types of assignments are needed.Do not set any value when both type of assignments are needed.") @RequestParam(value = "assignmentIsPrimary", required = false) Boolean assignmentIsPrimary



,
        @ApiParam(value = "Unique Id of employee") @RequestParam(value = "id", required = false) Long id



,
        @ApiParam(value = "Number of records returned.", defaultValue = "20") @RequestParam(value = "pagesize", required = false, defaultValue="20") Integer pagesize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pagenumber", required = false, defaultValue="1") Integer pagenumber



,
        @ApiParam(value = "Result will be sorted by name ascending by default if this parameter is not provided.", defaultValue = "[+name]") @RequestParam(value = "sort", required = false, defaultValue="[+name]") List<String> sort



) {
        // do some magic!
        return new ResponseEntity<EmployeeInfoRes>(HttpStatus.OK);
    }

    public ResponseEntity<EmployeeRes> employeesPost(

@ApiParam(value = "Details for the new employee." ,required=true ) @RequestBody EmployeeReq employee

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<EmployeeRes>(HttpStatus.OK);
    }

    public ResponseEntity<EmployeeRes> employeesPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the employee with new of values." ,required=true ) @RequestBody EmployeeReq employee

) {
        // do some magic!
        return new ResponseEntity<EmployeeRes>(HttpStatus.OK);
    }

}
