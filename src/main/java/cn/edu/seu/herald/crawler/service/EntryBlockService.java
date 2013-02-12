/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.service;

import cn.edu.seu.herald.crawler.model.EntryBlock;
import java.util.List;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public interface EntryBlockService {

    boolean hasSubscribed(int subscriberId, int sectionId);

    List<EntryBlock> getAllEntryBlocks();

    List<EntryBlock> getEntryBlocksBySectionId(int sectionId, int offset,
            int limit);

    List<EntryBlock> getEntryBlocksByArchive(int year, int offset, int limit);

    List<EntryBlock> getEntryBlocksByArchive(int year, int month, int offset,
            int limit);
}
