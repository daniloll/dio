# Entendendo os Métodos

## 1. Métodos

- O que são?
- Como podemos usar?
- Tipos
- Sobrecargas
- Retornos


- **O que são?**

Podemos dizer que um Metodo é uma parte, bem definida, do código, responsável por uma atividade específica.
Ele deve pertencer a uma classe e devem refletir uma  acao ou comportamento desta classe, ou seja, um método
é uma sub-parte do código que tem uma competencia.

``` 
Em linguagens de Paradigma Estrutural, como Pascal e C por exemplo, a entidade que possui características semelhantes
aos métodos são as funções, estas são pequenas partes do código com um propósito bem definido.
```
Anatomia de um Método em Java

```
1 {visibilidade} {modificador de acesso} ***{tipo de retorno} {nome}*** ( {parametros} )
2 {
3   ***{corpo do método}***
4 }
```

Exemplos de Métodos em Java

```
1 int calculaQuadradoDeDois()
2 {
3   return 2*2;
4 }
```

```
1 double calculaQuadradoDoNumero(double numero)
2 {
3   return (numero * numero);
4 }
```
    