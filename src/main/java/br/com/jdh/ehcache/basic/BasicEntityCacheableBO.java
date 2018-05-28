package br.com.jdh.ehcache.basic;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

public interface BasicEntityCacheableBO extends BasicEntityBO {

    @Override
    @Cacheable(cacheNames = "cache", key = "#id", unless = "#result==null")
    BasicEntity findById(Long id);

    @Override
    @CachePut(value = "cache", key = "#entity.id", unless = "#result==null")
    BasicEntity insert(BasicEntity entity);

    @Override
    @CachePut(value = "cache", key = "#id", unless = "#result==null")
    BasicEntity update(Long id, BasicEntity entity);

    @Override
    @CacheEvict(value = "cache", key = "#id")
    void delete(Long id);

}
