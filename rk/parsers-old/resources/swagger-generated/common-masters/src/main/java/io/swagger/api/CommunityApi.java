package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CommunityRes;
import io.swagger.model.CommunityReq;

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

@Api(value = "community", description = "the community API")
public interface CommunityApi {

    @ApiOperation(value = "Delete the community data.", notes = "To delete an existing community data one needs to set it as inactive.", response = Void.class, tags={ "Community", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Community deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Community not found.", response = Void.class) })
    @RequestMapping(value = "/community/{name}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> communityNameDelete(
@ApiParam(value = "The name of the community.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the community to be deleted" ,required=true ) @RequestBody RequestInfo community

);


    @ApiOperation(value = "Update existing community", notes = "To update an existing community master data.", response = CommunityRes.class, tags={ "Community", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Community updated.", response = CommunityRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CommunityRes.class),
        @ApiResponse(code = 404, message = "Community not found.", response = CommunityRes.class) })
    @RequestMapping(value = "/community/{name}",
        method = RequestMethod.PUT)
    ResponseEntity<CommunityRes> communityNamePut(
@ApiParam(value = "The name of the community.",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the community with new of values." ,required=true ) @RequestBody CommunityReq community

);

}
