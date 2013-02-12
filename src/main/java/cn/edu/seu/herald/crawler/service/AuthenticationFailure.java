/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class AuthenticationFailure extends Exception {

    public AuthenticationFailure() {
        super("Not authenticated");
    }
}
