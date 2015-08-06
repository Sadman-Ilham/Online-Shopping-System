package com.sadman.service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Sadman on 8/4/2015.
 */
public class URLService {

    public void saveURL (HttpServletRequest request) {
        if(request.getQueryString() != null) {
            request.getSession().setAttribute("lastVisitedPage", request.getRequestURL().append('?').append(request.getQueryString()));
        }else {
            request.getSession().setAttribute("lastVisitedPage", request.getRequestURL());
        }
    }

    public void saveURLWithoutQueryString (HttpServletRequest request) {
        request.getSession().setAttribute("lastVisitedPage", request.getRequestURL());
    }
}
