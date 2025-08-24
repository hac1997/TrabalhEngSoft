# Projeto Morelli - Sistema Legado

## Descrição do Projeto

O Morelli é um jogo de tabuleiro digital implementado em Java, desenvolvido como parte de um projeto acadêmico. O jogo é baseado em um tabuleiro circular com múltiplas faixas concêntricas, onde dois jogadores competem movimentando peças em direção ao centro do tabuleiro.

## Estrutura do Projeto

### Arquitetura Geral
O projeto segue uma arquitetura em camadas com separação clara de responsabilidades:

- **Entidades**: Classes que representam os objetos do domínio do jogo
- **Interface Gráfica**: Componentes visuais e interação com o usuário
- **Rede**: Comunicação multiplayer através do framework NetGames

### Principais Componentes

#### Entidades (`src/entidades/`)
- **`Tabuleiro.java`**: Classe principal que gerencia o estado do jogo, regras de movimento e lógica de captura
- **`Faixa.java`**: Representa cada faixa concêntrica do tabuleiro com suas posições
- **`Posicao.java`**: Representa uma posição específica no tabuleiro
- **`Jogador.java`**: Representa um jogador com suas características (nome, cor das peças, etc.)
- **`JogadaMorelli.java`**: Encapsula uma jogada realizada no jogo
- **`NetGames.java`**: Gerencia a comunicação em rede entre os jogadores

#### Interface Gráfica (`src/interfaceGrafica/`)
- **`AtorJogador.java`**: Controlador principal que coordena a interação entre interface e lógica
- **`TelaJogador.java`**: Interface gráfica principal do jogo (arquivo .form não visível)

#### Recursos
- **Internacionalização**: Suporte a múltiplos idiomas (português e inglês)
- **Imagens**: Recursos visuais para peças brancas e pretas

## Regras do Jogo

### Objetivo
O objetivo é mover as peças em direção ao centro do tabuleiro, capturando peças adversárias no processo.

### Tabuleiro
- Tabuleiro circular com 7 faixas concêntricas (numeradas de 0 a 6)
- Faixa 0: Centro do tabuleiro (trono)
- Faixas 1-6: Faixas externas com número crescente de posições
- Cada faixa possui uma cor específica (roxo, azul escuro, azul claro, verde, amarelo, laranja, vermelho)

### Movimentação
- As peças só podem se mover em direção ao centro (faixas de menor numeração)
- Movimento permitido em linhas ortogonais (horizontal/vertical) ou diagonais
- Deve existir pelo menos uma posição livre em uma faixa interior na direção do movimento

### Captura
- Peças são capturadas quando ficam "espremidas" entre duas peças adversárias
- A captura ocorre quando uma peça adversária fica entre duas peças do jogador atual

### Vitória
- Conquista do trono (centro do tabuleiro)
- Captura de todas as peças adversárias

## Funcionalidades Implementadas

### Multiplayer
- Suporte a jogos online através do framework NetGames
- Comunicação cliente-servidor
- Sincronização de estado entre jogadores

### Interface
- Interface gráfica intuitiva
- Suporte a internacionalização (PT-BR e EN-US)
- Sistema de ajuda integrado
- Notificações de jogadas irregulares

### Controles do Jogo
- **Conectar**: Estabelece conexão com o servidor
- **Iniciar Partida**: Inicia uma nova partida
- **Realizar Acordo**: Propõe empate
- **Abandonar Partida**: Abandona a partida atual
- **Desconectar**: Encerra conexão com servidor
- **Ajuda**: Exibe instruções do jogo

## Tecnologias Utilizadas

- **Java**: Linguagem principal de desenvolvimento
- **Swing**: Framework para interface gráfica
- **NetBeans**: IDE de desenvolvimento
- **NetGames Framework**: Framework para jogos multiplayer
- **Internacionalização Java**: Suporte a múltiplos idiomas

## Estrutura de Arquivos

```
Morelli_v0.1.1/
├── src/
│   ├── entidades/          # Classes do domínio
│   ├── interfaceGrafica/   # Interface do usuário
│   ├── mensagens/          # Arquivos de internacionalização
│   └── morelli/           # Classe principal
├── dist/                  # Arquivos de distribuição
├── nbproject/            # Configurações do NetBeans
└── build.xml             # Script de build Ant
```

## Como Executar

1. **Pré-requisitos**:
   - Java 8 ou superior
   - NetBeans IDE (recomendado)

2. **Compilação**:
   ```bash
   ant compile
   ```

3. **Execução**:
   ```bash
   java -jar dist/Morelli.jar
   ```

## Versão Atual

**Versão 0.1.1** - Inclui suporte à internacionalização

## Características do Sistema Legado

Este projeto representa um sistema legado com as seguintes características:

- **Tecnologia**: Java Swing (tecnologia mais antiga para interfaces gráficas)
- **IDE**: NetBeans com configurações específicas da época
- **Arquitetura**: Padrão MVC adaptado para jogos
- **Dependências**: Frameworks específicos (NetGames) que podem não estar mais em desenvolvimento ativo
- **Documentação**: Limitada, típica de projetos acadêmicos da época

## Considerações para Modernização

Para modernizar este sistema legado, seria recomendável:

1. **Migração de Interface**: De Swing para JavaFX ou tecnologias web
2. **Atualização de Dependências**: Substituir frameworks descontinuados
3. **Melhoria da Arquitetura**: Implementar padrões mais modernos (MVVM, Clean Architecture)
4. **Testes Automatizados**: Adicionar cobertura de testes unitários e integração
5. **Documentação**: Expandir documentação técnica e de usuário
6. **Build System**: Migrar de Ant para Maven ou Gradle

## Licença

Projeto acadêmico desenvolvido para fins educacionais.