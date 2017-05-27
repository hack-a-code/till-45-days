package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LanguageReq;
import io.swagger.model.LanguageRes;

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

@Api(value = "language", description = "the language API")
public interface LanguageApi {

    @ApiOperation(value = "Delete the language data for the name.", notes = "To delete an existing language, mark the data as inactive and not physically remove it.", response = Void.class, tags={ "Language", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Language deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Language not found.", response = Void.class) })
    @RequestMapping(value = "/language/{name}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> languageNameDelete(
@ApiParam(value = "The language name.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the language to be deleted" ,required=true ) @RequestBody RequestInfo language

);


    @ApiOperation(value = "Update existing language data for the name", notes = "To update an existing language master data.", response = LanguageRes.class, tags={ "Language", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Language updated.", response = LanguageRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = LanguageRes.class),
        @ApiResponse(code = 404, message = "Language not found.", response = LanguageRes.class) })
    @RequestMapping(value = "/language/{name}",
        method = RequestMethod.PUT)
    ResponseEntity<LanguageRes> languageNamePut(
@ApiParam(value = "The language name.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the language with new of values." ,required=true ) @RequestBody LanguageReq language

);

}
