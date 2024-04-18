INSERT INTO empresa (id, cnpj, razao_social, nome_fantasia, endereco, regime_tributario, inscricao_estadual, inscricao_municipal)
VALUES (1, '12345678901234', 'Empresa Exemplo', 'Exemplo LTDA', 'Rua Exemplo, 123', 'Simples Nacional', '123456789', '987654321');

INSERT INTO departamento (id, nome, descricao, ativo, id_empresa)
VALUES (1, 'Departamento Principal', 'Descrição do departamento principal', TRUE, 1);


-- CARGOS
INSERT INTO cargo (id, nome, descricao, nivel, funcao, salario_base, ad_periculosidade, ad_insalubridade, ad_funcao, comissao, id_departamento)
VALUES (1, 'Cargo de Teste', 'Descrição do Cargo', 1, 'Carregar Sacaria', 1450, TRUE, TRUE, FALSE, FALSE, 1);

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
INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (13, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (14, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (15, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (16, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (17, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (18, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (19, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (20, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (21, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (22, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (23, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (24, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (25, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (26, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (27, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (28, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (29, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (30, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (31, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (32, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (33, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (34, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (35, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (36, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (37, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (38, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (39, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (40, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (41, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (42, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (43, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (44, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (45, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (46, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (47, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (48, 'CLT', 30, 'EMPREGADO', 6, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (49, 'CLT', 40, 'EMPREGADO', 5, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (50, 'CLT', 35, 'EMPREGADO', 4, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (51, 'CLT', 30, 'EMPREGADO', 3, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (52, 'CLT', 40, 'EMPREGADO', 2, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (53, 'CLT', 35, 'EMPREGADO', 1, 1);

INSERT INTO contrato (id, tipo, carga_horaria, tipo_filiacao, id_cargo, id_empresa)
VALUES (54, 'CLT', 30, 'EMPREGADO', 6, 1);


-- COLABORADORES

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (1, '08640463913', '16487593', '342342', 'Mateus Pfeffer', 'mpfeffer@minha.fag.edu.br', TIMESTAMP '2020-06-14 00:00:00', 1, 'MASCULINO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (2, '08640463931', '16487593', '342342', 'Rafael Mendes', 'rafaelmendes@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 2, 'MASCULINO');

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

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email  , admissao, id_contrato, genero)
VALUES (11, '08640463929', '16487593', '342342', 'Carolina Souza', 'carolinasouza@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 11, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (12, '08640463930', '16487593', '342342', 'Patrícia Costa', 'patriciacosta@empresa.com', TIMESTAMP '2020-06-15 00:00:00', 12, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (13, '18767645321', '43786521', '234567', 'Amanda Silva', 'amandasilva@empresa.com', TIMESTAMP '2021-01-20 00:00:00', 13, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (14, '98765432198', '98765432', '987654', 'Camila Santos', 'camilasantos@empresa.com', TIMESTAMP '2021-02-10 00:00:00', 14, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (15, '54321678901', '65432198', '654321', 'Juliana Oliveira', 'julianaoliveira@empresa.com', TIMESTAMP '2021-03-05 00:00:00', 15, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (16, '32167890123', '87654321', '765432', 'Luciana Pereira', 'lucianapereira@empresa.com', TIMESTAMP '2021-04-10 00:00:00', 16, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (17, '09876543218', '43218765', '543210', 'Fernanda Rodrigues', 'fernandarodrigues@empresa.com', TIMESTAMP '2021-05-15 00:00:00', 17, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (18, '76543218098', '65432187', '432109', 'Laura Almeida', 'lauraalmeida@empresa.com', TIMESTAMP '2021-06-20 00:00:00', 18, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (19, '54321876543', '76543218', '321098', 'Bianca Lima', 'biancalima@empresa.com', TIMESTAMP '2021-07-25 00:00:00', 19, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (20, '32187654321', '32187654', '210987', 'Ana Paula', 'anapaula@empresa.com', TIMESTAMP '2021-08-30 00:00:00', 20, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (21, '09876543218', '54321876', '109876', 'Carla Vieira', 'carlavieira@empresa.com', TIMESTAMP '2021-09-05 00:00:00', 21, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (22, '76543218098', '98765432', '098765', 'Mariana Martins', 'marianamartins@empresa.com', TIMESTAMP '2021-10-10 00:00:00', 22, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (23, '54321876543', '87654321', '987654', 'Isabela Correia', 'isabelacorreia@empresa.com', TIMESTAMP '2021-11-15 00:00:00', 23, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (24, '32187654321', '43218765', '876543', 'Beatriz Gomes', 'beatrizgomes@empresa.com', TIMESTAMP '2021-12-20 00:00:00', 24, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (25, '09876543218', '65432187', '765432', 'Natália Barbosa', 'nataliabarbosa@empresa.com', TIMESTAMP '2022-01-25 00:00:00', 25, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (26, '76543218098', '54321876', '654321', 'Larissa Cardoso', 'larissacardoso@empresa.com', TIMESTAMP '2022-02-28 00:00:00', 26, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (27, '54321876543', '32187654', '543210', 'Gabriela Oliveira', 'gabrielaoliveira@empresa.com', TIMESTAMP '2022-03-05 00:00:00', 27, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (28, '32187654321', '09876543', '321098', 'Patrícia Sousa', 'patriciasousa@empresa.com', TIMESTAMP '2022-04-10 00:00:00', 28, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (29, '09876543218', '76543218', '210987', 'Tatiane Castro', 'tatianecastro@empresa.com', TIMESTAMP '2022-05-15 00:00:00', 29, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (30, '76543218098', '54321876', '109876', 'Elaine Carvalho', 'elainecarvalho@empresa.com', TIMESTAMP '2022-06-20 00:00:00', 30, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (31, '12345678901', '123456789', '123456', 'Vanessa Oliveira', 'vanessaoliveira@empresa.com', TIMESTAMP '2022-07-25 00:00:00', 31, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (32, '23456789012', '234567890', '234567', 'Carolina Lima', 'carolinalima@empresa.com', TIMESTAMP '2022-08-30 00:00:00', 32, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (33, '34567890123', '345678901', '345678', 'Mariana Souza', 'marianasouza@empresa.com', TIMESTAMP '2022-09-05 00:00:00', 33, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (34, '45678901234', '456789012', '456789', 'Fernanda Castro', 'fernandacastro@empresa.com', TIMESTAMP '2022-10-10 00:00:00', 34, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (35, '56789012345', '567890123', '567890', 'Aline Santos', 'alinesantos@empresa.com', TIMESTAMP '2022-11-15 00:00:00', 35, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (36, '67890123456', '678901234', '678901', 'Beatriz Oliveira', 'beatrizoliveira@empresa.com', TIMESTAMP '2022-12-20 00:00:00', 36, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (37, '78901234567', '789012345', '789012', 'Amanda Pereira', 'amandapereira@empresa.com', TIMESTAMP '2023-01-25 00:00:00', 37, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (38, '89012345678', '890123456', '890123', 'Tatiane Silva', 'tatianesilva@empresa.com', TIMESTAMP '2023-02-28 00:00:00', 38, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (39, '90123456789', '901234567', '901234', 'Larissa Souza', 'larissasouza@empresa.com', TIMESTAMP '2023-03-05 00:00:00', 39, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (40, '01234567890', '012345678', '012345', 'Carla Martins', 'carlamartins@empresa.com', TIMESTAMP '2023-04-10 00:00:00', 40, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (41, '12345678901', '123456789', '123456', 'Elaine Costa', 'elainecosta@empresa.com', TIMESTAMP '2023-05-15 00:00:00', 41, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (42, '23456789012', '234567890', '234567', 'Patrícia Oliveira', 'patriciaoliveira@empresa.com', TIMESTAMP '2023-06-20 00:00:00', 42, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (43, '34567890123', '345678901', '345678', 'Mariana Castro', 'marianacastro@empresa.com', TIMESTAMP '2023-07-25 00:00:00', 43, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (44, '45678901234', '456789012', '456789', 'Fernanda Almeida', 'fernandaalmeida@empresa.com', TIMESTAMP '2023-08-30 00:00:00', 44, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (45, '56789012345', '567890123', '567890', 'Aline Oliveira', 'alineoliveira@empresa.com', TIMESTAMP '2023-09-05 00:00:00', 45, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (46, '67890123456', '678901234', '678901', 'Camila Souza', 'camilasouza@empresa.com', TIMESTAMP '2023-10-10 00:00:00', 46, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (47, '78901234567', '789012345', '789012', 'Vanessa Silva', 'vanessasilva@empresa.com', TIMESTAMP '2023-11-15 00:00:00', 47, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (48, '89012345678', '890123456', '890123', 'Carolina Oliveira', 'carolinaoliveira@empresa.com', TIMESTAMP '2023-12-20 00:00:00', 48, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (49, '90123456789', '901234567', '901234', 'Mariana Silva', 'marianasilva@empresa.com', TIMESTAMP '2024-01-25 00:00:00', 49, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (50, '01234567890', '012345678', '012345', 'Ana Carolina', 'anacarolina@empresa.com', TIMESTAMP '2024-02-28 00:00:00', 50, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (51, '12345678901', '123456789', '123456', 'Fernanda Oliveira', 'fernandaoliveira@empresa.com', TIMESTAMP '2024-03-05 00:00:00', 51, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (52, '23456789012', '234567890', '234567', 'Amanda Lima', 'amandalima@empresa.com', TIMESTAMP '2024-04-10 00:00:00', 52, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (53, '34567890123', '345678901', '345678', 'Tatiane Silva', 'tatianesilva@empresa.com', TIMESTAMP '2024-05-15 00:00:00', 53, 'FEMININO');

INSERT INTO colaborador (id, cpf, rg, cnh, nome, email, admissao, id_contrato, genero)
VALUES (54, '45678901234', '456789012', '456789', 'Luana Costa', 'luanacosta@empresa.com', TIMESTAMP '2024-06-20 00:00:00', 54, 'FEMININO');

--  BENEFÍCIOS

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (1, 'VALE_ALIMENTACAO', 'Vale-Alimentação', 'Para gastos com alimentação', 25, 'MOEDA', 'DIA', 'VALE_ALIMENTACAO', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (2, 'VALE_TRANSPORTE', 'Vale-Transporte', 'Para gastos com transporte', 250, 'MOEDA', 'MES', 'VALE_TRANSPORTE', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (3, 'ADICIONAL_PERICULOSIDADE', 'Adicional de Periculosidade', 'Adicional de periculosidade', 30, 'PORCENTAGEM', 'MES', 'ADICIONAL_PERICULOSIDADE', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (4, 'ADICIONAL_FUNCAO', 'Adicional de Função', 'Adicional de Função', 250, 'MOEDA', 'MES', 'ADICIONAL_FUNCAO', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (5, 'PLANO_SAUDE', 'Plano de Saúde', 'Plano de Saúde', 250, 'MOEDA', 'MES', 'PLANO_SAUDE', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (6, 'PLANO_ODONTOLOGICO', 'Plano Odontológico', 'Plano Odontológico', 250, 'MOEDA', 'MES', 'PLANO_ODONTOLOGICO', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (7, 'AUXILIO_CRECHE', 'Auxílio Creche', 'Auxílio Creche', 250, 'MOEDA', 'MES', 'AUXILIO_CRECHE', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (8, 'AUXILIO_EDUCACAO', 'Auxílio Educação', 'Auxílio Educação', 250, 'MOEDA', 'MES', 'AUXILIO_EDUCACAO', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (9, 'VALE_ACADEMIA', 'Gym Pass', 'Gym Pass', 250, 'MOEDA', 'MES', 'VALE_ACADEMIA', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (10, 'VALE_CULTURA', 'Vale Cultura', 'Vale Cultura', 250, 'MOEDA', 'MES', 'VALE_CULTURA', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (11, 'SALARIO_FAMILIA', 'Salário Família', 'Salário Família', 62.04, 'MOEDA', 'MES', 'SALARIO_FAMILIA', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (12, 'AUXILIO_MATERNIDADE', 'Auxílio Maternidade', 'Auxílio Maternidade', 250, 'MOEDA', 'MES', 'AUXILIO_MATERNIDADE', TRUE);

INSERT INTO beneficio (id, codigo, nome, descricao, valor_padrao, tipo_valor, prazo, tipo, ativo)
VALUES (13, 'ADICIONAL_INSALUBRIDADE', 'Adicional de Insalubridade', 'Adicional de insalubridade', 10, 'PORCENTAGEM', 'MES', 'ADICIONAL_INSALUBRIDADE', TRUE);

--  DESCONTOS

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (1, 'INSS', 'INSS', 'Instituto Nacional do Seguro Social', 'PORCENTAGEM', 'MES', 'INSS', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (2, 'IRRF', 'IRRF', 'Imposto de Renda Retido na Fonte', 'PORCENTAGEM', 'MES', 'IRRF', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (3, 'VALE_ALIMENTACAO', 'Vale-Alimentação', 'Desconto de vale alimentação', 'PORCENTAGEM', 'MES', 'VALE_ALIMENTACAO', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (4, 'SINDICATO', 'Sindicato', 'Contribuição Sindical', 'PORCENTAGEM', 'MES', 'SINDICATO', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (5, 'VALE_TRANSPORTE', 'Vale Transporte', 'Desconto de vale transporte', 'PORCENTAGEM', 'MES', 'VALE_TRANSPORTE', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (6, 'ASSISTENCIA_MEDIA', 'Assistência Médica', 'Desconto de assistência médica', 'PORCENTAGEM', 'MES', 'ASSISTENCIA_MEDIA', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (7, 'ASSISTENCIA_ODONTOLOGICA', 'Assistência Odontológica', 'Desconto de assistência odontológica', 'PORCENTAGEM', 'MES', 'ASSISTENCIA_ODONTOLOGICA', TRUE);

INSERT INTO desconto (id, codigo, nome, descricao, tipo_valor, prazo, tipo, ativo)
VALUES (8, 'PENSAO_JUDICIAL', 'Pensão Judicial', 'Desconto de pensão judicial', 'PORCENTAGEM', 'MES', 'PENSAO_JUDICIAL', TRUE);

-- COLABORADOR BENEFICIOS

INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (1, 1, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (2, 1, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (3, 1, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (4, 1, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (5, 2, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (6, 2, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (7, 2, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (8, 2, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (9, 3, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (10, 3, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (11, 3, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (12, 3, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (13, 4, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (14, 4, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (15, 4, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (16, 4, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (17, 5, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (18, 5, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (19, 5, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (20, 5, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (21, 6, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (22, 6, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (23, 6, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (24, 6, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (25, 7, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (26, 7, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (27, 7, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (28, 7, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (29, 8, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (30, 8, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (31, 8, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (32, 8, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (33, 9, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (34, 9, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (35, 9, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (36, 9, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (37, 10, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (38, 10, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (39, 10, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (40, 10, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (41, 11, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (42, 11, 2, 275, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (43, 11, 5, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (44, 11, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (45, 10, 7, 200, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (46, 1, 3, 20, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (47, 1, 13, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (48, 7, 3, 30, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (49, 7, 13, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (50, 12, 4, 50, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (51, 12, 7, 150, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (52, 13, 6, 75, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (53, 13, 9, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (54, 14, 8, 30, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (55, 14, 10, 90, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (56, 15, 12, 40, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (57, 15, 13, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (58, 16, 3, 15, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (59, 16, 6, 60, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (60, 17, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (61, 17, 12, 50, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (62, 18, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (63, 18, 3, 25, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (64, 19, 5, 75, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (65, 19, 7, 100, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (66, 20, 9, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (67, 20, 10, 120, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (68, 21, 11, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (69, 21, 12, 60, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (70, 22, 2, 150, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (71, 22, 4, 30, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (72, 23, 6, 90, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (73, 23, 8, 45, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (74, 24, 10, 110, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (75, 24, 12, 70, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (76, 25, 1, 0, TRUE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (77, 25, 3, 35, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (78, 26, 5, 85, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (79, 26, 7, 120, FALSE, TRUE);
INSERT INTO colaborador_beneficio(id, id_colaborador, id_beneficio, valor, usar_padrao, ativo) VALUES (80, 27, 9, 0, TRUE, TRUE);


-- COLABORADOR DESCONTOS

INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (1, 1, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (2, 1, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (3, 1, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (4, 2, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (5, 2, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (6, 2, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (7, 3, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (8, 3, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (9, 3, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (10, 4, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (11, 4, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (12, 4, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (13, 5, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (14, 5, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (15, 5, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (16, 6, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (17, 6, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (18, 6, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (19, 10, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (20, 10, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (21, 13, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (22, 13, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (23, 13, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (24, 14, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (25, 14, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (26, 14, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (27, 15, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (28, 15, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (29, 15, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (30, 16, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (31, 16, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (32, 16, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (33, 17, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (34, 17, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (35, 17, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (36, 18, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (37, 18, 2, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (38, 18, 3, 5, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (39, 19, 1, 0, TRUE);
INSERT INTO colaborador_desconto(id, id_colaborador, id_desconto, valor, ativo) VALUES (40, 19, 2, 0, TRUE);


-- DEPENDENTES

INSERT INTO dependente(id, nome, nascimento, parentesco, id_colaborador) VALUES (1, 'Nome do dependente', NOW(), 'FILHO', 7);
INSERT INTO dependente(id, nome, nascimento, parentesco, id_colaborador) VALUES (2, 'Nome do dependente', NOW(), 'FILHO', 1);
INSERT INTO dependente(id, nome, nascimento, parentesco, id_colaborador) VALUES (3, 'Nome do dependente', NOW(), 'FILHO', 4);

-- PONTOS

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (1, 1, 24, 0, 0, 15, 0, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (2, 2, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (3, 3, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (4, 4, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (5, 5, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (6, 6, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (7, 7, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (8, 8, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (9, 9, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');

INSERT INTO colaborador_ponto(id, id_colaborador, dias_trabalhados, faltas, horas_atraso, horas_50, horas_100, mes)
VALUES (10, 10, FLOOR(RAND() * (24 - 20 + 1)) + 20, FLOOR(RAND() * (4 - 1 + 1)) + 1, FLOOR(RAND() * (8 - 0 + 1)) + 0, FLOOR(RAND() * (20 - 1 + 1)) + 1, FLOOR(RAND() * (17 - 2 + 1)) + 2, 'ABRIL');
