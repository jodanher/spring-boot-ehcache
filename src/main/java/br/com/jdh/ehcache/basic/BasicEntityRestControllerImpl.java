package br.com.jdh.ehcache.basic;

import br.com.jdh.ehcache.api.rest.GenericRestControllerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BasicEntityRestControllerImpl extends GenericRestControllerImpl<Long, BasicEntity> implements BasicEntityRestController {

    @Autowired
    public BasicEntityRestControllerImpl(BasicEntityBO bo) {
        super(bo);
    }

    @Override
    public void findAll() {
        for (long i = 1; i <= 10; i++) {
            final BasicEntity entity = bo.findById(i);
            if (entity == null) {
                System.out.println(String.format("Registro %d não encontrado!", i));
            } else {
                System.out.println(entity);
            }
        }
    }

    @Override
    public void load() {
        for (long i = 1; i <= 10; i++) {
            bo.insert(new BasicEntity(i, "Nome " + i));
        }
        bo.delete(2L);
    }
}
