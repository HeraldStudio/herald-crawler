/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service;

import cn.edu.seu.herald.crawler.model.LoggedInUser;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface AuthenticationService {

    LoggedInUser getLoggedInUserBySubscriberId(int subscriberId);
    LoggedInUser getLoggedInUserIfConfirmed(String username, String password)
            throws AuthenticationFailure;
}
