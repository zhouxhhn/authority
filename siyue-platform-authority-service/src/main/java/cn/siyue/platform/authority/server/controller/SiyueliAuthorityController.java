/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.controller;

import cn.siyue.platform.authority.server.service.SiyueliMemberAuthorityService;
import cn.siyue.platform.base.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "斯越_斯越里权限管理接口")
@RestController
@RequestMapping(path = "/siyueli/authority", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class SiyueliAuthorityController {

  private SiyueliMemberAuthorityService authorityService;

  @Autowired
  public SiyueliAuthorityController(SiyueliMemberAuthorityService authorityService){
    this.authorityService = authorityService;
  }

  @ApiOperation(nickname = "authorityJudgetAuthority",value = "斯越里端判断权限接口")
  @GetMapping("/judgetAuthority")
  public ResponseData judgetAuthority() {
    return authorityService.judgetAuthority();

  }
}
