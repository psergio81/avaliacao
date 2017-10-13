insert into avaliacao (data_inicio, data_fim, descricao, titulo) values ('2016-01-01', '2016-01-31', 'Avaliação do Desenvolvimento', 'Avaliação 1° Sem/2016');
insert into avaliacao (data_inicio, data_fim, descricao, titulo) values ('2015-01-01', '2015-01-31', 'Avaliação do Desenvolvimento', 'Avaliação 1° Sem/2015');
insert into avaliacao (data_inicio, data_fim, descricao, titulo) values ('2014-01-01', '2014-01-31', 'Avaliação do Desenvolvimento', 'Avaliação 1° Sem/2014');

insert into avaliacao_avaliador(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'OPERACIONAL', 2, 3, 'ALEATORIA', 1)
insert into avaliacao_avaliador(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'LIDERANCA', 4, 2, 'ALEATORIA', 1)
insert into avaliacao_avaliador(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'GERENCIA', 4, 1, 'ALEATORIA', 1)
insert into avaliacao_avaliador(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('GERENCIA', 'OPERACIONAL', 4, 1, 'ALEATORIA', 1)


insert into colaborador(email, nivel_hierarquico, nome) values ('gerente@avalia.com', 'GERENCIA', 'Gerente');
insert into colaborador(email, nivel_hierarquico, nome) values ('desenvolvedor@avalia.com', 'OPERACIONAL', 'Desenvolvedor');
insert into colaborador(email, nivel_hierarquico, nome) values ('desenvolvedorx@avalia.com', 'OPERACIONAL', 'Desenvolvedor II');
insert into colaborador(email, nivel_hierarquico, nome) values ('qa@avalia.com', 'OPERACIONAL', 'Qualidade');
insert into colaborador(email, nivel_hierarquico, nome) values ('qa@avalia.com', 'OPERACIONAL', 'QA II');
insert into colaborador(email, nivel_hierarquico, nome) values ('liderum@avalia.com', 'LIDERANCA', 'Lider I');
insert into colaborador(email, nivel_hierarquico, nome) values ('liderdois@avalia.com', 'LIDERANCA', 'Lider II');


insert into cargo (descricao, nivel_hierarquico) values ('Analista Programador', 'OPERACIONAL');
insert into cargo (descricao, nivel_hierarquico) values ('Analista de Operação', 'OPERACIONAL');
insert into cargo (descricao, nivel_hierarquico) values ('Analista de Qualidade', 'OPERACIONAL');
insert into cargo (descricao, nivel_hierarquico) values ('Arquiteto JAVA', 'LIDERANCA');
insert into cargo (descricao, nivel_hierarquico) values ('DBA - Administrador de Banco de Dados', 'LIDERANCA');
insert into cargo (descricao, nivel_hierarquico) values ('Estagiário em Programação', 'OPERACIONAL');
insert into cargo (descricao, nivel_hierarquico) values ('Estagiário em Qualidade', 'OPERACIONAL');
insert into cargo (descricao, nivel_hierarquico) values ('Gerente de Desenvolvimento', 'GERENCIA');
insert into cargo (descricao, nivel_hierarquico) values ('Líder de Projetos', 'LIDERANCA');
insert into cargo (descricao, nivel_hierarquico) values ('Scrum Master', 'LIDERANCA');
insert into cargo (descricao, nivel_hierarquico) values ('Web Designer', 'LIDERANCA');


insert into questao (tipo_questao, descricao) values ('ATITUDE', 'É relutante em aceitar as decisões acordadas pelo grupo?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Ao resolver as dificuldades do dia a dia, sabe expor suas necessidades e fazer perguntas que o auxiliem?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Aceita opiniões divergentes da sua com facilidade e respeito?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'É um exemplo para todos ao defender os valores da empresa?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Empenha-se para que os resultados do grupo sejam os melhores possíveis?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'É autoconfiante?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Demonstra autonomia para decidir?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Sabe administrar o tempo para superar seus desafios?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Sabe se comunicar de forma clara e coesa?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Utiliza técnicas administrativas para melhorar o ambiente e a colaboração no trabalho?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Procura auxiliar na redução de despesas e desperdícios?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Coloca as necessidades da empresa à frente das próprias?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Está disposto a aceitar riscos?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Desiste com facilidade ao primeiro sinal de dificuldade?');
insert into questao (tipo_questao, descricao) values ('ATITUDE', 'Sabe usar os recursos da empresa em prol da produtividade de seu trabalho?');



insert into questionario (descricao) values ('Questionario Técnico Desenvolvimento');
insert into questionario (descricao) values ('Questionario Comportamental Desenvolvimento');

insert into questionario_cargos (questionario_codigo, cargos_codigo) values(1,1);
insert into questionario_cargos (questionario_codigo, cargos_codigo) values(1,2);
insert into questionario_cargos (questionario_codigo, cargos_codigo) values(1,3);
insert into questionario_cargos (questionario_codigo, cargos_codigo) values(2,1);
insert into questionario_cargos (questionario_codigo, cargos_codigo) values(2,2);



insert into questionario_questoes (questionario_codigo, questoes_codigo) values(1,1);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(1,3);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(1,4);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(1,9);

insert into questionario_questoes (questionario_codigo, questoes_codigo) values(2,5);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(2,4);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(2,6);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(2,2);
insert into questionario_questoes (questionario_codigo, questoes_codigo) values(2,10);


insert into avaliacao_questionarios (avaliacao_codigo, questionarios_codigo) values(1,1);
insert into avaliacao_questionarios (avaliacao_codigo, questionarios_codigo) values(1,2);






