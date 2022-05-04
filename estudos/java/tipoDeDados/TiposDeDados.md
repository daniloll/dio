# Tipos de Dado

## 1. Variáveis

- O que são?
- Como podemos usar?
- Algumas informações sobre a nomemclatura


- **O que são?**

Em linguagem de programação, como Java, uma variável é sinônimo de espaço em memória. Imagine a memória do seu
computador, se separarmos uma certa quantidade de memória para armazenarmos números, nomes ou outro tipo de dado e batizarmos
ela com um nome; essa quantidade de memória reservada e nomeada é um exemplo de uma variável. Alem disto, esse nome
variável não é atoa, quer dizer que esse espaço de memória pode ser preenchida por valores diferentes em outros momentos

- **Como podemos usar?**

Para utilizarmos as variáveis, primeiro precisamos dizer ao computador que reserve
um espaço da sua memória para utilizarmos como uma variável, isso é o que chamamos
de declaração da variável; em seguinda podemos armazenar valores dentro desta variável,
é o que chamamos de atribuição de valores. Em java podemos, tambem, fazer os dois processo
conjuntamente, é o que chamaos de inicialização da variável, que é uma atribuição 
no momento da declaração.

Exemplo de Declaração de uma variavel em java

{visibilidade} {modificador de acesso} {tipo} {nome}


- Algumas informações sobre a nomemclatura

```java
1 public class MinhaClasse{
2
3    private final double MINHA_CONSTANTE = 2.5;
4    public static int variavelUm;
5    public int variavelDois;
6
7    public static void main(String[] args){
8        int variavelNova;
9    }
10 } 
```
## 2. Tipos de Dado