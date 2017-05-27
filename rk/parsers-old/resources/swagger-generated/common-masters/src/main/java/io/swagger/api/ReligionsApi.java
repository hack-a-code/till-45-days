package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.ReligionRes;
import io.swagger.model.RequestInfo;
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

@Api(value = "religions", description = "the religions API")
public interface ReligionsApi {

    @ApiOperation(value = "Get the list of religion defined.", notes = "Get the religion master data. ", response = ReligionRes.class, tags={ "Religion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = ReligionRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = ReligionRes.class),
        @ApiResponse(code = 404, message = "Religion not found.", response = ReligionRes.class) })
    @RequestMapping(value = "/religions",
        method = RequestMethod.GET)
    ResponseEntity<ReligionRes> religionsGet(

@ApiParam(value = "Commmon request info for getting religion." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "The name of the religion.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "True will be set in cases where only active religions are needed and False will be set when inactive religions are needed and no value will be set when all religions are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Unique Id of religion") @RequestParam(value = "id", required = false) Long id



);


    @ApiOperation(value = "Create a new religion.", notes = "To create a new religion we can use POST and set all the required and non-mandatory parameters.", response = ReligionRes.class, tags={ "Religion", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Religion created sucessfully.", response = ReligionRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = ReligionRes.class) })
    @RequestMapping(value = "/religions",
        method = RequestMethod.POST)
    ResponseEntity<ReligionRes> religionsPost(

@ApiParam(value = "Details for the new religion ." ,required=true ) @RequestBody ReligionReq religion

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
