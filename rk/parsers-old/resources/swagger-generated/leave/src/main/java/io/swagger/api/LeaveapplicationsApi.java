package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.LeaveApplicationRes;
import org.joda.time.LocalDate;
import io.swagger.model.LeaveApplicationSingleReq;
import io.swagger.model.LeaveApplicationReq;
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

@Api(value = "leaveapplications", description = "the leaveapplications API")
public interface LeaveapplicationsApi {

    @ApiOperation(value = "Update existing leave application of an employee.", notes = "To update a particular leave application using the application number.", response = LeaveApplicationRes.class, tags={ "Leave Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Leave application updated.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 404, message = "Leave application details not found.", response = LeaveApplicationRes.class) })
    @RequestMapping(value = "/leaveapplications/{applicationNumber}",
        method = RequestMethod.PUT)
    ResponseEntity<LeaveApplicationRes> leaveapplicationsApplicationNumberPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave opening application with new set of values." ,required=true ) @RequestBody LeaveApplicationSingleReq leaveApplication

,
@ApiParam(value = "Unique leave application number.",required=true ) @PathVariable("applicationNumber") String applicationNumber


,@ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,@ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



);


    @ApiOperation(value = "Delete the leave application(s) for an employee for a date or list of dates.", notes = "To delete a set of existing leave opening balance for an employee for any specified date, we can use DELETE. System will not physically remove the data, instead the status will be marked as \"Cancelled\".", response = Void.class, tags={ "Leave Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Leave application deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Leave application not found.", response = Void.class) })
    @RequestMapping(value = "/leaveapplications",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> leaveapplicationsDelete(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave application with new set of values." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,@ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) Long employee



,@ApiParam(value = "Unique id of the leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,@ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,@ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



);


    @ApiOperation(value = "Get the employee leave applications defined in the system.", notes = "Get the employee leave applications defined in the system for a leave type for any date or date range. ", response = LeaveApplicationRes.class, tags={ "Leave Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = LeaveApplicationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 404, message = "Leave Application not found.", response = LeaveApplicationRes.class) })
    @RequestMapping(value = "/leaveapplications",
        method = RequestMethod.GET)
    ResponseEntity<LeaveApplicationRes> leaveapplicationsGet(

@ApiParam(value = "Commmon request info for getting leave application." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Unique id of the leave application.") @RequestParam(value = "applicationNumber", required = false) String applicationNumber



,@ApiParam(value = "Unique id for employee.") @RequestParam(value = "employee", required = false) Long employee



,@ApiParam(value = "Date from which the leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,@ApiParam(value = "Date to which the leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



,@ApiParam(value = "Unique id for leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,@ApiParam(value = "Result will be sorted by leave type and  date ascending by default if this parameter is not provided.", defaultValue = "[+leaveType, +fromDate]") @RequestParam(value = "sort", required = false, defaultValue="[+leaveType, +fromDate]") List<String> sort



,@ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,@ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



);


    @ApiOperation(value = "Create a new leave application for an employee for a date.", notes = "To create a new leave application for a leave type for an employee for any date one can use POST.", response = LeaveApplicationRes.class, tags={ "Leave Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Leave application created sucessfully.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveApplicationRes.class) })
    @RequestMapping(value = "/leaveapplications",
        method = RequestMethod.POST)
    ResponseEntity<LeaveApplicationRes> leaveapplicationsPost(

@ApiParam(value = "Details for the new leave application data for a leave type and employee." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);


    @ApiOperation(value = "Update existing leave application of an employee.", notes = "To update a set of leave application for a specific employee for any date and for any leave types.", response = LeaveApplicationRes.class, tags={ "Leave Application", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Leave application updated.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LeaveApplicationRes.class),
        @ApiResponse(code = 404, message = "Leave application details not found.", response = LeaveApplicationRes.class) })
    @RequestMapping(value = "/leaveapplications",
        method = RequestMethod.PUT)
    ResponseEntity<LeaveApplicationRes> leaveapplicationsPut(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the leave opening application with new set of values." ,required=true ) @RequestBody LeaveApplicationReq leaveApplication

,@ApiParam(value = "Unique id for leave type.") @RequestParam(value = "leaveType", required = false) String leaveType



,@ApiParam(value = "The date from which leave is applied.") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,@ApiParam(value = "The date till which leave is applied.") @RequestParam(value = "toDate", required = false) LocalDate toDate



,@ApiParam(value = "The unique id of the employee whose leave needs to be updated") @RequestParam(value = "employee", required = false) Long employee



);

}
