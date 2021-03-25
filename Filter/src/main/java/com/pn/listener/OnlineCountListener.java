package com.pn.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//统计网站在线人数：统计session
public class OnlineCountListener implements HttpSessionListener {
    //创建session监听，查看举动
    //创建一次，触发一次

    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context= se.getSession().getServletContext();
        //se.getSession().invalidate();手动销毁session
        Integer onlineCount= (Integer)context.getAttribute("OnlineCount");
        if (onlineCount == null) {
            onlineCount=new Integer(1);
        }else {
            int count=onlineCount.intValue();
            onlineCount=new Integer(count+1);
        }
//        设置属性标签值公用一个onlineCount减少变量名设置
        context.setAttribute("OnlineCount",onlineCount);

    }

    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context= se.getSession().getServletContext();
        //se.getSession().invalidate();手动销毁session
        Integer onlineCount= (Integer)context.getAttribute("OnlineCount");
        if (onlineCount == null) {
            onlineCount=new Integer(0);
        }else {
            int count=onlineCount.intValue();
            onlineCount=new Integer(count-1);
        }
        context.setAttribute("OnlineCount",onlineCount);
    }

}
