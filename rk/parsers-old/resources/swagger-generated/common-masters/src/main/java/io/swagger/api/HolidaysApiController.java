package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.HolidayRes;
import org.joda.time.LocalDate;
import io.swagger.model.HolidayReq;

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
public class HolidaysApiController implements HolidaysApi {

    public ResponseEntity<Void> holidaysDelete(@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the holiday to be deleted." ,required=true ) @RequestBody RequestInfo holiday

,
        @ApiParam(value = "Unique name of the calendar year.", required = true) @RequestParam(value = "calendarYear", required = true) Integer calendarYear



) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<HolidayRes> holidaysGet(

@ApiParam(value = "Commmon request info for getting holidays." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Holiday results will be sorted by calendar year and applicable on descending by default if this parameter is not provided.", defaultValue = "[-calendarYear, -applicableOn]") @RequestParam(value = "sort", required = false, defaultValue="[-calendarYear, -applicableOn]") List<String> sort



,
        @ApiParam(value = "Name of the calendar year.") @RequestParam(value = "year", required = false) Integer year



,
        @ApiParam(value = "Date on which a particular holiday is defined.") @RequestParam(value = "applicableOn", required = false) LocalDate applicableOn



,
        @ApiParam(value = "Name of the holiday.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Date from which holidays needs to be listed") @RequestParam(value = "fromDate", required = false) LocalDate fromDate



,
        @ApiParam(value = "Date till which holidays needs to be listed.") @RequestParam(value = "toDate", required = false) LocalDate toDate



) {
        // do some magic!
        return new ResponseEntity<HolidayRes>(HttpStatus.OK);
    }

    public ResponseEntity<HolidayRes> holidaysPost(

@ApiParam(value = "Details for the new holiday ." ,required=true ) @RequestBody HolidayReq holiday

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<HolidayRes>(HttpStatus.OK);
    }

}
