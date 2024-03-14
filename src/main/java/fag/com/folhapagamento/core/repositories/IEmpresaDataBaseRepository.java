package fag.com.folhapagamento.core.repositories;

import fag.com.folhapagamento.core.entities.EmpresaBO;

public interface IEmpresaDataBaseRepository {

    EmpresaBO persist(EmpresaBO bo);

}
