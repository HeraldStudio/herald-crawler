/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.seu.herald.crawler.da.repo;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 *
 * @author rAy <predator.ray@gmail.com>
 */
public class IdentityMap<Identifier, Entity>
        implements Map<Identifier, Entity> {

    private final Map<Identifier, Entity> identityMap;

    public IdentityMap() {
        identityMap = Collections.synchronizedMap(
                new WeakHashMap<Identifier, Entity>());
    }

    @Override
    public int size() {
        return identityMap.size();
    }

    @Override
    public boolean isEmpty() {
        return identityMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return identityMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return identityMap.containsValue(value);
    }

    @Override
    public Entity get(Object key) {
        return identityMap.get(key);
    }

    @Override
    public Entity put(Identifier key, Entity value) {
        return identityMap.put(key, value);
    }

    @Override
    public Entity remove(Object key) {
        return identityMap.remove(key);
    }

    @Override
    public void putAll(Map<? extends Identifier, ? extends Entity> m) {
        identityMap.putAll(m);
    }

    @Override
    public void clear() {
        identityMap.clear();
    }

    @Override
    public Set<Identifier> keySet() {
        return identityMap.keySet();
    }

    @Override
    public Collection<Entity> values() {
        return identityMap.values();
    }

    @Override
    public Set<Entry<Identifier, Entity>> entrySet() {
        return identityMap.entrySet();
    }
}
