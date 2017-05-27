package io.swagger.api;

import io.swagger.model.RecruitmentQuotaRes;
import io.swagger.model.RecruitmentQuotaReq;
import io.swagger.model.ErrorRes;

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

@Api(value = "recruitmentquota", description = "the recruitmentquota API")
public interface RecruitmentquotaApi {

    @ApiOperation(value = "Update an existing recruitment quota.", notes = "To update an existing recruitment quota master data.", response = RecruitmentQuotaRes.class, tags={ "Recruitment Quota", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Recruitment quota updated.", response = RecruitmentQuotaRes.class),
        @ApiResponse(code = 400, message = "Invalid input.", response = RecruitmentQuotaRes.class) })
    @RequestMapping(value = "/recruitmentquota/{quotaId}/_update",
        method = RequestMethod.POST)
    ResponseEntity<RecruitmentQuotaRes> recruitmentquotaQuotaIdUpdatePost(

@ApiParam(value = "Request header for the recruitment quota to be updated." ,required=true ) @RequestBody RecruitmentQuotaReq recruitmentQuota

,
@ApiParam(value = "The unique Id of the recruitment quota",required=true ) @PathVariable("quotaId") Long quotaId


);

}
