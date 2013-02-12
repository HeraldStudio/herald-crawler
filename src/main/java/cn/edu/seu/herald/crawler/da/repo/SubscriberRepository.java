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

    public Subscriber getSubscriberById(int subscriberId);
}
