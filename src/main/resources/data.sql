INSERT INTO empresa (id, cnpj, razao_social, nome_fantasia, endereco, regime_tributario, inscricao_estadual, inscricao_municipal)
VALUES (1, '12345678901234', 'Empresa Exemplo', 'Exemplo LTDA', 'Rua Exemplo, 123', 'Simples Nacional', '123456789', '987654321');

INSERT INTO departamento (id, nome, descricao, ativo, id_empresa)
VALUES (1, 'Departamento Principal', 'Descrição do departamento principal', true, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (1, 'Cargo de Teste', 'Descricao do Cargo', 1, 'Carregar Sacaria', 2334, false, false, false, false, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (1, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (2, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (3, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (4, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (5, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (6, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (7, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (8, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (9, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (10, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (11, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (12, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (1, '08640463913', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 1, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (2, '08640463912', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer2@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 2, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (3, '08640463911', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer3@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 3, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (4, '08640463914', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer4@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 4, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (5, '08640463915', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer5@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 5, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (6, '08640463916', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer6@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 6, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (7, '08640463917', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer7@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 7, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (8, '08640463918', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer8@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 8, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (9, '08640463919', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer9@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 9, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (10, '08640463910', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer10@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 10, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (11, '08640463923', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer11@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 11, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (12, '08640463933', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer12@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 12, 'MASCULINO');

INSERT INTO beneficio (id, codigo, nome, descricao, valorPadrao, ativo)
VALUES (1, '55555', 'Vale-Alimentação', 'Para gastos com alimentação', 800.95, true);