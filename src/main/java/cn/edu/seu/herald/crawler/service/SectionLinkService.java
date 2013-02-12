/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service;

import cn.edu.seu.herald.crawler.model.SectionLink;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface SectionLinkService {

    List<SectionLink> getSectionLinks(int subscriberId);
}
