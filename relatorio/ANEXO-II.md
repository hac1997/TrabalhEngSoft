### ANEXO II - CÓDIGOS MORTOS OU DUPLICADOS

#### Código repetido
Na classe Tabuleiro:

Há repetição de código nas linhas 302-318 e 327-343 da classe Tabuleiro:
```
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
 adjacentes[7] = posicao;}

```
Na classe Tabuleiro:

Há indicação de código repetido nas linhs 407-408 e 403-404

```       
lado += lado;
vertice = posicoes[(indice + lado) % numPosicoes];    
```

Foram encontradas 3 duplicadas em faixa
```
 Posicao posicao = new Posicao(ordem, linha, coluna);
 this.addPosicao(posicao, i);
 i++;
```

### Código Morto

As classes não utilizadas encontram-se no ANEXO I.

A Classe ImagemDeTabuleiro.java está completamente não implementada, além de não ser usada em lugar nenhum.

Dentro da classe JogadaMorelli.java temos o seguinte código comentado:
```
//    public boolean[] getMapaPretas() {
//        return this.mapaPretas;
//    }
```

Em NetGames.java, temos o seguinte método não implementado:
```
@Override
public void tratarPartidaNaoIniciada(String message) {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

- Métodos com apenas `throw new UnsupportedOperationException()`
- Comentários de código antigo em `AtorJogador.java`
```

Na classe Posicao.java, temos alguns métodos não implementados:
```
    public void setAdjacentes() {
        // TODO - implement Posicao.setAdjacentes
        throw new UnsupportedOperationException();
    }
    
    [...]
    
    public Posicao verificarAdjacentes(Posicao adjacente) {
        // TODO - implement Posicao.verificarAdjacentes
        throw new UnsupportedOperationException();
    }
    
    [...]

    public boolean possuiAdjacentesCorOposta(Posicao posicao) {
        // TODO - implement Posicao.possuiAdjacentesCorOposta
        throw new UnsupportedOperationException();
    }
    
    [...]
    
    public boolean verficarCaminho(Posicao origem, Posicao destino) {
        // TODO - implement Posicao.verficarCaminho
        throw new UnsupportedOperationException();
    }
```
Na classe Tabuleiro:

```
    public Faixa recuperarFaixaDaPosicao() {
        // TODO - implement Tabuleiro.recuperarFaixaDaPosicao
        throw new UnsupportedOperationException();
    }
```