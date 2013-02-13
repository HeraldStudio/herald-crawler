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
public class SubscriberRepositoryImpl implements SubscriberRepository {

    private final IdentityMap<Integer, Subscriber> identityMap;

    public SubscriberRepositoryImpl() {
        identityMap = new IdentityMap();
    }

    @Override
    public Subscriber getAnonymousSubscriber() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Subscriber getSubscriberById(int subscriberId) {
        if (identityMap.containsKey(subscriberId)) {
            return identityMap.get(subscriberId);
        }

        Subscriber subscriber = null;
        identityMap.put(subscriberId, subscriber);
        return subscriber;
    }

    @Override
    public Subscriber getSubscriberByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Subscriber getSubscriberByUsernameAndPassword(String username,
            String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateSubscriber(Subscriber subscriber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
