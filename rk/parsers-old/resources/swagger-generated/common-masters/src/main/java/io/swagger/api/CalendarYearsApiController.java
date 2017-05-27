package io.swagger.api;

import io.swagger.model.CalendarYearRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CalendarYearReq;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T11:20:22.652+05:30")

@Controller
public class CalendarYearsApiController implements CalendarYearsApi {

    public ResponseEntity<CalendarYearRes> calendarYearsGet(

@ApiParam(value = "Commmon request info for getting calendar year." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Calendar data results will be sorted by name descending by default if this parameter is not provided.", defaultValue = "[-name]") @RequestParam(value = "sort", required = false, defaultValue="[-name]") List<String> sort



,
        @ApiParam(value = "Name of the calendar year.") @RequestParam(value = "name", required = false) Integer name



,
        @ApiParam(value = "True will be set in cases where only active calendar year are needed and False will be set when inactive calendar year are needed and no value will be set when all calendar year are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Unique Id of calendar year.") @RequestParam(value = "id", required = false) Long id



) {
        // do some magic!
        return new ResponseEntity<CalendarYearRes>(HttpStatus.OK);
    }

    public ResponseEntity<CalendarYearRes> calendarYearsPost(

@ApiParam(value = "Details for the new calendar year ." ,required=true ) @RequestBody CalendarYearReq calendarYear

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<CalendarYearRes>(HttpStatus.OK);
    }

}
