# Java Interfaces: 3 Main Types

Java me mainly 3 types ke interfaces discuss kiye jaate hain:

1. Normal Interface
2. Functional Interface (SAM)
3. Marker Interface

## 1) Normal Interface

Jisme 2 ya 2 se zyada abstract methods hote hain.

Example:

```java
interface ABC {
    void show();
    void config();
}
```

Yaha:
- 2 methods hain
- Ye normal interface hai
- Isme kuch special nahi - bas normal design contract hai

## 2) Functional Interface (SAM)

SAM = Single Abstract Method

Matlab:
- Interface me sirf ek hi abstract method ho

Example:

```java
interface ABC {
    void show();
}
```

Ye functional interface hai.

Isko functional kyun bolte hain?
- Kyuki Java 8 ke baad ispe hum lambda expressions use kar sakte hain
- Isme ek hi behavior define hota hai

Isko formally mark karne ke liye annotation use karte hain:

```java
@FunctionalInterface
interface ABC {
    void show();
}
```

Agar galti se 2 method likh doge:

```java
void show();
void run();
```

Compiler error dega.

## 3) Marker Interface

Interface jisme koi bhi method nahi hota.

Example:

```java
interface MyMarker {
}
```

Aisa blank interface kyun banate hain?

### Real Use Case: Serialization

Serialization = Object ko file me save karna.

Example:
- Game chal raha hai
- Game object me values:
  - Score = 100
  - Level = 3
  - Health = 80

Agar tum game close karte ho aur baad me resume karna chahte ho:
- Object ko file me save karna padega
- Isko bolte hain Serialization

Java me:

```java
import java.io.Serializable;

class Game implements Serializable {
}
```

Serializable ek marker interface hai.

Isme koi method nahi hota.

Par iska matlab hai:
- Ye object file me save ho sakta hai
- JVM ko permission milti hai

### Important Point

By default:
- Har object serializable nahi hota
- Serializable marker interface implement karna padta hai

## Summary Table

| Type | Methods Count | Purpose |
| --- | --- | --- |
| Normal Interface | 2 or more | General contract |
| Functional Interface (SAM) | Exactly 1 | Lambda support |
| Marker Interface | 0 | Special permission / tagging |

## Extra Important (Java 8 Note)

Java 8 ke baad interface me:
- Default methods allowed
- Static methods allowed

But SAM ka rule sirf abstract methods pe apply hota hai.
