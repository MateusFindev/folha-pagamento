INSERT INTO empresa (id, cnpj, razao_social, nome_fantasia, endereco, regime_tributario, inscricao_estadual, inscricao_municipal)
VALUES (1, '12345678901234', 'Empresa Exemplo', 'Exemplo LTDA', 'Rua Exemplo, 123', 'Simples Nacional', '123456789', '987654321');

INSERT INTO departamento (id, nome, descricao, ativo, id_empresa)
VALUES (1, 'Departamento Principal', 'Descrição do departamento principal', true, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (1, 'Cargo de Teste', 'Descricao do Cargo', 1, 'Carregar Sacaria', 2334, false, false, false, false, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_empresa)
VALUES (1, 'CLT', 44, 'EMPREGADO', 1);

INSERT INTO colaborador (id, cpf, rg, cnh, nome, admissao, id_contrato, id_cargo, genero)
VALUES (1, '08640463913', '16487593', '342342', 'Mateus Pfeffer', TIMESTAMP '2020-06-14 00:00:00', 1, 1, 'MASCULINO');