/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.controller;

import cn.edu.seu.herald.crawler.model.LoggedInUser;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
class AuthenticationManager {

    private static final String BEAN_NAME =
            "cn.edu.seu.herald.crawler.loggedInUser";
    private LoggedInUser loggedInUser = null;

    public AuthenticationManager(HttpSession session) {
        Object bean = session.getAttribute(BEAN_NAME);
        if (bean instanceof LoggedInUser) {
            loggedInUser = (LoggedInUser) bean;
        }
    }

    public boolean isAuthenticated() {
        return (loggedInUser != null);
    }

    public LoggedInUser getLoggedInUser() {
        return loggedInUser;
    }
}
