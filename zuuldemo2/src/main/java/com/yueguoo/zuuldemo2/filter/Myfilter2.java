package com.yueguoo.zuuldemo2.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2019-04-29 20:57
 */
@Component
public class Myfilter2 extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";

    }

    @Override
    public int filterOrder() {
        return 1;

    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext cx = RequestContext.getCurrentContext();
        HttpServletRequest request = cx.getRequest();
        HttpServletResponse response = cx.getResponse();


        String hou_token = request.getParameter("hou_token");
        if(StringUtils.isBlank(hou_token)){
            cx.setSendZuulResponse(false);
            cx.setResponseStatusCode(HttpStatus.FORBIDDEN.value());
            try {
                response.sendRedirect("http://www.baidu.com");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
