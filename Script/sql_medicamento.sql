CREATE TABLE usuarios (
  codigo SERIAL,
  usuario VARCHAR(50) NULL,
  senha VARCHAR(50) NULL,
  PRIMARY KEY(codigo)
);

CREATE TABLE medicamentos (
  codigo SERIAL,
  nome VARCHAR(50) NULL,
  forma_farmaceutica VARCHAR(50) NULL,
  marca VARCHAR(50) NULL,
  data_validade DATE NULL,
  tipo_medicamento VARCHAR(50) NULL,
  descricao VARCHAR(200) NULL,
  preco_venda FLOAT NULL,
  preco_compra FLOAT NULL,
  quantidade_em_estoque INTEGER NULL,
  PRIMARY KEY(codigo)
);

CREATE TABLE fornecedores (
  codigo SERIAL,
  nome VARCHAR(50) NULL,
  cnpj VARCHAR(50) NULL,
  PRIMARY KEY(codigo)
);

CREATE TABLE telefones (
  codigo SERIAL,
  fornecedor_codigo INTEGER NOT NULL,
  ddd VARCHAR(50) NULL,
  numero VARCHAR(50) NULL,
  PRIMARY KEY(codigo),
  FOREIGN KEY(fornecedor_codigo)
    REFERENCES fornecedores(codigo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE medicamentos_fornecedores (
  codigo SERIAL,
  fornecedor_codigo INTEGER NOT NULL,
  medicamento_codigo INTEGER NOT NULL,
  PRIMARY KEY(codigo),
  FOREIGN KEY(medicamento_codigo)
    REFERENCES medicamentos(codigo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(fornecedor_codigo)
    REFERENCES fornecedores(codigo)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);


