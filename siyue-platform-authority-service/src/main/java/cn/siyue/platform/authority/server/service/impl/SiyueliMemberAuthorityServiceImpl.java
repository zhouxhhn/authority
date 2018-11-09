package cn.siyue.platform.authority.server.service.impl;

import cn.siyue.platform.authority.server.service.SiyueliAuthorityService;
import cn.siyue.platform.authority.server.service.SiyueliMemberAuthorityService;
import cn.siyue.platform.base.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Service
public class SiyueliMemberAuthorityServiceImpl implements SiyueliMemberAuthorityService {

    @Autowired
    private SiyueliAuthorityService siyueliAuthorityService;

    @Override
    public ResponseData judgetAuthority() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String requestUri = request.getParameter("uri");
        return siyueliAuthorityService.judgetAuthority(requestUri);
    }
}
