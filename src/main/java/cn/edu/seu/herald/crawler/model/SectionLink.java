/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.model;

import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class SectionLink {

    private String name;
    private String uri;
    private List<SectionLink> subSections;

    public SectionLink(String name, String uri, List<SectionLink> subSections) {
        this.name = name;
        this.uri = uri;
        this.subSections = subSections;
    }

    public String getName() {
        return name;
    }

    public String getUri() {
        return uri;
    }

    public List<SectionLink> getSubSections() {
        return subSections;
    }
}
