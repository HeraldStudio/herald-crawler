/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.model.ArchiveLink;
import cn.edu.seu.herald.crawler.model.SectionLink;
import cn.edu.seu.herald.crawler.service.SectionLinkService;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class SectionLinkServiceImpl implements SectionLinkService {

    public SectionLinkServiceImpl() {
        ;
    }

    @Override
    public List<SectionLink> getSectionLinks(int subscriberId) {
        SectionLink l2 = new SectionLink("教务管理", "/blocks?sectionId=2",
                null);
        SectionLink l3 = new SectionLink("学籍管理", "/blocks?sectionId=3",
                null);
        List<SectionLink> l23 = new LinkedList<SectionLink>();
        l23.add(l2);
        l23.add(l3);
        SectionLink l1 = new SectionLink("教务处", "./blocks?sectionId=1",
                l23);
        SectionLink l4 = new SectionLink("社团信息", "./blocks?sectionId=4",
                null);
        List<SectionLink> l14 = new LinkedList<SectionLink>();
        l14.add(l1);
        l14.add(l4);
        return l14;
    }

    @Override
    public List<ArchiveLink> getArchiveLinks(int subscriberId) {
        return Collections.EMPTY_LIST;
    }
}
