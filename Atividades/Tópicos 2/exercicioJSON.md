## Respostas aos exercícios sobre JSON

#### 1. Quais são os valores (“literais”) admitidos em JSON? Não confunda com aqueles escritos entre aspas (sequências de caracteres).
Em um JSON com dito é possível "criar" qualquer valor que é admitivel, mas em sua natureza JSON aceita os tipos comuns à base de dados, podendo ser:
- **String  |  Number  | Object | Array | True | False | null**


#### 2. Qual é o MIME type para arquivo contendo dados no formato JSON?
JSON tem o MIME type ***application/json***.  


#### 3. Você consegue identificar o problema no arquivo JSON abaixo?
O único problema é o uso do ***nil*** (marcado em vermelho), deveria ter sido usado o valor ***null***.

```json
{
    "a":[1,3], 
    "bool": true,
    "null": nil,
    "n":123,
    "o":{"a":"b","c":"d" },
    "str":"a"
}
```


#### 4. Qual seria um possível arquivo JSON contendo dados correspondentes a uma instância de um objeto da classe Bicycle (disponível [aqui](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)) ?

```json
type Bicycle {
    "cadence": null, 
    "gear": null,
    "speed": null
}
```


#### 5. Qual seria a representação em JSON de um objeto contendo as seguintes propriedades (e valores correspondentes)? Propriedades seguem em negrito.
1. lista de **cidades**: Goiânia e Trindade;  
1. **salada**: alface;
1. **altura**: 2,3;
1. **sabor** preferido: (nenhum valor fornecido para esta propriedade);

```json
{
    "cidades": ["Goiânia", "Trindade"], 
    "salada": "alface",
    "altura": 2.3,
    "sabor": null
}
```
    
