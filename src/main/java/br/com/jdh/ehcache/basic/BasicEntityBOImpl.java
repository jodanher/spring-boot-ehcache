package br.com.jdh.ehcache.basic;

import br.com.jdh.ehcache.api.bo.GenericBOImpl;
import org.springframework.stereotype.Service;

@Service
class BasicEntityBOImpl extends GenericBOImpl<Long, BasicEntity> implements BasicEntityCacheableBO {
}
