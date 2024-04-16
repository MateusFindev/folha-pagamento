INSERT INTO empresa (id, cnpj, razao_social, nome_fantasia, endereco, regime_tributario, inscricao_estadual, inscricao_municipal)
VALUES (1, '12345678901234', 'Empresa Exemplo', 'Exemplo LTDA', 'Rua Exemplo, 123', 'Simples Nacional', '123456789', '987654321');

INSERT INTO departamento (id, nome, descricao, ativo, id_empresa)
VALUES (1, 'Departamento Principal', 'Descrição do departamento principal', TRUE, 1);


-- CARGOS
INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (1, 'Cargo de Teste', 'Descrição do Cargo', 1, 'Carregar Sacaria', 2334, FALSE, FALSE, FALSE, FALSE, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (2, 'Auxiliar Administrativo', 'Responsável por tarefas administrativas básicas', 1, 'Auxiliar Administrativo', 2000, FALSE, FALSE, FALSE, FALSE, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (3, 'Analista de Marketing', 'Planeja e executa estratégias de marketing', 2, 'Analista de Marketing', 3500, FALSE, FALSE, FALSE, FALSE, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (4, 'Desenvolvedor Front-end', 'Responsável pelo desenvolvimento de interfaces de usuário', 3, 'Desenvolvedor Front-end', 4000, FALSE, FALSE, FALSE, FALSE, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (5, 'Analista Financeiro', 'Responsável pela gestão financeira da empresa', 3, 'Analista Financeiro', 3800, FALSE, FALSE, FALSE, FALSE, 1);

INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (6, 'Gerente de Vendas', 'Coordenação da equipe de vendas e elaboração de estratégias de vendas', 4, 'Gerente de Vendas', 5000, FALSE, FALSE, FALSE, FALSE, 1);



-- CONTRATOS
INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (1, 'CLT', 44, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (2, 'CLT', 44, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (3, 'CLT', 44, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (4, 'CLT', 44, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (5, 'CLT', 44, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (6, 'CLT', 44, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (7, 'CLT', 30, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (8, 'CLT', 30, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (9, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (10, 'CLT', 30, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (11, 'CLT', 30, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (12, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (1, '08640463913', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 1, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (2, '08640463931', '16487593', '342342', 'Rafael Mendes', 'rafaelmendes@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 2, 'MASCULINO');



-- COLABORADORES
INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (3, '08640463920', '16487593', '342342', 'João Silva', 'joaosilva@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 3, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (4, '08640463921', '16487593', '342342', 'Pedro Souza', 'pedrosouza@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 4, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (5, '08640463922', '16487593', '342342', 'Lucas Santos', 'lucassantos@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 5, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (6, '08640463924', '16487593', '342342', 'Gabriel Oliveira', 'gabrieloliveira@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 6, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (7, '08640463925', '16487593', '342342', 'Matheus Costa', 'matheuscosta@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 7, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (8, '08640463926', '16487593', '342342', 'Ana Oliveira', 'anaoliveira@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 8, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (9, '08640463927', '16487593', '342342', 'Maria Santos', 'mariasantos@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 9, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (10, '08640463928', '16487593', '342342', 'Juliana Silva', 'julianasilva@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 10, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (11, '08640463929', '16487593', '342342', 'Carolina Souza', 'carolinasouza@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 11, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (12, '08640463930', '16487593', '342342', 'Patrícia Costa', 'patriciacosta@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 12, 'FEMININO');


--  BENEFÍCIOS

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (1, 'VALE_ALIMENTACAO', 'Vale-Alimentação', 'Para gastos com alimentação', 25, 'MOEDA', 'DIA', 'VALE_ALIMENTACAO', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (2, 'VALE_TRANSPORTE', 'Vale-Transporte', 'Para gastos com transporte', 250, 'MOEDA', 'MES', 'VALE_TRANSPORTE', TRUE);


--  DESCONTOS

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (1, 'INSS', 'INSS', 'Instituto Nacional do Seguro Social', 'PORCENTAGEM', 'MES', 'INSS', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (2, 'IRRF', 'IRRF', 'Imposto de Renda Retido na Fonte', 'PORCENTAGEM', 'MES', 'IRRF', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (3, 'VALE_ALIMENTACAO', 'Vale-Alimentação', 'Desconto de Vale alimentação', 'PORCENTAGEM', 'MES', 'VALE_ALIMENTACAO', TRUE);



-- COLABORADOR BENEFICIOS

INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo)
VALUES (1, 1, 1, 0, TRUE, TRUE);

INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo)
VALUES (2, 1, 2, 0, 275, TRUE);

-- COLABORADOR DESCONTOS

INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo)
VALUES (1, 1, 1, 0, TRUE);

INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo)
VALUES (2, 1, 2, 0, TRUE);

INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo)
VALUES (3, 1, 3, 5, TRUE);
