### ANEXO III - Identificar código de alta complexidade

Na classe Tabuleiro vemos a seguinte monstruosidade:

``` 
public void calcularCaptura(Posicao destino) {
        try {
            boolean cor = destino.getCor();

            Posicao[] posicoes = verificarAdjacentes(destino);

            for (int i = 0; i < posicoes.length; i++) {
                Posicao posicao = posicoes[i];
                if (posicao != null) {
                    if (posicao.isOcupada()) {
                        if (posicao.getCor() != cor) {
                            Posicao[] adjacentes = verificarAdjacentes(posicao);
                            for (int j = 0; j < adjacentes.length; j++) {
                                Posicao adjacente = adjacentes[j];
                                if (adjacente != null) {
                                    if (destino.equals(adjacente)) {
                                        Posicao oposta = adjacentes[(j + 4) % 8];
                                        if (oposta != null) {
                                            if (oposta.getCor() == cor) {
                                                posicao.setCor(cor);
                                                atualizarPosicaoTabuleiro(posicao);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            atorJogador.notificar(e + " calcularCaptura");
        }
    }
```
Ainda dentro de Tabuleiro temos o seguinte (que se repete mais duas vezes dentro do código):
```
try {
            Posicao[] posicoes = tabuleiro[faixaSuperior].getPosicoes();
            for (Posicao posicao : posicoes) {
                if (posicao != null) {
                    if (posicao.isOcupada() && posicao.getCor() != cor) {
                        if (posicao.getLinha() == linha - 1 && posicao.getColuna() == coluna - 1) {
                            adjacentes[0] = posicao;
                        } else if (posicao.getLinha() == linha - 1 && posicao.getColuna() == coluna) {
                            adjacentes[1] = posicao;
                        } else if (posicao.getLinha() == linha - 1 && posicao.getColuna() == coluna + 1) {
                            adjacentes[2] = posicao;
                        } else if (posicao.getLinha() == linha && posicao.getColuna() == coluna + 1) {
                            adjacentes[3] = posicao;
                        } else if (posicao.getLinha() == linha + 1 && posicao.getColuna() == coluna + 1) {
                            adjacentes[4] = posicao;
                        } else if (posicao.getLinha() == linha + 1 && posicao.getColuna() == coluna) {
                            adjacentes[5] = posicao;
                        } else if (posicao.getLinha() == linha + 1 && posicao.getColuna() == coluna - 1) {
                            adjacentes[6] = posicao;
                        } else if (posicao.getLinha() == linha && posicao.getColuna() == coluna - 1) {
                            adjacentes[7] = posicao;
                        }
                    }
                }
            }
```

Temos ainda o seguinte código dentro dessa mesma classe:

```
        try {
            Posicao vertice = posicoes[(indice + lado) % numPosicoes];
            if (vertice.isOcupada()) {
                if (vertice.getCor() == cor) {
                    lado += lado;
                    vertice = posicoes[(indice + lado) % numPosicoes];
                    if (vertice.isOcupada()) {
                        if (vertice.getCor() == cor) {
                            lado += lado;
                            vertice = posicoes[(indice + lado) % numPosicoes];
                            if (vertice.isOcupada()) {
                                if (vertice.getCor() == cor) {
                                    Posicao tronoTomado = trono.posicoes[0];
                                    tronoTomado.setCor(cor);
                                    tronoTomado.posicionarPeca(cor);
                                    atualizarPosicaoTabuleiro(tronoTomado);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            atorJogador.notificar(e + " calcularTomadaTrono");
        }
```


Em AtorJogador temos o seguinte:

```
 public void enviarJogada(TipoJogada tipoJogada) {

        if (daVez && tabuleiro.isPartidaEmAndamento()) {
            setDaVez(false);
            tela.setPainel(msgs.getString("WaitUntilYourOpponentHasPlayed"));
            JogadaMorelli jogada;

            if (null != tipoJogada) {
                switch (tipoJogada) {
                    case realizarAcordo:
                        jogada = new JogadaMorelli(TipoJogada.realizarAcordo);
                        netGames.enviarJogada(jogada);
                        break;
                    case acordoAceito:
                        jogada = new JogadaMorelli(TipoJogada.acordoAceito);
                        netGames.enviarJogada(jogada);
                        netGames.finalizarPartida();
                        break;
                    case acordoNegado:
                        jogada = new JogadaMorelli(TipoJogada.acordoNegado);
                        netGames.enviarJogada(jogada);
                        break;
                    case abandonarPartida:
                        jogada = new JogadaMorelli(TipoJogada.abandonarPartida);
                        netGames.enviarJogada(jogada);
                        break;
                    case atualizarTabuleiro:
                        jogada = new JogadaMorelli(TipoJogada.atualizarTabuleiro, tabuleiroAtualizado);
                        netGames.enviarJogada(jogada);
                        break;
                    default:
                        jogada = new JogadaMorelli(TipoJogada.encerramento);
                        String msg = msgs.getString("TheMatchIsOver");
                        notificar(msg);
                        netGames.finalizarPartida();
                        break;
                }

            }
        }
    }
```
