package com.groww.lld.repository;

import java.util.List;

public interface RepositoryInterface<K,V> {

    public void saveEntity(K k,V v);
    public V getEntity(K k);
}
