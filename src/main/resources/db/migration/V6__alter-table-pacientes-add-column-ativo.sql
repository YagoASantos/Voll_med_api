ALTER TABLE pacientes ADD COLUMN ativo tinyint;
UPDATE pacientes SET ativo = 1;
ALTER TABLE pacientes MODIFY COLUMN ativo tinyint NOT NULL;