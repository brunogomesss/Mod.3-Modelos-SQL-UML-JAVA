create DATABASE AgenciaBG;

USE AgenciaBG;

CREATE TABLE Cliente (
    id_cliente INTEGER PRIMARY KEY,
    nome_cliente VARCHAR (30),
    cpf_cliente INTEGER,
    nasc_cliente DATE,
    endereco_cliente VARCHAR (30),
    contato_cliente INTEGER,
    email_cliente VARCHAR (30)
);

CREATE TABLE viagem (
    id_viagem INTEGER PRIMARY KEY,
    destino VARCHAR (30),
    tipo_transporte VARCHAR (30),
    data_ida DATE,
    data_volta DATE,
    local_partida VARCHAR(30),
    valor_viagem INTEGER
);

CREATE TABLE Compra (
    id_cliente INTEGER,
    id_viagem INTEGER
);
 
