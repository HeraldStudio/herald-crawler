/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.model.LoggedInUser;
import cn.edu.seu.herald.crawler.service.AuthenticationFailure;
import cn.edu.seu.herald.crawler.service.AuthenticationService;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class AuthenticationServiceImpl implements AuthenticationService {

    private LoggedInUser loggedInUser;

    public AuthenticationServiceImpl() {
        loggedInUser = new LoggedInUser(1, "zetaplusae", "ray");
    }
    @Override
    public LoggedInUser getLoggedInUserBySubscriberId(int subscriberId) {
        if (subscriberId == 1) {
            return loggedInUser;
        }
        return null;
    }

    @Override
    public LoggedInUser getLoggedInUserIfConfirmed(String username,
            String password) throws AuthenticationFailure {
        if ("zetaplusae".equals(username) && "123".equals(password)) {
            return loggedInUser;
        }
        throw new AuthenticationFailure();
    }
}
