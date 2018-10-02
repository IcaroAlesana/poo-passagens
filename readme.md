# Passagens!
A nota do exercício será dada pela soma da primeira e segunda partes. Este exercício corresponde a metade da segunda nota da disciplina.

## Primeira Parte (0.15)
Fazer um diagrama explicativo da organização do programa.

## Segunda Parte (0.85)
Cada equipe deve escolher uma quantidade de itens abaixo para implementar que a soma de pontos seja no mínimo igual a dez. A somatória será o máximo de nota que o grupo poderá obter na segunda parte. Serão avaliadas a qualidade da solução proposta levando em conta conceitos de OO e adaptações na arquitetura do programa.

1) Fácil - 1 ponto (A, B, E, G)

2) Médio - 3 pontos (C, D, F, H, L)

3) Difícil - 5 pontos (I, J, K)

ex:

Fazer I, J = 10

Fazer C, A, B, K = 10

Fazer A, B, E, G, C, F = 10

Fazer A, C, D, H = 10

### A) Pontuais (Fácil)
- A.1) Criar uma mensagem de saída que diz "programa finalizado".
- A.2) Decidir a visibilidade dos métodos da classe ControleMarcarPassagem.
- A.3) Adicionar três novas cidades como origem e destino.

### B) Visualização de Assentos (Fácil)
- B.1) Mostrar o tipo de assento na escolha de assentos.
- B.2) Mostrar em duas colunas os assentos.

### C) Criar uma Passagem ao marcar uma passagem (Médio)
- C.1) Criar uma passagem ao final do caso de marcar passagem.
- C.2) Depois de criar a passagem, pedir nome e cpf do passageiro ou da passageira.
- C.3) Arrumar classe passageiro para funcionar como especificado.
- C.4) Adicionar o passageiro a passagem.
- C.5) Salvar a passagem no serviço de passagens.

### D) Nova opção: ver passagens (Médio)
- D.1) Criar uma opção no menu inicial "2) ver passagens".
- D.2) Criar um método getInfo() similar ao da classe Parada para listar as propriedades de uma Passagem.
- D.3) Criar um novo controle: ControleListarPassagens. Ele deve permitir ver todas as passagens compradas.
- D.4) Associar o novo controle ao item dois do menu.
- D.5) Adicionar passagens de teste no local adequado para teste.

### E) Mudar visualização de viagens (Fácil)
- E.1) Mostrar somente os assentos vagos de uma viagem no momento em que é possível escolher assento.

### F) Melhorar uso do caso de marcar passagens (Médio)
- F.1) Impedir a escolha de ônibus caso não existir viagens da origem ao destino ao tentar marcar uma passagem.
- F.2) Mostrar uma mensagem de nenhuma viagem encontrada caso não existir viagens da origem ao destino informado.
- F.3) Mostrar quantos assentos livres existem (total) em cada viagem na lista de viagens que passam pela origem e pelo destino informados.

### G) Adicionar uma nova linha (Fácil)
- G.1) Criar uma linha nova que vá de Jaraguá do Sul, passe por Joinville e termine em Curitiba. Horários:
- a) 7:00, 7:40, 9:40
- b) 8:00, 8:40, 10:40
- c) 9:00, 9:40, 11:40
- d) 10:00, 10:35, 12:35
- e) 11:00, 11:40, 13:40

### H) Criar uma nova viagem de dois novos ônibus. (Médio)
- H.1) Criar uma viagem nova qualquer com 20 assentos leitos.
- H.2) Criar uma viagem nova com 10 leitos e 30 semi-leitos.

### I) Criar um controle para listar todas as viagens. (Difícil)
- I.1) Adicionar ao menu como opção 3.
- I.2) Fazer funcionar.
- I.3) Criar uma opção para filtrar somente viagens com assentos leitos.

### J) Carregar passagens iniciais de um arquivo csv. (Difícil)
- J.1) Usar, de preferência o LeitorDeArquivo.java
- J.2) Fazer funcionar.

### K) Adicionar login e senha ao iniciar o programa, usando OO (Difícil)
- K.1) Pré Cadastrar dois usuários.
- K.2) Usar salt e hash.
- K.3) O usuário não deve conseguir logar se usuário e senha não baterem.

### L) Adicione uma data a viagem. (Médio)
- L.1) Adicione atributos para a viagem conseguir lidar com datas.
- L.2) Ajuste as viagens existentes para possuir datas.
- L.3) Faça com que a busca por viagens funcione com uma data também.
