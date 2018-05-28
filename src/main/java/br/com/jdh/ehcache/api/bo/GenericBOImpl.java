package br.com.jdh.ehcache.api.bo;

public abstract class GenericBOImpl<PK, E> implements GenericBO<PK, E> {

    @Override
    public E insert(E entity) {
        System.out.println("insert " + entity);
        return entity;
    }

    @Override
    public E update(PK id, E entity) {
        return entity;
    }

    @Override
    public void delete(PK id) {
        System.out.println(String.format("Registro %s apagado!", id.toString()));
    }

    @Override
    public E findById(PK id) {
        System.out.println("findById " + id);
        return null;
    }
}
