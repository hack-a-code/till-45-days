package io.swagger.api;

import io.swagger.model.PositionHierarchyRes;
import io.swagger.model.PositionHierarchyReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;

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

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Api(value = "positionhierarchies", description = "the positionhierarchies API")
public interface PositionhierarchiesApi {

    @ApiOperation(value = "Create a new Position hierarchy master data.", notes = "To create a new position hierarchy master data we need to call POST.", response = PositionHierarchyRes.class, tags={ "Position Hierarchy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Position hierarchy created sucessfully.", response = PositionHierarchyRes.class) })
    @RequestMapping(value = "/positionhierarchies/_create",
        method = RequestMethod.POST)
    ResponseEntity<PositionHierarchyRes> positionhierarchiesCreatePost(

@ApiParam(value = "Details for the new position hierarchy ." ,required=true ) @RequestBody PositionHierarchyReq positionHierarchy

);


    @ApiOperation(value = "Update existing position hierarchy master data for the object type passed.", notes = "To update the set of existing position hierarchy master data for a certain object type.", response = PositionHierarchyRes.class, tags={ "Position Hierarchy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Position Hierarchy updated.", response = PositionHierarchyRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = PositionHierarchyRes.class) })
    @RequestMapping(value = "/positionhierarchies/{objectType}/_update",
        method = RequestMethod.POST)
    ResponseEntity<PositionHierarchyRes> positionhierarchiesObjectTypeUpdatePost(

@ApiParam(value = "Request header for the position hierarchy with new of values." ,required=true ) @RequestBody PositionHierarchyReq positionHierarchy

,
@ApiParam(value = "The type value of the object type.",required=true ) @PathVariable("objectType") String objectType


);


    @ApiOperation(value = "Get the list of position hierarchies defined in the system for a particular Object type.", notes = "Get the position hierarchies master data for the parameter values.", response = PositionHierarchyRes.class, tags={ "Position Hierarchy", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = PositionHierarchyRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = PositionHierarchyRes.class) })
    @RequestMapping(value = "/positionhierarchies/_search",
        method = RequestMethod.POST)
    ResponseEntity<PositionHierarchyRes> positionhierarchiesSearchPost(

@ApiParam(value = "Commmon request info for getting position hierarchies." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Objecttype type data for which position hierarchies are needed.") @RequestParam(value = "objectTypeType", required = false) String objectTypeType



,@ApiParam(value = "Objecttype sub type data for which position hierarchies are needed.") @RequestParam(value = "objectSubtype", required = false) String objectSubtype



,@ApiParam(value = "Name of the position for whom the position hierarchy needs to be listed.") @RequestParam(value = "fromPosition", required = false) String fromPosition



,@ApiParam(value = "Name of the position to whom the position hierarchy falls for a particular object type.") @RequestParam(value = "toPosition", required = false) String toPosition



,@ApiParam(value = "Unique Id of position hierarchy") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Position hierarchy search results will be sorted by object type and from position name name ascending by default if this parameter is not provided.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
