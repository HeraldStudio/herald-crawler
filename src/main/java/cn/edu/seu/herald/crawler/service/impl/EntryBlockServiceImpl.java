/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.domain.Entry;
import cn.edu.seu.herald.crawler.domain.Section;
import cn.edu.seu.herald.crawler.domain.Subscriber;
import cn.edu.seu.herald.crawler.model.EntryBlock;
import cn.edu.seu.herald.crawler.service.EntryBlockService;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class EntryBlockServiceImpl implements EntryBlockService {

    public EntryBlockServiceImpl(/*repo*/) {
        ;
    }

    @Override
    public boolean hasSubscribed(int subscriberId, int sectionId) {
        Subscriber subscriber = null; // retrieve the subscriber by id
        Section section = null; // retrieve the section by id
        return subscriber.hasSubscribed(section);
    }

    @Override
    public List<EntryBlock> getEntryBlocksBySectionId(int sectionId, int offset,
            int limit) {
        Section section = null; // retrieve the section by id from its repository
        List<Entry> entries = section.getEnties(sectionId, sectionId);
        return EntryUtils.getEntryBlocks(entries);
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int year, int offset,
            int limit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int year, int month,
            int offset, int limit) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<EntryBlock> getAllEntryBlocks() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
