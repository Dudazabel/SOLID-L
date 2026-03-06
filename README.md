# Princípio L de SOLID

O princípio L, conhecido como Liskov Substitution Principle, afirma que as classes derivadas devem ser substituíveis por suas classes base sem alterar o comportamento desejado do programa. Ou seja, se uma classe S é uma subclasse de T, então objetos da classe T devem poder ser substituídos por objetos da classe S sem afetar as propriedades desejadas do programa.

Este princípio é crucial para garantir que o código seja mais modular e que as alterações feitas em subclasses não quebrem o comportamento existente.

# Refatoração do programa de cálculo de frete

Recentemente, realizamos uma refatoração no programa de cálculo de frete para cumprir com o Princípio L de SOLID. A refatoração envolveu a revisão das classes que calculam o frete e a implementação de novas subclasses que acomodam diferentes métodos de cálculo. Isso não só melhorou a clareza do código, mas também facilitou a adição de novos métodos no futuro, sem precisar alterar o código base, garantindo assim um sistema mais flexível e extensível.

#Erro no código original

Ele altera o resultado esperado pela superclasse, fazendo com que mesmo que seja passado um valor de frete por parâmetro ele seja alterado para 0, ferindo assim o princípio.
