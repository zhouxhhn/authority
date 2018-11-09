/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import cn.siyue.platform.authority.server.constants.AuthorityType;
import cn.siyue.platform.authority.server.service.AuthorityService;
import cn.siyue.platform.authority.server.service.SalesAuthorityService;
import cn.siyue.platform.authority.server.service.SiyueliAuthorityService;
import cn.siyue.platform.base.ResponseData;
import cn.siyue.platform.constants.ResponseBackCode;

@Service
public class AuthorityServiceImpl implements AuthorityService {

  private SalesAuthorityService salesAuthorityService;


  @Autowired
  public AuthorityServiceImpl(SalesAuthorityService salesAuthorityService){
    this.salesAuthorityService = salesAuthorityService;
  }

  @Override
  public ResponseData judgetAuthority() {
    HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    String requestUri = request.getParameter("uri");
    requestUri = requestUri.split("/api/")[1];
    requestUri = requestUri.substring(requestUri.indexOf("/"));

    //经销商的权限验证
    return salesAuthorityService.judgetAuthority(requestUri);
  }
}
