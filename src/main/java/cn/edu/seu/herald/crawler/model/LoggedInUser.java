/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.model;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class LoggedInUser {

    private int subscriberId;
    private String username;
    private String nickname;

    public LoggedInUser(int subscriberId, String username, String nickname) {
        this.subscriberId = subscriberId;
        this.username = username;
        this.nickname = nickname;
    }

    public int getSubscriberId() {
        return subscriberId;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }
}
