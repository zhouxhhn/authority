/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

import cn.siyue.platform.authority.server.constants.AuthorityType;
import cn.siyue.platform.authority.server.service.AuthorityService;
import cn.siyue.platform.authority.server.service.impl.JedisClusterServiceImpl;
import cn.siyue.platform.base.ResponseData;
import cn.siyue.platform.constants.ResponseBackCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "斯越_权限管理接口")
@RestController
@RequestMapping(path = "/sales/authority", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class AuthorityController {

  private AuthorityService authorityService;

  @Autowired
  public AuthorityController(AuthorityService authorityService){
    this.authorityService = authorityService;
  }

  @ApiOperation(nickname = "authorityJudgetAuthority",value = "经销商端判断权限接口")
  @GetMapping("/judgetAuthority")
  public ResponseData judgetAuthority() {
    return authorityService.judgetAuthority();

  }
}
