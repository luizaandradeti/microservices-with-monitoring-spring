CREATE TABLE chamados (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	titulo VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;

INSERT INTO chamados (titulo) values ('DNS');
INSERT INTO chamados (titulo) values ('Storage');
INSERT INTO chamados (titulo) values ('Rede');



CREATE TABLE atendimentos (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(50) NOT NULL,
	prazo INT(10) NOT NULL,
	id_chamado BIGINT NOT NULL,
	FOREIGN KEY (id_chamado) REFERENCES chamados(id)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4;


INSERT INTO atendimentos values (1, 'roteamento falho' , 2, 1);
INSERT INTO atendimentos  values (2, 'Disco não salva' , 2, 2);
INSERT INTO atendimentos  values (3, 'timeout' , 2, 3);
INSERT INTO atendimentos values (4, 'roteamento com bloqueio' , 2, 1);
INSERT INTO atendimentos  values (5, 'Disco não abre' , 2, 2);
INSERT INTO atendimentos  values (6, 'vpn travada' , 2, 3);
