package com.pn.listener;

import com.pn.util.Constant;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SysFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
    //ServletRequest  HttpServletRequest
        HttpServletRequest requst=(HttpServletRequest) req;
        HttpServletResponse response=(HttpServletResponse) resp;
        Object session = requst.getSession().getAttribute(Constant.session);
        /**
         * if(requst.getSession().getAttribute(Constant.session).level==vip1{
         * response.sendRedirect("/vip2.jsp");
         */





        if (session==null){
            response.sendRedirect("/error.jsp");
        }

        chain.doFilter( requst,response);
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void destroy() {

    }
}
