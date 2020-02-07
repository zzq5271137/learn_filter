package com.mycomp.web.filter;

import javax.servlet.*;
import java.io.IOException;

public class FirstFilter implements Filter {

    // 当服务器启动时创建所有过滤器(web.xml中配置的)
    // 当过滤器创建好时,会自动调用init方法
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter init...");
    }

    // 是否对请求放行
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("来到了第一个过滤器...");

        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
    }

    // 当服务器关闭时,销毁所有过滤器对象
    // 当过滤器对象销毁时,会自动调用destroy方法
    @Override
    public void destroy() {
        System.out.println("FirstFilter init...");
    }
}
