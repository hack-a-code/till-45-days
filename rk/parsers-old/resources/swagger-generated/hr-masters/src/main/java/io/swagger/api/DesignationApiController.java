package io.swagger.api;

import io.swagger.model.DesignationRes;
import io.swagger.model.ErrorRes;
import io.swagger.model.DesignationReq;

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
public class DesignationApiController implements DesignationApi {

    public ResponseEntity<DesignationRes> designationCodeUpdatePost(
@ApiParam(value = "The code of the designation master.",required=true ) @PathVariable("code") String code


,
        

@ApiParam(value = "Request header for the designation with new of values." ,required=true ) @RequestBody DesignationReq designation

) {
        // do some magic!
        return new ResponseEntity<DesignationRes>(HttpStatus.OK);
    }

}
