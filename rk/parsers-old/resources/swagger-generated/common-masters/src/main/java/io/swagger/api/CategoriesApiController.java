package io.swagger.api;

import io.swagger.model.CategoryRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.CategoryReq;

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
public class CategoriesApiController implements CategoriesApi {

    public ResponseEntity<CategoryRes> categoriesGet(

@ApiParam(value = "Commmon request info for getting category." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Get list of active /inactive categories.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Name of the category.") @RequestParam(value = "name", required = false) String name



) {
        // do some magic!
        return new ResponseEntity<CategoryRes>(HttpStatus.OK);
    }

    public ResponseEntity<Void> categoriesNameDelete(
@ApiParam(value = "The name of the category",required=true ) @PathVariable("name") String name


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the category to be deleted" ,required=true ) @RequestBody RequestInfo category

) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<CategoryRes> categoriesNamePut(
@ApiParam(value = "The name of the category",required=true ) @PathVariable("name") String name


,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        

@ApiParam(value = "Request header for the category with new of values." ,required=true ) @RequestBody CategoryReq category

) {
        // do some magic!
        return new ResponseEntity<CategoryRes>(HttpStatus.OK);
    }

    public ResponseEntity<CategoryRes> categoriesPost(

@ApiParam(value = "Details for the new category ." ,required=true ) @RequestBody CategoryReq category

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<CategoryRes>(HttpStatus.OK);
    }

}
