package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.AttendanceRes;
import io.swagger.model.AttendanceReq;
import org.joda.time.LocalDate;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-22T10:24:33.929+05:30")

@Controller
public class AttendancesApiController implements AttendancesApi {

    public ResponseEntity<Void> attendancesEmployeeCodeDelete(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("employeeCode") String employeeCode


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the attendance to be deleted" ,required=true ) @RequestBody RequestInfo attendance

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<AttendanceRes> attendancesEmployeeCodePut(
@ApiParam(value = "The employee's code.",required=true ) @PathVariable("employeeCode") String employeeCode


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the attendance with new of values." ,required=true ) @RequestBody AttendanceReq attendance

) {
        // do some magic!
        return new ResponseEntity<AttendanceRes>(HttpStatus.OK);
    }

    public ResponseEntity<AttendanceRes> attendancesGet(

@ApiParam(value = "Commmon request info for getting attendance." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "The date for which the attendance is needed.") @RequestParam(value = "applicableOn", required = false) LocalDate applicableOn



,
        @ApiParam(value = "The month for which the attendance is needed.") @RequestParam(value = "month", required = false) String month



,
        @ApiParam(value = "The calander year name for which the attendance is needed.") @RequestParam(value = "year", required = false) Integer year



,
        @ApiParam(value = "The employee's code for whom the attendance is requested.") @RequestParam(value = "code", required = false) String code



,
        @ApiParam(value = "Unique Department Id for which the employee belongs to as primary assignment.") @RequestParam(value = "departmentId", required = false) Long departmentId



,
        @ApiParam(value = "Unique Designation Id for which the employee belongs to as primary assignment.") @RequestParam(value = "designationId", required = false) Long designationId



,
        @ApiParam(value = "Unique Id of attendance data.") @RequestParam(value = "id", required = false) Long id



,
        @ApiParam(value = "Number of records returned.", defaultValue = "50") @RequestParam(value = "pageSize", required = false, defaultValue="50") Integer pageSize



,
        @ApiParam(value = "Page number", defaultValue = "1") @RequestParam(value = "pageNumber", required = false, defaultValue="1") Integer pageNumber



,
        @ApiParam(value = "Result will be sorted by date and employee code ascending by default if this parameter is not provided.", defaultValue = "[+date, +employee]") @RequestParam(value = "sort", required = false, defaultValue="[+date, +employee]") List<String> sort



) {
        // do some magic!
        return new ResponseEntity<AttendanceRes>(HttpStatus.OK);
    }

    public ResponseEntity<AttendanceRes> attendancesPost(

@ApiParam(value = "Details for the new attendance." ,required=true ) @RequestBody AttendanceReq attendance

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<AttendanceRes>(HttpStatus.OK);
    }

}
