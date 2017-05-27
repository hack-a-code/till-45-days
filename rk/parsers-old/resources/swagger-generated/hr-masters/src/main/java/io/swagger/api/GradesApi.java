package io.swagger.api;

import io.swagger.model.GradeReq;
import io.swagger.model.GradeRes;
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

@Api(value = "grades", description = "the grades API")
public interface GradesApi {

    @ApiOperation(value = "Create a new grade to the master list.", notes = "To create a new grade we can use POST and set all the required and non-mandatory parameters.", response = GradeRes.class, tags={ "Grade", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Grade created sucessfully.", response = GradeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GradeRes.class) })
    @RequestMapping(value = "/grades/_create",
        method = RequestMethod.POST)
    ResponseEntity<GradeRes> gradesCreatePost(

@ApiParam(value = "Details for the new grade ." ,required=true ) @RequestBody GradeReq grade

);


    @ApiOperation(value = "Update existing grade for the unique Id", notes = "To update an existing grade master data.", response = GradeRes.class, tags={ "Grade", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Grade updated.", response = GradeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GradeRes.class) })
    @RequestMapping(value = "/grades/{gradeId}",
        method = RequestMethod.POST)
    ResponseEntity<GradeRes> gradesGradeIdPost(
@ApiParam(value = "The unique Id of the grade",required=true ) @PathVariable("gradeId") Long gradeId


,

@ApiParam(value = "Request header for the grade to be deleted" ,required=true ) @RequestBody GradeReq grade

);


    @ApiOperation(value = "Get the list of grades defined.", notes = "Get the grade master data. To get a particular grade one can pass the grade name. ", response = GradeRes.class, tags={ "Grade", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = GradeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = GradeRes.class) })
    @RequestMapping(value = "/grades/_search",
        method = RequestMethod.POST)
    ResponseEntity<GradeRes> gradesSearchPost(

@ApiParam(value = "Commmon request info for getting grade." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Name of the grade.") @RequestParam(value = "name", required = false) String name



,@ApiParam(value = "Get list of active /inactive grades.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "List of Unique Id of grade") @RequestParam(value = "id", required = false) List<Integer> id



,@ApiParam(value = "Grade search results will be sorted by name ascending by default if this parameter is not provided.") @RequestParam(value = "sort", required = false) List<String> sort



);

}
