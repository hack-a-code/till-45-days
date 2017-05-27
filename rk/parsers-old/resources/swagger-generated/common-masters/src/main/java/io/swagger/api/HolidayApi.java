package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import org.joda.time.LocalDate;
import io.swagger.model.HolidayReq;
import io.swagger.model.HolidayRes;

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

@Api(value = "holiday", description = "the holiday API")
public interface HolidayApi {

    @ApiOperation(value = "Delete a particular holiday master data from the holiday master list.", notes = "Will be used to delete an existing holiday master data for a particular date.", response = Void.class, tags={ "Holiday", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Holiday deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Holiday not defined for the given date.", response = Void.class) })
    @RequestMapping(value = "/holiday/{applicable_on}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> holidayApplicableOnDelete(
@ApiParam(value = "The date on which a particualr holiday is defined.",required=true ) @PathVariable("applicableOn") LocalDate applicableOn


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the holiday to be deleted." ,required=true ) @RequestBody RequestInfo holiday

);


    @ApiOperation(value = "Update existing holiday data for the date passed", notes = "To update an existing holiday data.", response = HolidayRes.class, tags={ "Holiday", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Holiday updated.", response = HolidayRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = HolidayRes.class),
        @ApiResponse(code = 404, message = "Holiday not defined for the given date.", response = HolidayRes.class) })
    @RequestMapping(value = "/holiday/{applicable_on}",
        method = RequestMethod.PUT)
    ResponseEntity<HolidayRes> holidayApplicableOnPut(
@ApiParam(value = "The date on which a particualr holiday is defined.",required=true ) @PathVariable("applicableOn") LocalDate applicableOn


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the holiday with new of values." ,required=true ) @RequestBody HolidayReq holiday

);

}
