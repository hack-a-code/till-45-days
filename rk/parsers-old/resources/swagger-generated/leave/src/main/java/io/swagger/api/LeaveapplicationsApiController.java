package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveApplicationRes;
import org.joda.time.LocalDate;
import io.swagger.model.LeaveApplicationSingleReq;
import io.swagger.model.LeaveApplicationReq;
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
public class LeaveapplicationsApiController implements LeaveapplicationsApi {

    public ResponseEntity<LeaveApplicationRes> leaveapplicationsApplicationNumberPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave opening application with new set of values." ,required=true ) @RequestBody LeaveApplicationSingleReq leaveApplication

,
        
@ApiParam(value = "Unique leave application number.",required=true ) @PathVariable("applicationNumber") String applicationNumber


,
        @ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,
        @ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



) {
        // do some magic!
        return new ResponseEntity<LeaveApplicationRes>(HttpStatus.OK);
    }

    public ResponseEntity<Void> leaveapplicationsDelete(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave application with new set of values." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,
        @ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) Long employee



,
        @ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,
        @ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,
        @ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveApplicationRes> leaveapplicationsGet(

@ApiParam(value = "Commmon request info for getting leave application." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Unique id of the leave application.") @RequestParam(value = "applicationNumber", required = false) String applicationNumber



,
        @ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) Long employee



,
        @ApiParam(value = "Date from which the leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,
        @ApiParam(value = "Date to which the leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



,
        @ApiParam(value = "Unique id for leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,
        @ApiParam(value = "Result will be sorted by leave type and  date ascending by default if this parameter is not provided.", defaultValue = "[+leaveType, +fromDate]") @RequestParam(value = "sort", required = false, defaultValue="[+leaveType, +fromDate]") List<String> sort



,
        @ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



) {
        // do some magic!
        return new ResponseEntity<LeaveApplicationRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveApplicationRes> leaveapplicationsPost(

@ApiParam(value = "Details for the new leave application data for a leave type and employee." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<LeaveApplicationRes>(HttpStatus.OK);
    }

    public ResponseEntity<LeaveApplicationRes> leaveapplicationsPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the leave opening application with new set of values." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,
        @ApiParam(value = "Unique id for leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,
        @ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,
        @ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



,
        @ApiParam(value = "The unique id of the employee whose leave needs to be updated") @RequestParam(value = "employee", required = false) Long employee



) {
        // do some magic!
        return new ResponseEntity<LeaveApplicationRes>(HttpStatus.OK);
    }

}
