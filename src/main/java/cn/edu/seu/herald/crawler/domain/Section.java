/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class Section {

    private int id;
    private String name;
    private Section parentSection;
    private Collection<Section> subSections;
    private List<Entry> entries;
    private Date lastUpdatedTime;
    private Crawler crawler;

    public Section(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section getParentSection() {
        return parentSection;
    }

    public void setParentSection(Section parentSection) {
        this.parentSection = parentSection;
    }

    public Collection<Section> getSubSections() {
        return subSections;
    }

    public void setSubSections(Collection<Section> subSections) {
        this.subSections = subSections;
    }

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public List<Entry> getEnties(int offset, int limit) {
        return entries.subList(offset, offset + limit);
    }

    public void setCrawler(Crawler crawler) {
        this.crawler = crawler;
    }
}
