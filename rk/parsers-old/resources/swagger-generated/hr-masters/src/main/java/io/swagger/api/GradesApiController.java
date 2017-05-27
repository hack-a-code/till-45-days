package io.swagger.api;

import io.swagger.model.GradeReq;
import io.swagger.model.GradeRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.RequestInfo;

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


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-03-10T12:36:58.677+05:30")

@Controller
public class GradesApiController implements GradesApi {

    public ResponseEntity<GradeRes> gradesCreatePost(

@ApiParam(value = "Details for the new grade ." ,required=true ) @RequestBody GradeReq grade

) {
        // do some magic!
        return new ResponseEntity<GradeRes>(HttpStatus.OK);
    }

    public ResponseEntity<GradeRes> gradesGradeIdPost(
@ApiParam(value = "The unique Id of the grade",required=true ) @PathVariable("gradeId") Long gradeId


,
        

@ApiParam(value = "Request header for the grade to be deleted" ,required=true ) @RequestBody GradeReq grade

) {
        // do some magic!
        return new ResponseEntity<GradeRes>(HttpStatus.OK);
    }

    public ResponseEntity<GradeRes> gradesSearchPost(

@ApiParam(value = "Commmon request info for getting grade." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the grade.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "Get list of active /inactive grades.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "List of Unique Id of grade") @RequestParam(value = "id", required = false) List<Integer> id



,
        @ApiParam(value = "Grade search results will be sorted by name ascending by default if this parameter is not provided.") @RequestParam(value = "sort", required = false) List<String> sort



) {
        // do some magic!
        return new ResponseEntity<GradeRes>(HttpStatus.OK);
    }

}
