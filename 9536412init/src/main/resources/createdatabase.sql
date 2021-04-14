-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 23, 2021 at 06:13 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Database: `your_database_name`
--

-- --------------------------------------------------------

--
-- Table structure for table `cancelamento`
--

CREATE TABLE `cancelamento` (
  `id` int(11) NOT NULL,
  `data_cancelamento` varchar(255) DEFAULT NULL,
  `hora_cancelamento` varchar(255) DEFAULT NULL,
  `justificativa` varchar(255) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_encerramento`
--

CREATE TABLE `cd_arquivo_encerramento` (
  `encerramento_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_notificacao`
--

CREATE TABLE `cd_arquivo_notificacao` (
  `notificacao_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_publicacao`
--

CREATE TABLE `cd_arquivo_publicacao` (
  `publicacao_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_reinicio`
--

CREATE TABLE `cd_arquivo_reinicio` (
  `reinicio_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_republicacao`
--

CREATE TABLE `cd_arquivo_republicacao` (
  `republicacao_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `cd_arquivo_revogacao`
--

CREATE TABLE `cd_arquivo_revogacao` (
  `revogacao_id` int(11) NOT NULL,
  `cd_arquivo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `detalhe_licitacao`
--

CREATE TABLE `detalhe_licitacao` (
  `id` int(11) NOT NULL,
  `ano_licitacao` varchar(255) DEFAULT NULL,
  `cd_tipo_fase_atual` varchar(255) DEFAULT NULL,
  `ds_objeto` varchar(255) DEFAULT NULL,
  `nr_licitacao` varchar(255) DEFAULT NULL,
  `nr_processo` varchar(255) DEFAULT NULL,
  `anulacao` varchar(255) DEFAULT NULL,
  `aplicar10024` bit(1) NOT NULL,
  `aplicar147` bit(1) NOT NULL,
  `apresenta_valor_referencia` bit(1) NOT NULL,
  `beneficio_local` bit(1) NOT NULL,
  `casas_decimais` int(11) DEFAULT NULL,
  `data_abertura_propostas` varchar(255) DEFAULT NULL,
  `data_final_propostas` varchar(255) DEFAULT NULL,
  `data_inicio_propostas` varchar(255) DEFAULT NULL,
  `data_limite_impugnacao` varchar(255) DEFAULT NULL,
  `exclusivompe` bit(1) NOT NULL,
  `exige_carona` bit(1) NOT NULL,
  `exige_garantia` bit(1) NOT NULL,
  `hora_abertura_propostas` varchar(255) DEFAULT NULL,
  `hora_final_propostas` varchar(255) DEFAULT NULL,
  `hora_inicio_propostas` varchar(255) DEFAULT NULL,
  `hora_limite_impugnacao` varchar(255) DEFAULT NULL,
  `id_licitacao` int(11) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `prazo_validade` varchar(255) DEFAULT NULL,
  `separar_por_lotes` bit(1) NOT NULL,
  `situacao` varchar(255) DEFAULT NULL,
  `tipo_intervalo_lance` varchar(255) DEFAULT NULL,
  `tratamento_fase_lance` varchar(255) DEFAULT NULL,
  `valor_intervalo_lance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `duvida`
--

CREATE TABLE `duvida` (
  `id` int(11) NOT NULL,
  `hora_duvida` varchar(255) DEFAULT NULL,
  `data_duvida` varchar(255) DEFAULT NULL,
  `data_resposta` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `duvida` varchar(4000) DEFAULT NULL,
  `hora_resposta` varchar(255) DEFAULT NULL,
  `resposta` varchar(4000) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `encerramento`
--

CREATE TABLE `encerramento` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `erro`
--

CREATE TABLE `erro` (
  `id` int(11) NOT NULL,
  `erro` bit(1) NOT NULL,
  `mensagem` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fornecedor`
--

CREATE TABLE `fornecedor` (
  `id` int(11) NOT NULL,
  `id_externo` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `impugnacao`
--

CREATE TABLE `impugnacao` (
  `id` int(11) NOT NULL,
  `anexo` varchar(255) DEFAULT NULL,
  `data_impugnacao` varchar(255) DEFAULT NULL,
  `data_resposta` varchar(255) DEFAULT NULL,
  `hash` varchar(255) DEFAULT NULL,
  `hash_anexo` varchar(255) DEFAULT NULL,
  `hora_impugnacao` varchar(255) DEFAULT NULL,
  `hora_resposta` varchar(255) DEFAULT NULL,
  `julgamento` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `pedido` varchar(255) DEFAULT NULL,
  `resultado_julgamento` varchar(255) DEFAULT NULL,
  `texto_impugnacao` varchar(4000) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `url_anexo` varchar(255) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL,
  `impugnante_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `impugnante`
--

CREATE TABLE `impugnante` (
  `id` int(11) NOT NULL,
  `razao_social` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cd_municipio_ibge` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `cnpj` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `declaracao_me` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `inscricao_estadual` varchar(255) DEFAULT NULL,
  `inscricao_municipal` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `nome_fantasia` varchar(255) DEFAULT NULL,
  `registro` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL,
  `impugnacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `inabilitado`
--

CREATE TABLE `inabilitado` (
  `id` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `id_fornecedor` varchar(255) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL,
  `justificativa` varchar(4000) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `id` int(11) NOT NULL,
  `cd_boleanodexclusivo` bit(1) NOT NULL,
  `descricao_item` varchar(4000) DEFAULT NULL,
  `id_externo` varchar(255) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL,
  `numero_item` int(11) DEFAULT NULL,
  `numero_lote` int(11) DEFAULT NULL,
  `quantidade_item` int(11) DEFAULT NULL,
  `sg_unidade_medida` varchar(255) DEFAULT NULL,
  `valor_unitario_estimado` double NOT NULL,
  `lote_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lance`
--

CREATE TABLE `lance` (
  `id` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `id_fornecedor` varchar(255) DEFAULT NULL,
  `justificativa` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `valido` bit(1) NOT NULL,
  `valor_total` double NOT NULL,
  `valor_unitario` double NOT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `licitacao`
--

CREATE TABLE `licitacao` (
  `id` int(11) NOT NULL,
  `comprador` varchar(255) DEFAULT NULL,
  `id_licitacao` int(11) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `requisicao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lote`
--

CREATE TABLE `lote` (
  `id` int(11) NOT NULL,
  `cd_boleanoddivisivel` bit(1) NOT NULL,
  `descricao_lote` varchar(255) DEFAULT NULL,
  `numero_lote` int(11) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mensagem_chat`
--

CREATE TABLE `mensagem_chat` (
  `id` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `frase` varchar(4000) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mensagem_pregoeiro`
--

CREATE TABLE `mensagem_pregoeiro` (
  `id` int(11) NOT NULL,
  `assunto` varchar(250) DEFAULT NULL,
  `data_envio` varchar(255) DEFAULT NULL,
  `hora_envio` varchar(255) DEFAULT NULL,
  `mensagem` varchar(4000) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `notificacao`
--

CREATE TABLE `notificacao` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `proposta`
--

CREATE TABLE `proposta` (
  `id` int(11) NOT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhamento` varchar(4000) DEFAULT NULL,
  `fabricante` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `id_fornecedor` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `validade_proposta` varchar(255) DEFAULT NULL,
  `valido` bit(1) NOT NULL,
  `valor_total` double NOT NULL,
  `valor_unitario` double NOT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `publicacao`
--

CREATE TABLE `publicacao` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reabilitacao`
--

CREATE TABLE `reabilitacao` (
  `id` int(11) NOT NULL,
  `data_reabilitacao` varchar(255) DEFAULT NULL,
  `hora_reabilitacao` varchar(255) DEFAULT NULL,
  `id_fornecedor` varchar(255) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL,
  `justificativa` varchar(4000) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reinicio`
--

CREATE TABLE `reinicio` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `republicacao`
--

CREATE TABLE `republicacao` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `requisicao`
--

CREATE TABLE `requisicao` (
  `id` int(11) NOT NULL,
  `pagina` int(11) DEFAULT NULL,
  `quantidade_total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `reversao`
--

CREATE TABLE `reversao` (
  `id` int(11) NOT NULL,
  `data` varchar(255) DEFAULT NULL,
  `fase` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL,
  `justificativa` varchar(4000) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `revogacao`
--

CREATE TABLE `revogacao` (
  `id` int(11) NOT NULL,
  `cd_tipo_fase` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `detalhe_evento` varchar(255) DEFAULT NULL,
  `evento` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `sigla_licitacon` varchar(255) DEFAULT NULL,
  `tipo_evento` varchar(255) DEFAULT NULL,
  `detalhelicitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `suspensao`
--

CREATE TABLE `suspensao` (
  `id` int(11) NOT NULL,
  `data_suspensao` varchar(255) DEFAULT NULL,
  `hora_suspensao` varchar(255) DEFAULT NULL,
  `justificativa` varchar(255) DEFAULT NULL,
  `motivo_suspensao` varchar(255) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `vencedor`
--

CREATE TABLE `vencedor` (
  `id` int(11) NOT NULL,
  `cancelado` bit(1) NOT NULL,
  `id_fornecedor` varchar(255) DEFAULT NULL,
  `id_item` int(11) DEFAULT NULL,
  `razao_social` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `valor_total` double NOT NULL,
  `valor_unitario` double NOT NULL,
  `fornecedor_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `lote_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cancelamento`
--
ALTER TABLE `cancelamento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKemk8qvremudb4skrvfj4t1ar5` (`detalhe_licitacao_id`);

--
-- Indexes for table `cd_arquivo_encerramento`
--
ALTER TABLE `cd_arquivo_encerramento`
  ADD KEY `FK25l3xmjqfbjee2l6islr1brug` (`encerramento_id`);

--
-- Indexes for table `cd_arquivo_notificacao`
--
ALTER TABLE `cd_arquivo_notificacao`
  ADD KEY `FK6knh0atn9ms6i710vdwew154y` (`notificacao_id`);

--
-- Indexes for table `cd_arquivo_publicacao`
--
ALTER TABLE `cd_arquivo_publicacao`
  ADD KEY `FK45b3tixw0900r5vwd4ls0bhbm` (`publicacao_id`);

--
-- Indexes for table `cd_arquivo_reinicio`
--
ALTER TABLE `cd_arquivo_reinicio`
  ADD KEY `FKdd6ymbebpam02v0t41v46gyfx` (`reinicio_id`);

--
-- Indexes for table `cd_arquivo_republicacao`
--
ALTER TABLE `cd_arquivo_republicacao`
  ADD KEY `FKd8ob5ync5hso1wpra8k82sqn7` (`republicacao_id`);

--
-- Indexes for table `cd_arquivo_revogacao`
--
ALTER TABLE `cd_arquivo_revogacao`
  ADD KEY `FKtb3gtjrkm3lwly5f8pbaaiykd` (`revogacao_id`);

--
-- Indexes for table `detalhe_licitacao`
--
ALTER TABLE `detalhe_licitacao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `duvida`
--
ALTER TABLE `duvida`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqppkj6wgmpkl9x6sqf1d43rsu` (`detalhelicitacao_id`);

--
-- Indexes for table `encerramento`
--
ALTER TABLE `encerramento`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKa199ooev6egl43pri82gpafad` (`detalhelicitacao_id`);

--
-- Indexes for table `erro`
--
ALTER TABLE `erro`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `impugnacao`
--
ALTER TABLE `impugnacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbnfk1cbf72f7iadaounaibyt3` (`detalhe_licitacao_id`),
  ADD KEY `FK650xfpf2jq8rwwqdvcv053u4n` (`impugnante_id`);

--
-- Indexes for table `impugnante`
--
ALTER TABLE `impugnante`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7kadf5vq2qhl4hc2txood3kib` (`impugnacao_id`);

--
-- Indexes for table `inabilitado`
--
ALTER TABLE `inabilitado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKo2qxtv3r150tcokj7i7byoup6` (`fornecedor_id`),
  ADD KEY `FKb8yjxwpjxxbje6bs2olhdd4eh` (`item_id`),
  ADD KEY `FK6peenbor0lmgg7pi5sg946d17` (`lote_id`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKc72xampbk1et6x60ks6wu8ppj` (`lote_id`);

--
-- Indexes for table `lance`
--
ALTER TABLE `lance`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKk2db6gmgol0gyx9nfkq5webh1` (`fornecedor_id`),
  ADD KEY `FKctobws79noyy010exda09lr4k` (`item_id`);

--
-- Indexes for table `licitacao`
--
ALTER TABLE `licitacao`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_4wj8uafetdb2gpo5jp61dwmg7` (`id_licitacao`),
  ADD KEY `FKs3ckpngir9nro1h02jdfdwpxw` (`requisicao_id`);

--
-- Indexes for table `lote`
--
ALTER TABLE `lote`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKeguvacd4rdpqcu6wur3aa7yhg` (`detalhe_licitacao_id`);

--
-- Indexes for table `mensagem_chat`
--
ALTER TABLE `mensagem_chat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3byc4dlaywicafpk0tar3erqn` (`detalhe_licitacao_id`);

--
-- Indexes for table `mensagem_pregoeiro`
--
ALTER TABLE `mensagem_pregoeiro`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7sh9sreb8nmhbfr4xhqn5pa34` (`detalhe_licitacao_id`);

--
-- Indexes for table `notificacao`
--
ALTER TABLE `notificacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbd1mte8daqbolynj58ntx6m4k` (`detalhelicitacao_id`);

--
-- Indexes for table `proposta`
--
ALTER TABLE `proposta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKos6ax5hucfdhxwgwlm2mpxssk` (`fornecedor_id`),
  ADD KEY `FKmig48ylw93pv20tcciquhcefq` (`item_id`);

--
-- Indexes for table `publicacao`
--
ALTER TABLE `publicacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9322ppd840ieut0w2pwamtm4o` (`detalhelicitacao_id`);

--
-- Indexes for table `reabilitacao`
--
ALTER TABLE `reabilitacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKc5ep5tkv75lxsfd4r8f8e5x5c` (`fornecedor_id`),
  ADD KEY `FKods4c6qvqcugmchjny7f0w1c6` (`item_id`),
  ADD KEY `FKpxg5wbh61cl4iywqyaqvvh87k` (`lote_id`);

--
-- Indexes for table `reinicio`
--
ALTER TABLE `reinicio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnb14rysj5n18qxkr3vu3c81v6` (`detalhelicitacao_id`);

--
-- Indexes for table `republicacao`
--
ALTER TABLE `republicacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK78n7dxu178iqf7wjqgclqmh2l` (`detalhelicitacao_id`);

--
-- Indexes for table `requisicao`
--
ALTER TABLE `requisicao`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reversao`
--
ALTER TABLE `reversao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKenb1uscicdygar9wwna6ramj8` (`item_id`),
  ADD KEY `FKs0tvo4gfd24tc2ue6r06vv2m1` (`lote_id`);

--
-- Indexes for table `revogacao`
--
ALTER TABLE `revogacao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKb49psr39q2qlk5kdtyumeyb07` (`detalhelicitacao_id`);

--
-- Indexes for table `suspensao`
--
ALTER TABLE `suspensao`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKguqwwv03b86k2jx2gr8ix18se` (`detalhe_licitacao_id`);

--
-- Indexes for table `vencedor`
--
ALTER TABLE `vencedor`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK8rto18klmke0bxo662rymq1l4` (`fornecedor_id`),
  ADD KEY `FKjr06dr742o7cmjex0gp8heljr` (`item_id`),
  ADD KEY `FK94r4npwg2xu45l43l860sjt27` (`lote_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cancelamento`
--
ALTER TABLE `cancelamento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `detalhe_licitacao`
--
ALTER TABLE `detalhe_licitacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `duvida`
--
ALTER TABLE `duvida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `encerramento`
--
ALTER TABLE `encerramento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `erro`
--
ALTER TABLE `erro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `impugnacao`
--
ALTER TABLE `impugnacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `impugnante`
--
ALTER TABLE `impugnante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inabilitado`
--
ALTER TABLE `inabilitado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lance`
--
ALTER TABLE `lance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `licitacao`
--
ALTER TABLE `licitacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lote`
--
ALTER TABLE `lote`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mensagem_chat`
--
ALTER TABLE `mensagem_chat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mensagem_pregoeiro`
--
ALTER TABLE `mensagem_pregoeiro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `notificacao`
--
ALTER TABLE `notificacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `proposta`
--
ALTER TABLE `proposta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `publicacao`
--
ALTER TABLE `publicacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reabilitacao`
--
ALTER TABLE `reabilitacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reinicio`
--
ALTER TABLE `reinicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `republicacao`
--
ALTER TABLE `republicacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `requisicao`
--
ALTER TABLE `requisicao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reversao`
--
ALTER TABLE `reversao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `revogacao`
--
ALTER TABLE `revogacao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `suspensao`
--
ALTER TABLE `suspensao`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vencedor`
--
ALTER TABLE `vencedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cancelamento`
--
ALTER TABLE `cancelamento`
  ADD CONSTRAINT `FKemk8qvremudb4skrvfj4t1ar5` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `cd_arquivo_encerramento`
--
ALTER TABLE `cd_arquivo_encerramento`
  ADD CONSTRAINT `FK25l3xmjqfbjee2l6islr1brug` FOREIGN KEY (`encerramento_id`) REFERENCES `encerramento` (`id`);

--
-- Constraints for table `cd_arquivo_notificacao`
--
ALTER TABLE `cd_arquivo_notificacao`
  ADD CONSTRAINT `FK6knh0atn9ms6i710vdwew154y` FOREIGN KEY (`notificacao_id`) REFERENCES `notificacao` (`id`);

--
-- Constraints for table `cd_arquivo_publicacao`
--
ALTER TABLE `cd_arquivo_publicacao`
  ADD CONSTRAINT `FK45b3tixw0900r5vwd4ls0bhbm` FOREIGN KEY (`publicacao_id`) REFERENCES `publicacao` (`id`);

--
-- Constraints for table `cd_arquivo_reinicio`
--
ALTER TABLE `cd_arquivo_reinicio`
  ADD CONSTRAINT `FKdd6ymbebpam02v0t41v46gyfx` FOREIGN KEY (`reinicio_id`) REFERENCES `reinicio` (`id`);

--
-- Constraints for table `cd_arquivo_republicacao`
--
ALTER TABLE `cd_arquivo_republicacao`
  ADD CONSTRAINT `FKd8ob5ync5hso1wpra8k82sqn7` FOREIGN KEY (`republicacao_id`) REFERENCES `republicacao` (`id`);

--
-- Constraints for table `cd_arquivo_revogacao`
--
ALTER TABLE `cd_arquivo_revogacao`
  ADD CONSTRAINT `FKtb3gtjrkm3lwly5f8pbaaiykd` FOREIGN KEY (`revogacao_id`) REFERENCES `revogacao` (`id`);

--
-- Constraints for table `duvida`
--
ALTER TABLE `duvida`
  ADD CONSTRAINT `FKqppkj6wgmpkl9x6sqf1d43rsu` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `encerramento`
--
ALTER TABLE `encerramento`
  ADD CONSTRAINT `FKa199ooev6egl43pri82gpafad` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `impugnacao`
--
ALTER TABLE `impugnacao`
  ADD CONSTRAINT `FK650xfpf2jq8rwwqdvcv053u4n` FOREIGN KEY (`impugnante_id`) REFERENCES `impugnante` (`id`),
  ADD CONSTRAINT `FKbnfk1cbf72f7iadaounaibyt3` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `impugnante`
--
ALTER TABLE `impugnante`
  ADD CONSTRAINT `FK7kadf5vq2qhl4hc2txood3kib` FOREIGN KEY (`impugnacao_id`) REFERENCES `impugnacao` (`id`);

--
-- Constraints for table `inabilitado`
--
ALTER TABLE `inabilitado`
  ADD CONSTRAINT `FK6peenbor0lmgg7pi5sg946d17` FOREIGN KEY (`lote_id`) REFERENCES `lote` (`id`),
  ADD CONSTRAINT `FKb8yjxwpjxxbje6bs2olhdd4eh` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  ADD CONSTRAINT `FKo2qxtv3r150tcokj7i7byoup6` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`);

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `FKc72xampbk1et6x60ks6wu8ppj` FOREIGN KEY (`lote_id`) REFERENCES `lote` (`id`);

--
-- Constraints for table `lance`
--
ALTER TABLE `lance`
  ADD CONSTRAINT `FKctobws79noyy010exda09lr4k` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  ADD CONSTRAINT `FKk2db6gmgol0gyx9nfkq5webh1` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`);

--
-- Constraints for table `licitacao`
--
ALTER TABLE `licitacao`
  ADD CONSTRAINT `FKs3ckpngir9nro1h02jdfdwpxw` FOREIGN KEY (`requisicao_id`) REFERENCES `requisicao` (`id`);

--
-- Constraints for table `lote`
--
ALTER TABLE `lote`
  ADD CONSTRAINT `FKeguvacd4rdpqcu6wur3aa7yhg` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `mensagem_chat`
--
ALTER TABLE `mensagem_chat`
  ADD CONSTRAINT `FK3byc4dlaywicafpk0tar3erqn` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `mensagem_pregoeiro`
--
ALTER TABLE `mensagem_pregoeiro`
  ADD CONSTRAINT `FK7sh9sreb8nmhbfr4xhqn5pa34` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `notificacao`
--
ALTER TABLE `notificacao`
  ADD CONSTRAINT `FKbd1mte8daqbolynj58ntx6m4k` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `proposta`
--
ALTER TABLE `proposta`
  ADD CONSTRAINT `FKmig48ylw93pv20tcciquhcefq` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  ADD CONSTRAINT `FKos6ax5hucfdhxwgwlm2mpxssk` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`);

--
-- Constraints for table `publicacao`
--
ALTER TABLE `publicacao`
  ADD CONSTRAINT `FK9322ppd840ieut0w2pwamtm4o` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `reabilitacao`
--
ALTER TABLE `reabilitacao`
  ADD CONSTRAINT `FKc5ep5tkv75lxsfd4r8f8e5x5c` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`),
  ADD CONSTRAINT `FKods4c6qvqcugmchjny7f0w1c6` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  ADD CONSTRAINT `FKpxg5wbh61cl4iywqyaqvvh87k` FOREIGN KEY (`lote_id`) REFERENCES `lote` (`id`);

--
-- Constraints for table `reinicio`
--
ALTER TABLE `reinicio`
  ADD CONSTRAINT `FKnb14rysj5n18qxkr3vu3c81v6` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `republicacao`
--
ALTER TABLE `republicacao`
  ADD CONSTRAINT `FK78n7dxu178iqf7wjqgclqmh2l` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `reversao`
--
ALTER TABLE `reversao`
  ADD CONSTRAINT `FKenb1uscicdygar9wwna6ramj8` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
  ADD CONSTRAINT `FKs0tvo4gfd24tc2ue6r06vv2m1` FOREIGN KEY (`lote_id`) REFERENCES `lote` (`id`);

--
-- Constraints for table `revogacao`
--
ALTER TABLE `revogacao`
  ADD CONSTRAINT `FKb49psr39q2qlk5kdtyumeyb07` FOREIGN KEY (`detalhelicitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `suspensao`
--
ALTER TABLE `suspensao`
  ADD CONSTRAINT `FKguqwwv03b86k2jx2gr8ix18se` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);

--
-- Constraints for table `vencedor`
--
ALTER TABLE `vencedor`
  ADD CONSTRAINT `FK8rto18klmke0bxo662rymq1l4` FOREIGN KEY (`fornecedor_id`) REFERENCES `fornecedor` (`id`),
  ADD CONSTRAINT `FK94r4npwg2xu45l43l860sjt27` FOREIGN KEY (`lote_id`) REFERENCES `lote` (`id`),
  ADD CONSTRAINT `FKjr06dr742o7cmjex0gp8heljr` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`);


CREATE TABLE `unidade_compradora` (
  `id` int(11) NOT NULL,
  `cd_municipio_ibge` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `id_comprador` int(11) DEFAULT NULL,
  `id_unidade_compradora` int(11) DEFAULT NULL,
  `nome_comprador` varchar(255) DEFAULT NULL,
  `nome_unidade_compradora` varchar(255) DEFAULT NULL,
  `uf` varchar(255) DEFAULT NULL,
  `detalhe_licitacao_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `unidade_compradora`
--
ALTER TABLE `unidade_compradora`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9hcm4ggwfvv2qb6s0093nlg76` (`detalhe_licitacao_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `unidade_compradora`
--
ALTER TABLE `unidade_compradora`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `unidade_compradora`
--
ALTER TABLE `unidade_compradora`
  ADD CONSTRAINT `FK9hcm4ggwfvv2qb6s0093nlg76` FOREIGN KEY (`detalhe_licitacao_id`) REFERENCES `detalhe_licitacao` (`id`);


ALTER TABLE `mensagem_chat`
	ADD COLUMN `apelido` varchar(255) DEFAULT NULL;



COMMIT;
