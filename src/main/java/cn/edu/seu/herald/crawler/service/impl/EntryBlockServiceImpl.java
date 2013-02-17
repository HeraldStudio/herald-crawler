/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service.impl;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import cn.edu.seu.herald.crawler.service.EntryBlockService;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class EntryBlockServiceImpl implements EntryBlockService {

    public EntryBlockServiceImpl() {
    }

    @Override
    public List<EntryBlock> getAllEntryBlocks() {
        return null;
    }

    @Override
    public boolean hasSubscribed(int subscriberId, int sectionId) {
        return false;
    }

    @Override
    public List<EntryBlock> getEntryBlocksBySectionId(int sectionId,
            int offset, int limit) {
        return null;
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int subscriberId, int year,
            int offset, int limit) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<EntryBlock> getEntryBlocksByArchive(int subscriberId, int year,
            int month, int offset, int limit) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<EntryBlock> getEntryBlocksByKeyword(int subscriberId,
            String keyword) {
        return Collections.EMPTY_LIST;
    }
}
