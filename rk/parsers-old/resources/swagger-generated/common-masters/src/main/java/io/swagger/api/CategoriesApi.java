package io.swagger.api;

import io.swagger.model.CategoryRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CategoryReq;

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

@Api(value = "categories", description = "the categories API")
public interface CategoriesApi {

    @ApiOperation(value = "Get the list of all employee categories defined in the system.", notes = "Get the employee category data. ", response = CategoryRes.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response.", response = CategoryRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CategoryRes.class),
        @ApiResponse(code = 404, message = "Category not found.", response = CategoryRes.class) })
    @RequestMapping(value = "/categories",
        method = RequestMethod.GET)
    ResponseEntity<CategoryRes> categoriesGet(

@ApiParam(value = "Commmon request info for getting category." ,required=true ) @RequestBody RequestInfo requestInfo

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,@ApiParam(value = "Get list of active /inactive categories.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,@ApiParam(value = "Name of the category.") @RequestParam(value = "name", required = false) String name



);


    @ApiOperation(value = "Delete the category data for the name.", notes = "To delete an existing category we need to set the active flag to FALSE. There will not be any physical delete of data from the system.", response = Void.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Category deleted.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = Void.class),
        @ApiResponse(code = 404, message = "Categoty not found.", response = Void.class) })
    @RequestMapping(value = "/categories/{name}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> categoriesNameDelete(
@ApiParam(value = "The name of the category",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the category to be deleted" ,required=true ) @RequestBody RequestInfo category

);


    @ApiOperation(value = "Update existing Category for the name passed", notes = "To update an existing category master data with the name passed.", response = CategoryRes.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Category updated.", response = CategoryRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CategoryRes.class),
        @ApiResponse(code = 404, message = "Category not found.", response = CategoryRes.class) })
    @RequestMapping(value = "/categories/{name}",
        method = RequestMethod.PUT)
    ResponseEntity<CategoryRes> categoriesNamePut(
@ApiParam(value = "The name of the category",required=true ) @PathVariable("name") String name


,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,

@ApiParam(value = "Request header for the category with new of values." ,required=true ) @RequestBody CategoryReq category

);


    @ApiOperation(value = "Create a new employee category.", notes = "To create a new category we can use POST and set all the required and non-mandatory parameters.", response = CategoryRes.class, tags={ "Category", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Category created sucessfully.", response = CategoryRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = CategoryRes.class) })
    @RequestMapping(value = "/categories",
        method = RequestMethod.POST)
    ResponseEntity<CategoryRes> categoriesPost(

@ApiParam(value = "Details for the new category ." ,required=true ) @RequestBody CategoryReq category

,@ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



);

}
