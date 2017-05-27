package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.PositionReq;
import io.swagger.model.PositionRes;

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
public class PositionApiController implements PositionApi {

    public ResponseEntity<PositionRes> positionPositionIdUpdatePost(
@ApiParam(value = "The unique Id of the position.",required=true ) @PathVariable("positionId") Long positionId


,
        

@ApiParam(value = "Request header for the position with new of values." ,required=true ) @RequestBody PositionReq position

) {
        // do some magic!
        return new ResponseEntity<PositionRes>(HttpStatus.OK);
    }

}
