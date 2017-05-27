package io.swagger.api;

import io.swagger.model.RecruitmentModeReq;
import io.swagger.model.ErrorRes;
import io.swagger.model.RecruitmentModeRes;

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

@Api(value = "recruitmentmode", description = "the recruitmentmode API")
public interface RecruitmentmodeApi {

    @ApiOperation(value = "Update an existing recruitment mode.", notes = "To update an existing recruitment mode master data.", response = RecruitmentModeRes.class, tags={ "Recruitment Mode", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Recruitment mode updated.", response = RecruitmentModeRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentModeRes.class) })
    @RequestMapping(value = "/recruitmentmode/{modeId}/_update",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentModeRes> recruitmentmodeModeIdUpdatePost(

@ApiParam(value = "Request header for the recruitment mode to be updated." ,required=true ) @RequestBody RecruitmentModeReq recruitmentMode

,
@ApiParam(value = "The unique Id of the recruitment mode",required=true ) @PathVariable("modeId") Long modeId


);

}
