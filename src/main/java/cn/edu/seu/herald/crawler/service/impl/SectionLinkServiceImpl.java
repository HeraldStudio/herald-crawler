/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.da.repo.SectionRepository;
import cn.edu.seu.herald.crawler.da.repo.SubscriberRepository;
import cn.edu.seu.herald.crawler.domain.Section;
import cn.edu.seu.herald.crawler.domain.Subscriber;
import cn.edu.seu.herald.crawler.model.ArchiveLink;
import cn.edu.seu.herald.crawler.model.SectionLink;
import cn.edu.seu.herald.crawler.service.SectionLinkService;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class SectionLinkServiceImpl implements SectionLinkService {

    private SubscriberRepository subscriberRepository;
    private SectionRepository sectionRepository;

    public SectionLinkServiceImpl(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @Override
    public List<SectionLink> getSectionLinks(int subscriberId) {
        Subscriber subscriber = subscriberRepository.getSubscriberById(
                subscriberId);
        List<Section> sections = subscriber.getSubscribedSections();
        return getSectionLinks(sections);
    }

    @Override
    public List<ArchiveLink> getArchiveLinks(int subscriberId) {
        return Collections.EMPTY_LIST;
    }

    private static List<SectionLink> getSectionLinks(
            Collection<Section> sections) {
        List<SectionLink> sectionLinks = new LinkedList<SectionLink>();
        for (Section section : sections) {
            SectionLink sectionLink = getSectionLink(section);
            sectionLinks.add(sectionLink);
        }
        return sectionLinks;
    }

    private static SectionLink getSectionLink(Section section) {
        Collection<Section> subSections = section.getSubSections();
        List<SectionLink> subSectionLinks = getSectionLinks(subSections);
        return new SectionLink(section.getName(), null, subSectionLinks);
    }
}
