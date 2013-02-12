/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.da.mapper;

import cn.edu.seu.herald.crawler.domain.Subscriber;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface SubscriberMapper {

    Subscriber retrieve(int subscriberId);

    void create(Subscriber subscriber);

    void update(Subscriber subscriber);

    void delete(Subscriber subscriber);
}
