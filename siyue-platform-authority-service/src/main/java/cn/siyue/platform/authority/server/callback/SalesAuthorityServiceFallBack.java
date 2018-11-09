/*
 * (C) Copyright 2018 Siyue Holding Group.
 */
package cn.siyue.platform.authority.server.callback;

import org.springframework.stereotype.Component;

import cn.siyue.platform.authority.server.service.SalesAuthorityService;
import cn.siyue.platform.base.ResponseData;
import cn.siyue.platform.constants.ResponseBackCode;

@Component
public class SalesAuthorityServiceFallBack implements SalesAuthorityService {

  @Override
  public ResponseData judgetAuthority(String uri) {
    return ResponseData.build(ResponseBackCode.ERROR_DOWNGRADE.getValue(), ResponseBackCode.ERROR_DOWNGRADE.getMessage());
  }
}
