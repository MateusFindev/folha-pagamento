package fag.com.folhapagamento.core.usecases;

public interface Atualizar<ID, T> {

    T update(ID id, T t);

}
