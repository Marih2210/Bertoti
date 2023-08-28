<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
    </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Encapsular uma familia de algoritmos e tornar intercambiável através de polimorfismo</td>
        <td>Herança que duplica código</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Alto acoplamento</td>
        <td>Permite definir um mecanismo de assinatura para notificar vários objetos sobre quaisquer eventos que ocorram com o objeto que eles estão observando</td>
        <td>Evita o Alto acoplamento e torna o código baixo acoplado, evitando que fiquem de certo modo indistinguíveis</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Código de grande complexidade, difícil manutenção</td>
        <td>Usado quando é necessário implementar uma estrutura de objeto semelhante a uma árvore</td>
        <td>Evita a duplicação de código, usando o polimorfismo, e usa recursão, o que é essencial para a estrura em árvore, para separar o problema em partes, e resolve cada parte chamando uma cópia de si mesma.</td>
    </tr>
</table>

