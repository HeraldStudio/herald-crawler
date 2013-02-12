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
public class MonthlyArchive implements Archive {

    private int year;
    private int month;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public Collection<Entry> getEntries() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
