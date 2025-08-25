# Projeto Morelli - Sistema Legado

## Descrição do Sistema

O Morelli é um jogo de tabuleiro digital implementado em Java, desenvolvido como parte de um projeto acadêmico. O jogo é baseado em um tabuleiro circular com múltiplas faixas concêntricas, onde dois jogadores competem movimentando peças em direção ao centro do tabuleiro.

## Como Executar

terminar

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

