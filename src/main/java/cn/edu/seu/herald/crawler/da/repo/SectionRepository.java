/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.da.repo;

import cn.edu.seu.herald.crawler.domain.Section;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface SectionRepository {

    Section getSections();

    Section getSectionById(int sectionId);

    void addSection(Section section);

    void removeSection(Section section);

    void updateSection(Section section);
}
