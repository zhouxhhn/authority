/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.siyue.platform.authority.server.callback.SalesAuthorityServiceFallBack;
import cn.siyue.platform.base.ResponseData;

/**
 * 经销商的权限认证
 */
@FeignClient(name = "sales-member-service", path = "/sales/authority", fallback = SalesAuthorityServiceFallBack.class)
public interface SalesAuthorityService {

  @RequestMapping(value = "/judgetAuthority", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
  ResponseData judgetAuthority(@RequestParam(value = "uri") String uri);
}
