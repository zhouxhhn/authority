/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.service;

import cn.siyue.platform.authority.server.callback.SiyueliAuthorityServiceFallBack;
import cn.siyue.platform.base.ResponseData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 斯越里的权限认证
 */
@FeignClient(name = "siyueli-member-service", path = "/authority", fallback = SiyueliAuthorityServiceFallBack.class)
public interface SiyueliAuthorityService {

  @RequestMapping(value = "/judgetAuthority", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
  ResponseData judgetAuthority(@RequestParam(value = "uri") String uri);
}
