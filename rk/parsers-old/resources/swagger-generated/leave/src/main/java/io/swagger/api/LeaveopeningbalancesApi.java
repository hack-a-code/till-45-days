package io.swagger.api;

import io.swagger.model.LeaveOpeningBalanceReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveOpeningBalanceRes;
import io.swagger.model.RequestInfo;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

@Api(value = "leaveopeningbalances", description = "the leaveopeningbalances API")
public interface LeaveopeningbalancesApi {

    @ApiOperation(value = "Delete the leave opening balance for an employee for a year.", notes = "To delete a set of existing leave opening balance for an employee for any specified year and leave type one can use DELETE.", response = Void.class, tags={ "Leave Opening Balance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Leave opening balance deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Leave opening balance not found.", response = Void.class) })
    @RequestMapping(value = "/leaveopeningbalances/{employee}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> leaveopeningbalancesEmployeeDelete(
@ApiParam(value = "The unique id of the employee master.",required=true ) @PathVariable("employee") Long employee


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave opening balance with new set of values." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,@ApiParam(value = "Unique name for calendar year.") @RequestParam(value = "year", required = false) Integer year



,@ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



);


    @ApiOperation(value = "Update existing leave opening balances for an employee.", notes = "To update a set of leave the leave opening balances for a specific employee for any year and for any leave types.", response = LeaveOpeningBalanceRes.class, tags={ "Leave Opening Balance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Leave Opening balance updated.", response = LeaveOpeningBalanceRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveOpeningBalanceRes.class),
        @ApiResponse(code = 404, message = "Leave opening balance details not found.", response = LeaveOpeningBalanceRes.class) })
    @RequestMapping(value = "/leaveopeningbalances/{employee}",
        method = RequestMethod.PUT)
    ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesEmployeePut(
@ApiParam(value = "The unique id of the employee master.",required=true ) @PathVariable("employee") Long employee


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave opening balance with new set of values." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,@ApiParam(value = "Unique name of calendar year.") @RequestParam(value = "year", required = false) Integer year



,@ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) Long leaveType



);


    @ApiOperation(value = "Get the employee leave opening balances defined in the system.", notes = "Get the employee leave opening balances defined in the system for a year for each leave type for each employee. ", response = LeaveOpeningBalanceRes.class, tags={ "Leave Opening Balance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = LeaveOpeningBalanceRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveOpeningBalanceRes.class),
        @ApiResponse(code = 404, message = "Leave Opening balance not found.", response = LeaveOpeningBalanceRes.class) })
    @RequestMapping(value = "/leaveopeningbalances",
        method = RequestMethod.GET)
    ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesGet(

@ApiParam(value = "Commmon request info for getting leave opening balance." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,@ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) String employee



,@ApiParam(value = "Unique id for calendar year.") @RequestParam(value = "year", required = false) Integer year



,@ApiParam(value = "Result will be sorted by year and  leave type ascending by default if this parameter is not provided.", defaultValue = "[+year]") @RequestParam(value = "sort", required = false, defaultValue="[+year]") List<String> sort



,@ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



);


    @ApiOperation(value = "Create a new set of leave opening balances for an employee for a year.", notes = "To create a new set of leave opening balance leave type wise for an employee for any year one can use POST.", response = LeaveOpeningBalanceRes.class, tags={ "Leave Opening Balance", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Leave opening balance created sucessfully.", response = LeaveOpeningBalanceRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveOpeningBalanceRes.class) })
    @RequestMapping(value = "/leaveopeningbalances",
        method = RequestMethod.POST)
    ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesPost(

@ApiParam(value = "Details for the new set of leave opening balance data leave type and employee wise." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
