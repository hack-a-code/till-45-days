package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.HolidayRes;
import org.joda.time.LocalDate;
import io.swagger.model.HolidayReq;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

@Api(value = "holidays", description = "the holidays API")
public interface HolidaysApi {

    @ApiOperation(value = "Delete the complete list of holidays defined for a calendar year.", notes = "One can delete the complete set of holidays defined for a calendar year.", response = Void.class, tags={ "Holiday", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Holidays deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Holiday not defined.", response = Void.class) })
    @RequestMapping(value = "/holidays",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> holidaysDelete(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the holiday to be deleted." ,required=true ) @RequestBody RequestInfo holiday

,@ApiParam(value = "Unique name of the calendar year.", required = true) @RequestParam(value = "calendarYear", required = true) Integer calendarYear



);


    @ApiOperation(value = "Get the list of holidays defined in the system for a particular year or across years.", notes = "Get the holidays defined for the year and based on the parameter values.", response = HolidayRes.class, tags={ "Holiday", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = HolidayRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = HolidayRes.class),
        @ApiResponse(code = 404, message = "Holidays not defined.", response = HolidayRes.class) })
    @RequestMapping(value = "/holidays",
        method = RequestMethod.GET)
    ResponseEntity<HolidayRes> holidaysGet(

@ApiParam(value = "Commmon request info for getting holidays." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Holiday results will be sorted by calendar year and applicable on descending by default if this parameter is not provided.", defaultValue = "[-calendarYear, -applicableOn]") @RequestParam(value = "sort", required = false, defaultValue="[-calendarYear, -applicableOn]") List<String> sort



,@ApiParam(value = "Name of the calendar year.") @RequestParam(value = "year", required = false) Integer year



,@ApiParam(value = "Date on which a particular holiday is defined.") @RequestParam(value = "applicableOn", required = false) LocalDate applicableOn



,@ApiParam(value = "Name of the holiday.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Date from which holidays needs to be listed") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,@ApiParam(value = "Date till which holidays needs to be listed.") @RequestParam(value = "toDate", required = false) LocalDate toDate



);


    @ApiOperation(value = "Create a new holiday master data for a calendar year.", notes = "To create a holiday in the system we need to call POST.", response = HolidayRes.class, tags={ "Holiday", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Holiday created sucessfully.", response = HolidayRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = HolidayRes.class) })
    @RequestMapping(value = "/holidays",
        method = RequestMethod.POST)
    ResponseEntity<HolidayRes> holidaysPost(

@ApiParam(value = "Details for the new holiday ." ,required=true ) @RequestBody HolidayReq holiday

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
