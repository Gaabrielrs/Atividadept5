# Atividades-para-Pesquisa-Algoritmos
Atividade de pesquisa Algoritimos 




13 - Descreva o Algoritmo de números primos e o crivo desenvolvido por Eratóstenes.

Eratóstenes foi um matemático grego que viveu entre os anos 276 a.C. até 194 a.C. Ele desenvolveu uma tabela, chamada de “Crivo de Eratóstenes”, onde ele conseguiu determinar, não com uma fórmula, mas com uma tabela os números naturais primos, no nosso exemplo do 0 até o 100; mas que na teoria pode ser feito para todos os números primos; porém, o inconveniente é que quanto maior for o nº primo, mais difícil de aplicar o Crivo de Eratóstenes,

14 - Descreva o Algoritmo de número decimal para binário Para realizar a conversão de decimal para binário, realiza-se a divisão sucessiva por 2 (base do sistema binário).

O resultado da conversão será dado pelo último quociente (MSB) e o agrupamento dos restos de divisão será o número binário.A leitura do resultado é feita do último quociente para o primeiro resto. Sendo assim, o resultado da conversão do número 45 para binário é: 1011012.

15 - Qual é o algoritmo para se calcular a probabilidade de algo acontecer

MAX (A,n)

1 max √ 0

2 para i √1 até n faça

3 se A[i] > max

4 então max √A[i]

5 devolva max

16 - Descreve o que são Grafos e o Algoritmo de Dijkstra

Um grafo é um animal formado por dois conjuntos: um conjunto de coisas chamadas vértices e um conjunto de coisas chamadas arcos; cada arco está associado a dois vértices: o primeiro é a ponta inicial do arco e o segundo é a ponta final. Você pode imaginar que um grafo é um mapa rodoviário idealizado: os vértices são cidades e os arcos são estradas de mão única. O Algoritmo de Dijkstra é um dos algoritmos que calcula o caminho de custo mínimo entre vértices de um grafo. Escolhido um vértice como raiz da busca, este algoritmo calcula o custo mínimo deste vértice para todos os demais vértices do grafo.Ele é bastante simples e com um bom nível de performance. Ele não garante, contudo, a exatidão da solução caso haja a presença de arcos com valores negativos.Este algoritmo parte de uma estimativa inicial para o custo mínimo e vai sucessivamente ajustando esta estimativa. Ele considera que um vértice estará fechado quando já tiver sido obtido um caminho de custo mínimo do vértice tomado como raiz da busca até ele. Caso contrário ele dito estar aberto.
