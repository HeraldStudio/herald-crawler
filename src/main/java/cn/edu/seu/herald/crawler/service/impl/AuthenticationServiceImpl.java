/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.da.repo.SubscriberRepository;
import cn.edu.seu.herald.crawler.domain.Subscriber;
import cn.edu.seu.herald.crawler.model.LoggedInUser;
import cn.edu.seu.herald.crawler.service.AuthenticationFailure;
import cn.edu.seu.herald.crawler.service.AuthenticationService;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class AuthenticationServiceImpl implements AuthenticationService {

    private SubscriberRepository subscriberRepository;

    public AuthenticationServiceImpl(
            SubscriberRepository subscriberRepository) {
        this.subscriberRepository = subscriberRepository;
    }

    @Override
    public LoggedInUser getLoggedInUserBySubscriberId(int subscriberId) {
        Subscriber subscriber = subscriberRepository.getSubscriberById(
                subscriberId);
        return getLoggedInUser(subscriber);
    }

    @Override
    public LoggedInUser getLoggedInUserIfConfirmed(String username,
            String password) throws AuthenticationFailure {
        Subscriber subscriber = subscriberRepository.getSubscriberByUsername(
                username);
        if (subscriber != null) {
            return getLoggedInUser(subscriber);
        }
        throw new AuthenticationFailure();
    }

    private static LoggedInUser getLoggedInUser(Subscriber subscriber) {
        return new LoggedInUser(subscriber.getId(),
                subscriber.getUsername(), subscriber.getNickname());
    }
}
