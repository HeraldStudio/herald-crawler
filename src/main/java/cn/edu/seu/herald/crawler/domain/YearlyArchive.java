/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.domain;

import java.util.Collection;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class YearlyArchive implements Archive {

    private int year;

    public int getYear() {
        return year;
    }

    @Override
    public Collection<Entry> getEntries() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
