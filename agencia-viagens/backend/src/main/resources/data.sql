DROP TABLE IF EXISTS telefones;
DROP TABLE IF EXISTS usuarios;

-- Criação da tabela de usuários
CREATE TABLE IF NOT EXISTS usuarios (
    id_usuario BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    ativo BOOLEAN NOT NULL
);

-- Criação da tabela de telefones
CREATE TABLE IF NOT EXISTS telefones (
    id_telefone BIGINT PRIMARY KEY AUTO_INCREMENT,
    id_usuario BIGINT NOT NULL,
    numero VARCHAR(50) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
   constraint fk_telefones_usuarios FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario) ON DELETE CASCADE
);

-- primary key (orders_id),
--  constraint fk_orders_merchant 	foreign key (merchant_merchant_id) 	references merchant (merchant_id),


-- Inserção de registros na tabela de usuários
INSERT INTO usuarios (nome, email, ativo) VALUES
('João Silva', 'joao.silva@example.com', TRUE),
('Maria Oliveira', 'maria.oliveira@example.com', TRUE),
('Carlos Almeida', 'carlos.almeida@example.com', FALSE),
('Ana Costa', 'ana.costa@example.com', TRUE),
('Lucas Pereira', 'lucas.pereira@example.com', FALSE);

-- Inserção de registros na tabela de telefones
INSERT INTO telefones (id_usuario, numero, tipo) VALUES
(1, '+5511987654321', 'phone'),
(2, '+5511976543210', 'phone'),
(3, '+5511965432109', 'whatsapp'),
(4, '+5511954321098', 'telegram'),
(5, '+5511943210987', 'phone');

-- Consulta para visualizar os usuários e seus telefones
SELECT u.id_usuario, u.nome, u.email, u.ativo, t.numero AS telefone
FROM usuarios u
LEFT JOIN telefones t ON u.id_usuario = t.id_usuario;
