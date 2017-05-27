package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CalendarYearRes;
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

@Api(value = "calendarYear", description = "the calendarYear API")
public interface CalendarYearApi {

    @ApiOperation(value = "Delete the calendar year data for the name.", notes = "To delete an existing calendar year, mark the data as inactive and not physically remove it.", response = Void.class, tags={ "Calendar Year", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Calendar year deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Calendar year not found.", response = Void.class) })
    @RequestMapping(value = "/calendarYear/{name}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> calendarYearNameDelete(
@ApiParam(value = "The name of the calendar year.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the calendar year to be deleted" ,required=true ) @RequestBody RequestInfo calendarYear

);


    @ApiOperation(value = "Update existing calendar year data for the name", notes = "To update an existing calendar year master data.", response = CalendarYearRes.class, tags={ "Calendar Year", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Calendar Year updated.", response = CalendarYearRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CalendarYearRes.class),
        @ApiResponse(code = 404, message = "Calendar year not found.", response = CalendarYearRes.class) })
    @RequestMapping(value = "/calendarYear/{name}",
        method = RequestMethod.PUT)
    ResponseEntity<CalendarYearRes> calendarYearNamePut(
@ApiParam(value = "The name of the calendar year.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the calendar year with new of values." ,required=true ) @RequestBody CalendarYearReq calendarYear

);

}
