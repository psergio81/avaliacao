insert into avaliacao (data_inicio, data_fim, descricao, titulo) values ('2014-01-01', '2014-01-31', 'Avaliação do Desenvolvimento', 'Avaliação 1° Sem/2014');

insert into avaliacao_detalhe(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'OPERACIONAL', 2, 3, 'ALEATORIA', 1)
insert into avaliacao_detalhe(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'LIDERANCA', 4, 2, 'ALEATORIA', 1)
insert into avaliacao_detalhe(nivel_avaliado, nivel_avaliador, peso_avaliador, quantidade_avaliadores, tipo_selecao, avaliacao_id) values ('OPERACIONAL', 'GERENCIA', 4, 1, 'ALEATORIA', 1)


 insert into colaborador(email, nivel_hierarquico, nome) values ('gerente@avalia.com', 'GERENCIA', 'Gerente');
 insert into colaborador(email, nivel_hierarquico, nome) values ('desenvolvedor@avalia.com', 'OPERACIONAL', 'Desenvolvedor');
insert into colaborador(email, nivel_hierarquico, nome) values ('desenvolvedorx@avalia.com', 'OPERACIONAL', 'Desenvolvedor II');
insert into colaborador(email, nivel_hierarquico, nome) values ('qa@avalia.com', 'OPERACIONAL', 'Qualidade');
insert into colaborador(email, nivel_hierarquico, nome) values ('qa@avalia.com', 'OPERACIONAL', 'QA II');
insert into colaborador(email, nivel_hierarquico, nome) values ('liderum@avalia.com', 'LIDERANCA', 'Lider I');
insert into colaborador(email, nivel_hierarquico, nome) values ('liderdois@avalia.com', 'LIDERANCA', 'Lider II');