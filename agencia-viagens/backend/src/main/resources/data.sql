DROP TABLE usuarios;

-- Criação da tabela
CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefone VARCHAR(50) NOT NULL,
    ativo BOOLEAN NOT NULL
);

-- Inserção de registros
INSERT INTO usuarios (nome, email, telefone, ativo) VALUES
('João Silva', 'joao.silva@example.com', '+5511987654321', TRUE),
('Maria Oliveira', 'maria.oliveira@example.com', '+5511976543210', TRUE),
('Carlos Almeida', 'carlos.almeida@example.com', '+5511965432109', FALSE),
('Ana Costa', 'ana.costa@example.com', '+5511954321098', TRUE),
('Lucas Pereira', 'lucas.pereira@example.com', '+5511943210987', FALSE);

SELECT * FROM usuarios;