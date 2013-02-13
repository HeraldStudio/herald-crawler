/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.da.repo;

import cn.edu.seu.herald.crawler.domain.Subscriber;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface SubscriberRepository {

    Subscriber getAnonymousSubscriber();

    Subscriber getSubscriberById(int subscriberId);

    Subscriber getSubscriberByUsername(String username);

    Subscriber getSubscriberByUsernameAndPassword(String username,
            String password);

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void updateSubscriber(Subscriber subscriber);
}
