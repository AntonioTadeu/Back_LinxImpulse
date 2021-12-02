CREATE TABLE parcela (
                              id INT NOT NULL,
                              quantidade INT NOT NULL,
                              valor FLOAT NOT NULL
);

CREATE TABLE produto (
                         id INT NOT NULL,
                         nome VARCHAR(90) NOT NULL,
                         foto VARCHAR(550) NOT NULL,
                         preco_antigo FLOAT NOT NULL,
                         preco FLOAT NOT NULL,
                         descricao VARCHAR(250),
                         parcela_id INT NOT NULL
);