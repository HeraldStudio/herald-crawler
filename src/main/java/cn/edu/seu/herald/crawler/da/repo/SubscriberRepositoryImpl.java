/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.da.repo;

import cn.edu.seu.herald.crawler.da.mapper.SubscriberMapper;
import cn.edu.seu.herald.crawler.domain.Subscriber;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class SubscriberRepositoryImpl implements SubscriberRepository {

    private final Map<Integer, Subscriber> identityMap;
    private SubscriberMapper subscriberMapper;

    public SubscriberRepositoryImpl(SubscriberMapper subscriberMapper) {
        identityMap = Collections.synchronizedMap(
                new WeakHashMap<Integer, Subscriber>());
        this.subscriberMapper = subscriberMapper;
    }

    @Override
    public Subscriber getSubscriberById(int subscriberId) {
        if (identityMap.containsKey(subscriberId)) {
            return identityMap.get(subscriberId);

        }

        Subscriber subscriber = subscriberMapper.retrieve(subscriberId);
        identityMap.put(subscriberId, subscriber);
        return subscriber;
    }
}
