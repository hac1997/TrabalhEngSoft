Ao rodar o servidor:

```
/home/herick/.jdks/ms-11.0.28/bin/java -Dfile.encoding=UTF-8 -jar /home/herick/IdeaProjects/a1-hac1997/src/Morelli_v0.1.1/netgames/servidor.jar
ago 24, 2025 11:55:55 AM br.ufsc.inf.leobr.servidor.Server listen
INFORMAÇÕES: Starting client with configuration file server.properties
ago 24, 2025 11:55:55 AM br.ufsc.inf.leobr.servidor.Server listen
INFORMAÇÕES: Logging to /home/herick/.dualrpc/dualrpc_swing_server.log
ago 24, 2025 11:55:55 AM br.ufsc.inf.leobr.servidor.Server listen
INFORMAÇÕES: Forcing use of IPv4
ago 24, 2025 11:55:55 AM br.ufsc.inf.leobr.servidor.Server listen
INFORMAÇÕES: server.host=localhost
ago 24, 2025 11:55:55 AM br.ufsc.inf.leobr.servidor.Server listen
INFORMAÇÕES: server.port=1099
log4j:WARN No appenders could be found for logger (com.retrogui.messageserver.server.MessageServer).
log4j:WARN Please initialize the log4j system properly.
```

Ao instanciar o jogo:
```
/home/herick/.jdks/ms-11.0.28/bin/java -Dfile.encoding=UTF-8 -jar /home/herick/IdeaProjects/a1-hac1997/src/Morelli_v0.1.1/dist/Morelli.jar
log4j:WARN No appenders could be found for logger (br.ufsc.inf.leobr.cliente.util.LerArquivoUtil).
log4j:WARN Please initialize the log4j system properly.
```

Ao conectar ao servidor dentro de uma instância do jogo:

```
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.ServerHandler <init>
INFORMAÇÕES: Objeto de configuração é: br.ufsc.inf.leobr.servidor.Server
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.ServerHandler estabelecerSessao
INFORMAÇÕES: Server: Id de sessão 1449049667 corresponds to client session id: 1646041502
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.Server cadastrarNoJogo
INFORMAÇÕES: Server: Adicionando o jogador aaa no jogo 826358115
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.Jogo <init>
INFORMAÇÕES: Jogo (826358115) criado com sucesso!
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.Server cadastrarNoJogo
INFORMAÇÕES: Server: Jogo 826358115 criado. Número de jogos ativos: 1
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.Jogo incluirJogador
INFORMAÇÕES: Jogador: aaa incluido no jogo (826358115). Numero de jogadores ativos: 1
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.Server cadastrarNoJogo
INFORMAÇÕES: Server: Jogador aaa adicionado no jogo 826358115
ago 24, 2025 11:58:15 AM br.ufsc.inf.leobr.servidor.ServerHandler estabelecerSessao
INFORMAÇÕES: Jogador(aaa): Sessão entre cliente e servidor estabelecida.
```
Quando há uma conexão entre um jogador e o server:

```

INFORMAÇÕES: Server: Adicionando o jogador bb no jogo 891669486
ago 24, 2025 10:58:08 PM br.ufsc.inf.leobr.servidor.Server cadastrarNoJogo
INFORMAÇÕES: Server: Jogo 891669486já está rodando.
ago 24, 2025 10:58:08 PM br.ufsc.inf.leobr.servidor.Jogo incluirJogador
INFORMAÇÕES: Jogador: bb incluido no jogo (891669486). Numero de jogadores ativos: 2
ago 24, 2025 10:58:08 PM br.ufsc.inf.leobr.servidor.Server cadastrarNoJogo
INFORMAÇÕES: Server: Jogador bb adicionado no jogo 891669486
ago 24, 2025 10:58:08 PM br.ufsc.inf.leobr.servidor.ServerHandler estabelecerSessao
INFORMAÇÕES: Jogador(bb): Sessão entre cliente e servidor estabelecida.

```
Cada jogada de um player gera uma mensagem assim:

```
Mensagem recebida no proxy, enviado aos ouvintes:
```
Quando algum jogador tenta efetuar uma jogada:
```
ago 24, 2025 11:21:26 PM br.ufsc.inf.leobr.servidor.ServerHandler enviaJogada
INFORMAÇÕES: Jogador(bb): Tentando efetuar uma jogada.
ago 24, 2025 11:21:26 PM br.ufsc.inf.leobr.servidor.Partida efetuaJogada
INFORMAÇÕES: Jogo(891669486) Partida(1): Efetuando uma jogada enviada pelo jogador bb
ago 24, 2025 11:21:26 PM br.ufsc.inf.leobr.servidor.ServerHandler recebeJogada
INFORMAÇÕES: Jogador(aa): Invocando o método receberJogada no jogador
ago 24, 2025 11:21:26 PM br.ufsc.inf.leobr.servidor.Partida efetuaJogada
INFORMAÇÕES: Jogo(891669486) Partida(1): Jogada efetuada com sucesso pelo jogador bb
```

