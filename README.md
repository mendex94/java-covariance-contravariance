# Covariância e Contravariância em Java

## Covariância

Covariância é a capacidade de um tipo de ser substituído por um tipo mais específico. Em Java, a covariância é permitida em arrays e genéricos.

### Covariância em Arrays

```java
public class CovarianceInArrays {
    public static void main(String[] args) {
        Number[] numbers = new Integer[10];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        numbers[8] = 90;
        numbers[9] = 100;
    }
}
```

### Covariância em Genéricos

```java
import java.util.ArrayList;
import java.util.List;

public class CovarianceInGenerics {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Integer>();
        // numbers.add(10); // Erro de compilação
    }
}
```

## Contravariância

Contravariância é a capacidade de um tipo de ser substituído por um tipo mais genérico. Em Java, a contravariância é permitida em genéricos.

### Contravariância em Genéricos

```java
import java.util.ArrayList;
import java.util.List;

public class ContravarianceInGenerics {
    public static void main(String[] args) {
        List<? super Integer> numbers = new ArrayList<Number>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);
    }
}
```

## Referências

- [Covariance and Contravariance in Java](https://www.baeldung.com/java-covariance-contra-variance)