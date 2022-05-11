# Entendendo os Métodos

## 1. Métodos

- O que são?
- Anatomia de um Método em Java?
- Sobrecarga
- Retorno




- **O que são?**

Podemos dizer que um Metodo é uma parte, bem definida, do código, responsável por uma atividade específica.
Ele deve pertencer a uma classe e devem refletir uma  acao ou comportamento desta classe, ou seja, um método
é uma sub-parte do código que tem uma competencia.

``` 
Em linguagens de Paradigma Estrutural, como Pascal e C por exemplo, a entidade que possui características semelhantes
aos métodos são as funções, estas são pequenas partes do código com um propósito bem definido.
```

- **Anatomia de um Método em Java**

```
1 [visibilidade] [modificador de acesso] [tipo de retorno] [nome] ( [parametros] )
2 {
3   [corpo do método]
4 }
```
Importante ressaltar que quando nos referirmos a assinatura de um método, estamos nos referindo apenas ao seu nome
e seus parâmetros.

Onde:

[visibilidade] pode ser: public, protected, private

[modificador de acesso] pode ser: abstract

[tipo de retorno] pode ser: qualquer tipo de dado em Java

[nome]: poder ser qualquer um definido como padrão ja estudado

[parametros] pode ser qualquer dupla tipo + variável

[exceções] pode ser: definida pelo usuário ou já definidas

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

- **Sobrecarga**    