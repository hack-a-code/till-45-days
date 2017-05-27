package io.swagger.api;

import io.swagger.model.RecruitmentQuotaRes;
import io.swagger.model.RecruitmentQuotaReq;
import io.swagger.model.ErrorRes;

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
public class RecruitmentquotaApiController implements RecruitmentquotaApi {

    public ResponseEntity<RecruitmentQuotaRes> recruitmentquotaQuotaIdUpdatePost(

@ApiParam(value = "Request header for the recruitment quota to be updated." ,required=true ) @RequestBody RecruitmentQuotaReq recruitmentQuota

,
        
@ApiParam(value = "The unique Id of the recruitment quota",required=true ) @PathVariable("quotaId") Long quotaId


) {
        // do some magic!
        return new ResponseEntity<RecruitmentQuotaRes>(HttpStatus.OK);
    }

}
