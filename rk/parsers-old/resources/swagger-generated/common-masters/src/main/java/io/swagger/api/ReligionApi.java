package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.ReligionRes;
import io.swagger.model.ReligionReq;

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

@Api(value = "religion", description = "the religion API")
public interface ReligionApi {

    @ApiOperation(value = "Delete the religion data for the name passed.", notes = "To delete an existing religion for the religion name passed system will mark this record as inactive.", response = Void.class, tags={ "Religion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Religion deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Religion not found.", response = Void.class) })
    @RequestMapping(value = "/religion/{name}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> religionNameDelete(
@ApiParam(value = "The name of the religion.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the religion to be deleted" ,required=true ) @RequestBody RequestInfo religion

);


    @ApiOperation(value = "Update existing religion data for the name passed", notes = "To update an existing religion master data.", response = ReligionRes.class, tags={ "Religion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Religion updated.", response = ReligionRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = ReligionRes.class),
        @ApiResponse(code = 404, message = "Religion not found.", response = ReligionRes.class) })
    @RequestMapping(value = "/religion/{name}",
        method = RequestMethod.PUT)
    ResponseEntity<ReligionRes> religionNamePut(
@ApiParam(value = "The name of the religion.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the religion with new of values." ,required=true ) @RequestBody ReligionReq religion

);

}
