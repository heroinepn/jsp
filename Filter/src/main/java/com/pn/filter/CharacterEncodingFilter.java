package com.pn.filter;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    public CharacterEncodingFilter() {
    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }
// web服务器关闭销毁
    public void destroy() {
        System.out.println("销毁");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("CharacterEncodingFilter执行前....chain：链放行");
        chain.doFilter(request,response);//让请求继续走，关闭拦截
        System.out.println("执行后...");
    }
}
