INSERT INTO empresa (id, cnpj, razao_social, nome_fantasia, endereco, regime_tributario, inscricao_estadual, inscricao_municipal)
VALUES (1, '12345678901234', 'Empresa Exemplo', 'Exemplo LTDA', 'Rua Exemplo, 123', 'Simples Nacional', '123456789', '987654321');

INSERT INTO departamento (id, nome, descricao, ativo, id_empresa)
VALUES (1, 'Departamento Principal', 'Descrição do departamento principal', true, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (1, 'Cargo de Teste', 'Descricao do Cargo', 1, 'Carregar Sacaria', 2334, false, false, false, false, 1);