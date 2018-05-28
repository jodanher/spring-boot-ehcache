package br.com.jdh.ehcache.basic;

import br.com.jdh.ehcache.api.rest.GenericRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/basic")
public interface BasicEntityRestController extends GenericRestController<Long, BasicEntity> {

    @GetMapping
    void findAll();

    @GetMapping("/load")
    void load();

}
