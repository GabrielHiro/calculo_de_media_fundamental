# calculo_de_media_fundamental


### de: Gabriel Hiro Furukawa👨‍💻

# 📑 **ALGORITMO**

  inicio
  
    enquanto i ==1 faça
      exibir("Digite seu RA: ");
      ler ra;
      se ra dor diferente de 0 faça
        exibir("Digite a primeira nota: ");
        ler nota_um;

        exibir("Digite a segunda nota: ");
        ler nota_dois;

        exibir("Digite a terceira nota: ");
        ler nota_tres;

        result = (nota_um + nota_dois + nota_tres) / 3;

        se result >= 8 faça
          exibir("APROVADO!");
        fimse;

        senão se result >= 6 e < 8 faça
          exibir("RECUPERAÇÃO!");
        fimsenão;

        senão
          exibir("REPROVADO!");
        fimsenão;
      fimse;

      senão
        exibir("RA INVALIDO");
        i = 0;
      fimsenão;
  fim


		
# ⛏ **FLUXOGRAMA**

![fluxograma](https://github.com/GabrielHiro/calculo_de_media_fundamental/blob/22b54abcb5c2fb1edd6f49f73cef13f84a63b9f2/fluxograma_media_fundamental.svg)

#### 📑Licença MIT
#### 🕑Última atualização 22/05/2022
