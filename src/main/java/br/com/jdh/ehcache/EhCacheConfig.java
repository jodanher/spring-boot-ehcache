package br.com.jdh.ehcache;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.management.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheManagerUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;

@Configuration
@EnableCaching
public class EhCacheConfig {

    @Value("${spring.cache.name:cacheName}")
    private String name;

    @Value("${spring.cache.ehcache.config:classpath:cache/ehcache.xml}")
    private Resource resource;

    @Bean
    public CacheManager ehCacheCacheManager() {
        return EhCacheManagerUtils.buildCacheManager(name, resource);
    }

    @Configuration
    class CacheMonitor {

        @Bean
        @Autowired
        public ManagementService managementService(CacheManager cacheManager) {
            MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
            return new ManagementService(cacheManager, mBeanServer, false, true, false, true);
        }
    }
}

