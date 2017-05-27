package io.swagger.api;

import io.swagger.model.ErrorRes;
import io.swagger.model.LanguageRes;
import io.swagger.model.RequestInfo;
import io.swagger.model.LanguageReq;

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
public class LanguagesApiController implements LanguagesApi {

    public ResponseEntity<LanguageRes> languagesGet(

@ApiParam(value = "Commmon request info for getting language." ,required=true ) @RequestBody RequestInfo requestInfo

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



,
        @ApiParam(value = "Name of the language.") @RequestParam(value = "name", required = false) String name



,
        @ApiParam(value = "True will be set in cases where only active languages are needed and False will be set when inactive languages are needed and no value will be set when all languages are needed.", defaultValue = "true") @RequestParam(value = "active", required = false, defaultValue="true") Boolean active



,
        @ApiParam(value = "Unique Id of language") @RequestParam(value = "id", required = false) Long id



) {
        // do some magic!
        return new ResponseEntity<LanguageRes>(HttpStatus.OK);
    }

    public ResponseEntity<LanguageRes> languagesPost(

@ApiParam(value = "Details for the new language ." ,required=true ) @RequestBody LanguageReq language

,
        @ApiParam(value = "Unique id for for a tenant.", required = true) @RequestParam(value = "tenantid", required = true) String tenantid



) {
        // do some magic!
        return new ResponseEntity<LanguageRes>(HttpStatus.OK);
    }

}
