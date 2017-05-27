package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.LanguageRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LanguageReq;

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

@Api(value = "languages", description = "the languages API")
public interface LanguagesApi {

    @ApiOperation(value = "Get the list of language defined.", notes = "Get the language master data. ", response = LanguageRes.class, tags={ "Language", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = LanguageRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LanguageRes.class),
        @ApiResponse(code = 404, message = "language not found.", response = LanguageRes.class) })
    @RequestMapping(value = "/languages",
        method = RequestMethod.GET)
    ResponseEntity<LanguageRes> languagesGet(

@ApiParam(value = "Commmon request info for getting language." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the language.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "True will be set in cases where only active languages are needed and False will be set when inactive languages are needed and no value will be set when all languages are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Unique Id of language") @RequestParam(value = "id", required = false) Long id



);


    @ApiOperation(value = "Create a new Language.", notes = "To create a new Language we can use POST and set all the required and non-mandatory parameters.", response = LanguageRes.class, tags={ "Language", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Language created sucessfully.", response = LanguageRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LanguageRes.class) })
    @RequestMapping(value = "/languages",
        method = RequestMethod.POST)
    ResponseEntity<LanguageRes> languagesPost(

@ApiParam(value = "Details for the new language ." ,required=true ) @RequestBody LanguageReq language

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
