package io.swagger.api;

import io.swagger.model.LeaveOpeningBalanceReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveOpeningBalanceRes;
import io.swagger.model.RequestInfo;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:21:39.340+05:30")

@Controller
public class LeaveopeningbalancesApiController implements LeaveopeningbalancesApi {

    public ResponseEntity<Void> leaveopeningbalancesEmployeeDelete(
@ApiParam(value = "The unique id of the employee master.",required=true ) @PathVariable("employee") Long employee


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave opening balance with new set of values." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,
        @ApiParam(value = "Unique name for calendar year.") @RequestParam(value = "year", required = false) Integer year



,
        @ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesEmployeePut(
@ApiParam(value = "The unique id of the employee master.",required=true ) @PathVariable("employee") Long employee


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave opening balance with new set of values." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,
        @ApiParam(value = "Unique name of calendar year.") @RequestParam(value = "year", required = false) Integer year



,
        @ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) Long leaveType



) {
        // do some magic!
        return new ResponseEntity<LeaveOpeningBalanceRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesGet(

@ApiParam(value = "Commmon request info for getting leave opening balance." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,
        @ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) String employee



,
        @ApiParam(value = "Unique id for calendar year.") @RequestParam(value = "year", required = false) Integer year



,
        @ApiParam(value = "Result will be sorted by year and  leave type ascending by default if this parameter is not provided.", defaultValue = "[+year]") @RequestParam(value = "sort", required = false, defaultValue="[+year]") List<String> sort



,
        @ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



) {
        // do some magic!
        return new ResponseEntity<LeaveOpeningBalanceRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveOpeningBalanceRes> leaveopeningbalancesPost(

@ApiParam(value = "Details for the new set of leave opening balance data leave type and employee wise." ,required=true ) @RequestBody LeaveOpeningBalanceReq leaveOpeningBalance

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<LeaveOpeningBalanceRes>(HttpStatus.OK);
    }

}
