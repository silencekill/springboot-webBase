package org.javaboy.servletlinsterfilter;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listener-request销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Listener-request创建");
    }
}
