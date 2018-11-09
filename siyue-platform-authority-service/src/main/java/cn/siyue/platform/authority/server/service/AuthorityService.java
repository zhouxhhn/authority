/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.service;

import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

import cn.siyue.platform.base.ResponseData;

public interface AuthorityService {

  ResponseData judgetAuthority();
}
