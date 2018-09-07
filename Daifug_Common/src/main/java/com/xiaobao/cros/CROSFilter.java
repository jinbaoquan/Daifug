package com.xiaobao.cros;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author JIN BAO QUAN
 * @version 1.0
 * @date 2018/9/6 17:48
 */
public class CROSFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("CROS---拦截");
        resp.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        // 带 * 的是支持单例的，  多线程报错就要使用上面那个楼
        ////response.setHeader("Access-Control-Allow-Origin","*");
        resp.setHeader("Access-Control-Allow-Methods","GET,POST,PUT,DELETE");
        resp.setHeader("Access-Control-Max-Age","2000");
        resp.setHeader("Access-Control-Allow-Headers","Origin,X-Requested-with,Content-Type,Accept");
        resp.setHeader("Access-Control-Allow-Credentials","true");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
