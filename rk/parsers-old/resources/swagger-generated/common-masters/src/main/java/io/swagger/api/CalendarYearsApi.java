package io.swagger.api;

import io.swagger.model.CalendarYearRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CalendarYearReq;

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

@Api(value = "calendarYears", description = "the calendarYears API")
public interface CalendarYearsApi {

    @ApiOperation(value = "Get the list of calendar years defined in the system.", notes = "Get the calendar year master data. ", response = CalendarYearRes.class, tags={ "Calendar Year", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = CalendarYearRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CalendarYearRes.class),
        @ApiResponse(code = 404, message = "Calendar year not found.", response = CalendarYearRes.class) })
    @RequestMapping(value = "/calendarYears",
        method = RequestMethod.GET)
    ResponseEntity<CalendarYearRes> calendarYearsGet(

@ApiParam(value = "Commmon request info for getting calendar year." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Calendar data results will be sorted by name descending by default if this parameter is not provided.", defaultValue = "[-name]") @RequestParam(value = "sort", required = false, defaultValue="[-name]") List<String> sort



,@ApiParam(value = "Name of the calendar year.") @RequestParam(value = "name", required = false) Integer name



,@ApiParam(value = "True will be set in cases where only active calendar year are needed and False will be set when inactive calendar year are needed and no value will be set when all calendar year are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Unique Id of calendar year.") @RequestParam(value = "id", required = false) Long id



);


    @ApiOperation(value = "Create a new calendar year data in the system.", notes = "To create a new calendar year we can use POST and set all the required and non-mandatory parameters.", response = CalendarYearRes.class, tags={ "Calendar Year", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Calendar year created sucessfully.", response = CalendarYearRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CalendarYearRes.class) })
    @RequestMapping(value = "/calendarYears",
        method = RequestMethod.POST)
    ResponseEntity<CalendarYearRes> calendarYearsPost(

@ApiParam(value = "Details for the new calendar year ." ,required=true ) @RequestBody CalendarYearReq calendarYear

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
