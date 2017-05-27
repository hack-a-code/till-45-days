package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import org.joda.time.LocalDate;
import io.swagger.model.HolidayReq;
import io.swagger.model.HolidayRes;

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
public class HolidayApiController implements HolidayApi {

    public ResponseEntity<Void> holidayApplicableOnDelete(
@ApiParam(value = "The date on which a particualr holiday is defined.",required=true ) @PathVariable("applicableOn") LocalDate applicableOn


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the holiday to be deleted." ,required=true ) @RequestBody RequestInfo holiday

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<HolidayRes> holidayApplicableOnPut(
@ApiParam(value = "The date on which a particualr holiday is defined.",required=true ) @PathVariable("applicableOn") LocalDate applicableOn


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the holiday with new of values." ,required=true ) @RequestBody HolidayReq holiday

) {
        // do some magic!
        return new ResponseEntity<HolidayRes>(HttpStatus.OK);
    }

}
