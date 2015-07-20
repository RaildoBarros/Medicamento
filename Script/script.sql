create table medicamentos (
	codigo SERIAL NOT NULL,
	nome VARCHAR(50);
	forma_farmaceutica VARCHAR(50),
	marca VARCHAR(50),
	data_validade DATE,
	tipo_medicamento VARCHAR(50),
	descricao VARCHAR(200),
	preco_venda FLOAT,
	preco_compra FLOAT,
	quantidade_em_estoque INTEGER,
	primary key(codigo)
);




